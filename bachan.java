package pancham;



 class amitab
 {
	 public void Don()
	 {
		 System.out.println("Don ko pakad na mushkil nahi");
	 }

	
}
 
 class Sharukh extends amitab
 {
	 public void Don()
	 
	 {
			super.Don();
		 System.out.println("naa mumkin hain");
	 }
 }
 class anil extends Sharukh
 {
	 public void Don()
	 
	 {
	super.Don();
		 System.out.println("rgrgtrnkjchjsk");
	 }
 }
public class bachan
{
 public static void main(String[] args)
 {
	 anil b=new anil();
	 b.Don();
	 
 }
}