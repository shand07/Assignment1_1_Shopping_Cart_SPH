
public class Application 
{
	public static void main(String args[])
	{
		ShoppingCart myShoppingCart = new ShoppingCart();
		
		Item carrot = new Item("Carrot");
		
		Item milk = new Item("Milk");
		
		Item soap = new Item("Soap");
		
		Item drPepper = new Item("Dr. Pepper");
		
		Item jalapinoCheetos = new Item("Jalapino Cheetos");
		
		jalapinoCheetos.setPrice(2.50);
		
		drPepper.setPrice(5);
		
		soap.setPrice(1.50);
		
		carrot.setPrice(4.50);
		
		milk.setPrice(3.50);
		
		myShoppingCart.add(milk);
		
		System.out.println("You've added milk to your cart.");
		
		myShoppingCart.add(milk);
		
		System.out.println("You've added milk to your cart.");
		
		myShoppingCart.add(carrot);
		
		System.out.println("You've added a carrot to your cart.");
		
		myShoppingCart.add(soap);
		
		System.out.println("You've added a soap to your cart.");
		
		myShoppingCart.add(drPepper);
		
		System.out.println("You've added a Dr.Pepper to your cart.");
		
		myShoppingCart.add(jalapinoCheetos);
		
		System.out.println("You've added Jalapino Cheetos to your cart.");
		
		System.out.printf("The total value in your cart is "+"%5.2f"+"$.", myShoppingCart.getTotalValue());
		
		System.out.println();
		
		System.out.println("You currently have "+myShoppingCart.getFrequencyOf(milk)+ " milks in your cart.");
		
		System.out.println("You currently have "+myShoppingCart.getCurrentSize()+" items in your cart.");
		
		myShoppingCart.remove(milk);
		
		System.out.println("You have removed a milk from your cart.");
		
		System.out.printf("The total value in your cart is "+"%5.2f"+"$.", myShoppingCart.getTotalValue());
		
		System.out.println();
		
		System.out.println("Your cart currently contains:");
		for(Object i: myShoppingCart.myArrayBag.toArray())
		{
			System.out.println(i.toString());
		}
		
		myShoppingCart.remove(drPepper);
		
		System.out.println("You have removed a Dr Pepper from your cart.");
		
		myShoppingCart.remove(jalapinoCheetos);
		
		System.out.println("You have removed some Jalapino Cheetos from your cart.");
		
		myShoppingCart.remove(carrot);
		
		System.out.println("You have removed a carrot from your cart.");
		
		myShoppingCart.remove(soap);
		
		System.out.println("You have removed some soap from your cart");
		
		System.out.printf("The total value in your cart is "+"%5.2f"+"$.", myShoppingCart.getTotalValue());
		
		System.out.println();
		
		System.out.println("Your cart currently contains:");
		for(Object i: myShoppingCart.myArrayBag.toArray())
		{
			System.out.println(i.toString());
		}
		
		myShoppingCart.clear();
		
		myShoppingCart.myArrayBag.toArray();
		System.out.println("You've emptied your cart, there are "+myShoppingCart.getCurrentSize()+" items in your cart.");
		
		System.out.println("Is your cart empty? "+ myShoppingCart.isEmpty()+".");
		
		System.out.printf("The total value in your cart is"+"%5.2f"+"$.", myShoppingCart.getTotalValue());
		
		
	}
	
	
}
