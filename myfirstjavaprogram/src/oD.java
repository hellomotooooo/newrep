class A
{
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSname() {
		return name;
	}
	public void setSname(String name) {
		this.name = name;
	}
	
	
}
/*class B extends A
{
	public void mad()
	{
		
		System.out.print("in B");
		super.mad();
	}
} */
/*class C extends B
{
	public void pad()
	{
		System.out.print("in C");
	}
}
*/
public class oD {

	public static void main(String[] args) {
		
	A c1 = new A();
	c1.setSname("Rai");
	System.out.println(c1.getSname());
	}
}

