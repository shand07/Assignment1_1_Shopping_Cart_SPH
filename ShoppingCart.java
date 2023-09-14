import java.util.Arrays;

/**
 * 
 * @author shand
 *
 */

public class ShoppingCart
{
	
	
	ArrayBag myArrayBag = new ArrayBag();//ArrayBag used for Methods
	
	

	/**
	 * 
	 * @return the amount of items in the cart
	 */
	public int getCurrentSize()
	{
	
		return myArrayBag.getCurrentSize();
		
	}
	
	/**
	 * 
	 * @return checks if the cart is empty or not
	 */
	public boolean isEmpty()
	{
		return myArrayBag.isEmpty();
	}
	
	/**
	 * 
	 * @param newEntry adds an item to the cart
	 * @return true or false if adding an item was successful
	 */
	public boolean add(Item newEntry)
	{
		return myArrayBag.add(newEntry);
	}
	
	/**
	 * 
	 * @param anEntry removes an item from the cart
	 * @return true or false if the removing as successful
	 */
	public boolean remove(Item anEntry)
	{
		return myArrayBag.remove(anEntry);
	}
	
	/**
	 * Deletes all the items from the cart
	 */
	public void clear()
	{
		myArrayBag.clear();
	}
	
	
	/**
	 * Counts the Items in the bag
	 * @param anEntry The item in the shopping cart to be counted
	 * @return The amount of items counted
	 */
	public int getFrequencyOf(Item anEntry)
	{
		return myArrayBag.getFrequencyOf(anEntry);
	}
	
	
	/**
	 * Gets the total value of our shopping cart
	 * @return the total value of items in the shopping cart.
	 */
	
	public double getTotalValue()
	{
		double totalPrice = 0;
		Object[] itemArray = myArrayBag.toArray();
		for(Object i: itemArray) 
		{
		
		
		totalPrice+=((Item) i).getPrice();
			
		}
		return totalPrice;
	}
	
	
}
