package p2;
public class otherpackage
{
	public otherpackage()
	{
		p1.protection p = new p1.protection();
		System.out.println("other package constructor");
		System.out.println("n_pub=" +p.n_pub);
	}
}