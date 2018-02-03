
public class ItemMain {

	public static void main(String[] args) {
		Item i1 = new Item();
		i1.Display();
		
		Item i2 = new Item(1,"item1",10.5F,5);
		i2.Display();

		Item i3 = new Item();
		i3.Input();
		i3.Display();
	}

}
