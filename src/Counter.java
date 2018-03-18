
public interface Counter {
	public void setCounter(Integer i);
	
	public void increaseCounterByOne();
	
	public void decreaseCounterByOne();
	
	public Integer returnCurrentCount();
	
	public String toString();
	
	public Boolean isZero();
}
