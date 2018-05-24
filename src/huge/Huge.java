package huge;

import java.util.*;

public class Huge 
{
	private HugeDequeInterface<Integer> largeInt;
	private int size;
	final int MAX_SIZE = 50;

	public Huge() 
	{
		largeInt = new HugeDeque<>();
		size = 0;
	}

	public Huge(String largeIntText) 
	{
		largeInt = new HugeDeque<>();
		size = 0;
		if (largeIntText.length() > MAX_SIZE) 
		{
			try 
			{
				int c = Math.addExact(Integer.MAX_VALUE, 1);
			} 
			catch (ArithmeticException e) 
			{
				System.out.println("Integer too large.");
				return;
			}
		} 
		else 
		{
			size = largeIntText.length();
			int count = 0;
			while (count < largeIntText.length()) 
			{
				if (!Character.isDigit(largeIntText.charAt(count))) 
				{
					System.out.println("Invalid input detected, closing.");
					largeInt.clear();
					size = 0;
					return;
				} 
				else 
				{
					Character a = largeIntText.charAt(count);
					int n = Character.getNumericValue(a);
					largeInt.addToBack(n);
				}
				count++;
			}
		}
	}

	public void setLargeInt(String largeIntText) 
	{
		if (largeIntText.length() > MAX_SIZE) 
		{
			try 
			{
				int c = Math.addExact(Integer.MAX_VALUE, 1);
			} 
			catch (ArithmeticException e) 
			{
				System.out.println("Integer too large.");
				return;
			}
		} 
		else 
		{
			size = largeIntText.length();
			int count = 0;
			while (count < largeIntText.length()) 
			{
				if (!Character.isDigit(largeIntText.charAt(count))) 
				{
					System.out.println("Invalid input detected, closing.");
					largeInt.clear();
					size = 0;
					return;
				} 
				else 
				{
					Character a = largeIntText.charAt(count);
					largeInt.addToBack(Integer.parseInt(a.toString()));
				}
				count++;
			}
		}
	}

	public String stringLargeInt() 
	{
		String intString = "";
		int count = 0;
		while (count < size) 
		{
			String add = largeInt.removeFront().toString();
			intString = intString.concat(add);
			Character a = add.charAt(0);
			largeInt.addToBack(Integer.parseInt(a.toString()));
			count++;
		}
		return intString;
	}

	@SuppressWarnings("unlikely-arg-type")
	public void readLargeInt() 
	{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a large integer of less than 50 digits, using only numbers.");
		String input = in.next();
		largeInt.clear();
		size = 0;
		if (input.length() > MAX_SIZE) 
		{
			try 
			{
				int c = Math.addExact(Integer.MAX_VALUE, 1);
			} 
			catch (ArithmeticException e) 
			{
				System.out.println("Integer too large.");
				return;
			}
		} 
		else 
		{
			int count = 0;
			while (count < input.length()) 
			{
				if (!Character.isDigit(input.charAt(count))) 
				{
					System.out.println("Invalid input detected, closing.");
					largeInt.clear();
					size = 0;
					return;
				} 
				else if (Character.getNumericValue(input.charAt(count)) == 0 && largeInt.isEmpty()) 
				{
					continue;
				} 
				else 
				{
					largeInt.addToBack(Character.getNumericValue(input.charAt(count)));
					size++;
				}
				count++;
			}
			System.out.println(input + " was successfully read.");
		}
	}
	
	public void displayLargeInt() 
	{
			int count = 0;
			while (count < size)
			{
				int store = largeInt.removeFront();
				if (store == 0 && largeInt.isEmpty()) 
				{
					System.out.print(store);
					largeInt.addToBack(store);
				} 
				else 
				{
					System.out.print(store);
					largeInt.addToBack(store);
				}
				count++;
			}
			System.out.println();
	}
	
