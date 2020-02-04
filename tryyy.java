package pancham;

public class tryyy {

	public static void main(String[] args) throws Exception {
		try
		{
			divide();
		}
		catch(Exception e)
		{
			System.out.println("divide not possible");
		}
		Thread.sleep(10000);
		add();
		Thread.sleep(10000);
		multiply();

	}
	public static void divide()
	{
		int a=10;
		int b=0;
		int c=a/b;
		System.out.println("divide is "+c);
	}
	public static void add()
	{
		int a=10;
		int b=202;
		int c=a+b;
		System.out.println("add is "+c);
	}
	public static void multiply()
	{
		int a=10;
		int b=202;
		int c=a*b;
		System.out.println("multiply is "+c);
	}


}
