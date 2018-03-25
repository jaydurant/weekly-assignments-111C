
public class ShoppingCartDemo {

	public static void main(String[] args) {
		StoreItem[] items =  { new StoreItem("chips",10),new StoreItem("carrots",40),new StoreItem("cereal",5)};
		
		BagInterface<StoreItem> shoppingCart = new ShoppingCart<>();
		Integer totalCost = 0;
		
		for(int i = 0 ; i < items.length ;i++) {
			shoppingCart.add(items[i]);
			totalCost += items[i].getCost();
		}
		
		System.out.println("Total Cost: " + totalCost);
		System.out.println("Shopping cart is emptry: "+ shoppingCart.isEmpty());
		
		System.out.println("Cost of Item Removed: " + shoppingCart.remove().getCost());
		
		System.out.println("Shopping cart size: " + shoppingCart.getCurrentSize());
		
		System.out.println("Shopping cart item removal: " + shoppingCart.remove(items[0]));
		System.out.println("Frequency of :" + shoppingCart.getFrequencyOf(items[1]));
		System.out.println("Contains:" + shoppingCart.contains(items[1]));
		System.out.println(shoppingCart.toArray());
		
		
		shoppingCart.clear();
		
		System.out.println("TotalSize: " + shoppingCart.getCurrentSize());
		
	} 

}
