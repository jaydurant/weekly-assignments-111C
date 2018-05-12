package queues;

public class Customer{
	private int arrivalTime;
	private int transactionTime;
	private int customerNumber;
	
	public Customer(int arrival, int transaction, int num){
		arrivalTime = arrival;
		transactionTime = transaction;
		customerNumber = num;
	}
	
	public int getArrivalTime(){
		return arrivalTime;
	}
	
	public int getTransactionTime(){
		return transactionTime;
	}
	
	public int getCustomerNumber(){
		return customerNumber;
		
	}
	
}
