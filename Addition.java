package classes;

    public class Addition {
	int a =10;   //instance variable
	public void local()
	{
		int b=20;  //local variable
	    int c =a+b;
	    int d =a-b;
	 System.out.println("addition of 2 numbers:c="+c);
	 System.out.println("sub of 2 numbers:c="+d);
	}
	public static void main(String[] args) 
	{
			System.out.println("Hello java");
			Addition s = new Addition();
			s.local();
			
	}
	
}
