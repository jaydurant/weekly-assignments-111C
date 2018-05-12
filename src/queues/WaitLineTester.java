package queues;

public class WaitLineTester {
	public static void main(String args[]){
            WaitLine test = new WaitLine();
            test.simulate(10, 0.7, 3);
            test.displayResults();
            test.reset();
            test.displayResults();
    }
}
