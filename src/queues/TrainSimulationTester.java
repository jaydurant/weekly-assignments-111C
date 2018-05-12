package queues;

public class TrainSimulationTester {

	public static void main(String[] args) {
		TrainSimulation ts = new TrainSimulation();
		ts.simulate(60, 5, 12, 0.40);
		System.out.println("trainsimulation");
	}

}
