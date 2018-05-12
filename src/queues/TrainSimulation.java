package queues;

import java.util.ArrayList;
import java.util.HashMap;

public class TrainSimulation {
	private ArrayList<Queue<Passenger>> stationQueues = new ArrayList<>();
	private TrainStation[] stations = new TrainStation[5];
	private int currentStation = 1;
	private int trainLimit = 100;
	private int currentNumberOfTrainPassengers = 0;
	private HashMap<Integer,ArrayList<Passenger>> stationExitMap = new HashMap<>();
	
	public void simulate(int duration,int numberOfStations, int maxTripTime,double probability) {

		generateStations(numberOfStations,maxTripTime);
		currentStation = 0;
		int currentStationDuration = stations[currentStation].getTimeToStation();
		
		for(int clock = 0; clock < duration && currentStation < 5 ; clock++) {
			if(Math.random() < probability) {
				int entryStation = (int) (Math.random() * (numberOfStations - currentStation)) + currentStation;
				int exitStation = (int)(Math.random() * (numberOfStations - currentStation)) + currentStation;
				if(exitStation == 5) {
					exitStation = 4;
				}
				
				if(entryStation  == 5) {
					entryStation = 4;
				}

				Passenger newPassenger = new Passenger(exitStation);

				stationQueues.get(entryStation).enqueue(newPassenger);
			}
			
			if(clock == currentStationDuration) {
				System.out.println(currentStation);
				ArrayList<Passenger> stationExitingPassangers = stationExitMap.get(currentStation);
				System.out.println(currentStation);
				stationExitMap.put(currentStation, new ArrayList<Passenger>());
				currentNumberOfTrainPassengers -= stationExitingPassangers.size();
				
				Queue<Passenger> currentStationQueue= stationQueues.get(currentStation);
				
				while (!currentStationQueue.isEmpty() && currentStation < 5 && currentNumberOfTrainPassengers < trainLimit) {
					Passenger passenger = currentStationQueue.dequeue();
					int exitStation = passenger.getExitStation();
					System.out.println(exitStation);
					ArrayList<Passenger> stationExitPassengerList = stationExitMap.get(exitStation);

					stationExitPassengerList.add(passenger);
					
					stationExitMap.put(exitStation, stationExitPassengerList);
				}
				
				currentStationDuration += stations[currentStation].getTimeToStation();	
			}
			
			currentStation++;

		}
		
	}
	
	private void generateStations(int stationNumber, int maxTripTime) {
		try {
		stations = new TrainStation[stationNumber];
		for(int i = 0; i < stationNumber ; i++) {
			int randomTime = (int)(Math.random() * maxTripTime + 1);
			stations[i] = new TrainStation(i,randomTime);
			stationExitMap.put(
					i, 
					new ArrayList<Passenger>());
			stationQueues.add(new Queue<Passenger>());
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private class Passenger{
		private int exitStation;
		
		private Passenger(int exitStation) {
			this.exitStation = exitStation;
		}

		public int getExitStation() {
			return exitStation;
		}

		public void setExitStation(int exitStation) {
			this.exitStation = exitStation;
		}
		
		
	}
	
	
	private class TrainStation{
		private int stationId;
		private int timeToStation;
		
		private TrainStation(int id, int time) {
			stationId = id;
			timeToStation = time;
		}

		public int getStationId() {
			return stationId;
		}

		public void setStationId(int stationId) {
			this.stationId = stationId;
		}

		public int getTimeToStation() {
			return timeToStation;
		}

		public void setTimeToStation(int timeToStation) {
			this.timeToStation = timeToStation;
		}
		
		
	}
}
