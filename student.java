class student 
{
	int rollno;
	String name;
	String branch;
	int marks;
	void getdata(int rollno,String name,String branch,int marks)
	{
		this.rollno=rollno;
		this.name=name;
		this.branch=branch;
		this.marks=marks;
	}
	void display()
	{
		System.out.println("rollno:"+rollno);
		System.out.println("name:"+name);
		System.out.println("branch:"+branch);
		System.out.println("marks:"+marks);
	}
	public static void main(String args[])
	{
		student s1=new student();
		student s2=new student();
	    s1.getdata(1,"ABC","CSE",100);
	    s2.getdata(2,"DEF","CSE",90);
		s1.display();
		s2.display();
	}
}

	
		