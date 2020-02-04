package pancham;

public class poly 



{
	int a=50;
	int b=60;
	public void Don()
	 {
		 System.out.println("Don ko pakad na mushkil nahi");
	 }
	
	public void Don(int a)
	 {
		 System.out.println("naa mumkin hain");
		 System.out.println(a);
	 }
	public void Don(int a,int b)
	 {
		 System.out.println("guuhhk nahi");
		 System.out.println(a+" "+this.b);
	 }
	


public static void main(String[] args) {
		poly p=new poly();
		p.Don();
		p.Don(10);
		p.Don(10,20);

	}
}


