class A 
{
	void callme()
	{
		System.out.println("calling A's callme method:");
	}
}
class B extends A
{
	void callme()
	{
		System.out.println("calling B's callme method:");
	}
}
class C extends A
{
	void callme()
	{
		System.out.println("calling C's callme method:");
	}
	void callme1()
	{
		System.out.println("calling C's callme1 method:");
	}
}
class Dispatch
{
	public static void main(String args[])
	{
		A a = new A();
		B b = new B();
		C c = new C();
		/*A r;
		r=a;
		r.callme();
		r=b;
		r.callme();
		r=c;
		r.callme();
		*/
		A r;
		r=new A();
		r.callme();
		r=new B();
		r.callme();
		r=new C();
		r.callme();
	}
}

