package JavaLab;
import com.test.*;
class SuperDudeException1 extends Exception implements test2.test3{
	protected int al;
	
	SuperDudeException1(){
		
	}
	public SuperDudeException1(String str) {
		super(str);
		
		}
	public void test3test() {
		System.out.println("Testing test interface");
	}
 
}


 class examProg1 extends SuperDudeException1 implements test2{
	 private int a;
	 
	SuperDudeException1 xcep = new SuperDudeException1();
	void Dude(String s) throws SuperDudeException1{
		
		if(s!="Dude") {
			System.out.println("Oh no");
			throw new SuperDudeException1();
		}
		else System.out.println("Dude");
	}
	void SetVal() {
		this.a=10;
		super.al=10;
	}
	
}
 public class examProg{
	 public static void main(String args[]) {
		 try {
			examProg1 all = new examProg1();
			System.out.println(test2.test());
			all.al=10;
			all.Dude("hi");
		 }
		 catch(SuperDudeException1 e) {
			 System.out.println("here "+e);
		 }
	 }
	 
 }
