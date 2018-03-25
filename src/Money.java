
public class Money {
	private String type;
	private Float amount;
	
	public Money(String type, Float amount) {
		this.type = type;
		this.amount = amount;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Float getAmount() {
		return amount;
	}
	public void setAmount(Float amount) {
		this.amount = amount;
	}
	
}
