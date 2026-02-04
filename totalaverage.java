class  totalaverage
{
	static int a;
	static int b;
	static int total;
	static double average;
	static void calculate()
	{
		total=a+b;
		average=total/2.0;
	}
	public static void main(String args[])
	{
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		calculate();
		System.out.println("First num:"+a);
	    System.out.println("Second num:"+b);
		System.out.println("Total:"+total);
		System.out.println("Average:"+average);
	}
}
