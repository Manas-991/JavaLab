package JavaLab;
class check1 {
	int a;
	protected int b;
	check1(){
		
	}
	check1(int a){
		this.a=a;
	}
	void method(check1 alt) {
		if(alt.a==a) {
			System.out.println(alt.a);
		}
		else
			System.out.println("pajjya");
	}
}
class check2 extends check1 {
 check2(){
	
	System.out.println(this.b);
 }
}
public class DistinctClass {
	
	public static void main(String args[]) {
		check2 all = new check2();
		all.b=10;
		check1 s=new check1(5);
		check1 s1=new check1(5);
		s1.method(s);
	}
}