	public static Huge addHugeInt(Huge n, Huge x)
	{
		int count = 0;
		Huge sum = new Huge();
		int next = 0;
		int nextDigit = 0;
		while (count < n.size || count < x.size)
		{
			if (count >= x.size)
			{
				next = n.largeInt.removeBack();
				sum.largeInt.addToFront(next);
				n.largeInt.addToFront(next);
				sum.size++;
			}
			else if (count >= n.size)
			{
				next = x.largeInt.removeBack();
				sum.largeInt.addToFront(next);
				x.largeInt.addToFront(next);
				sum.size++;
			}
			else
				{
				int n1 = n.largeInt.removeBack();
				int x1 = x.largeInt.removeBack();
				next = n1 + x1 + nextDigit;
				nextDigit = next/10;
				sum.largeInt.addToFront(next);
				n.largeInt.addToFront(n1);
				x.largeInt.addToFront(x1);
				sum.size++;
				}
			count++;
		}
		if (sum.largeInt.isEmpty())
		{
			sum.largeInt.addToFront(0);
			return sum;
		}
		else if (sum.size > sum.MAX_SIZE)
		{
				try 
				{
					int c = Math.addExact(Integer.MAX_VALUE, 1);
				} 
				catch (ArithmeticException e) 
				{
					System.out.println("Integer too large.");
				}
		}
		return sum;
	}
	
	public static Huge multiplyHugeInt(Huge n, Huge x)
	{
		int count = 0;
		Huge sum = new Huge();
		if (x.stringLargeInt().equals("0"))
		{
			sum.largeInt.addToFront(0);
			return sum;
		}
		else if (n.stringLargeInt().equals("0"))
		{
			sum.largeInt.addToFront(0);
			return sum;
		}
		else if (x.size <= n.size)
		{
			while (count < x.size)
			{
				Huge nextDigitPlace = new Huge();
				int x1 = x.largeInt.removeBack();
				for (int i = 0; i < n.size-count; i++)
				{
					int n1 = n.largeInt.removeBack();
					nextDigitPlace.largeInt.addToFront(x1*n1);
					n.largeInt.addToFront(n1);
					nextDigitPlace.size++;
				}
				if (count >= 1)
				{
					for (int j = 0; j < count; j++)
					{
						nextDigitPlace.largeInt.addToBack(0);
						nextDigitPlace.size++;
					}
				}
				int k = 0;
				int nextDigitAdd = 0;
				while (k < nextDigitPlace.size)
				{
					if (k >= sum.size)
					{
						sum.largeInt.addToFront(nextDigitPlace.largeInt.removeBack());
					}
					int nextDigitOnes = nextDigitPlace.largeInt.removeBack();
					int addSum = sum.largeInt.removeBack() 
							+ nextDigitOnes%10 
							+ nextDigitAdd;
					sum.largeInt.addToFront(addSum);
					nextDigitAdd = nextDigitOnes/10;
				}
				x.largeInt.addToFront(x1);
				count++;
			}
			return sum;
		}
		else
		{
			while (count < n.size)
			{
				Huge nextDigitPlace = new Huge();
				int n1 = n.largeInt.removeBack();
				for (int i = 0; i < x.size-count; i++)
				{
					int x1 = x.largeInt.removeBack();
					nextDigitPlace.largeInt.addToFront(x1*n1);
					x.largeInt.addToFront(x1);
					nextDigitPlace.size++;
				}
				if (count >= 1)
				{
					for (int j = 0; j < count; j++)
					{
						nextDigitPlace.largeInt.addToBack(0);
						nextDigitPlace.size++;
					}
				}
				int k = 0;
				int nextDigitAdd = 0;
				while (k < nextDigitPlace.size)
				{
					if (k >= sum.size)
					{
						sum.largeInt.addToFront(nextDigitPlace.largeInt.removeBack());
					}
					int nextDigitOnes = nextDigitPlace.largeInt.removeBack();
					int removeInt = sum.largeInt.removeBack();
					int addSum = removeInt
							+ nextDigitOnes%10 
							+ nextDigitAdd;
					sum.largeInt.addToFront(addSum);
					nextDigitAdd = nextDigitOnes/10;
				}
				n.largeInt.addToFront(n1);
				count++;
			}
			return sum;
		}
	}
}
