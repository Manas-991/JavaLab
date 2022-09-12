package JavaLab;
import com.test.Cube;
import java.util.*;

class Basic{
	int a=105;
	public void getVal() {
		System.out.println(a);
	}
}
class Normal extends Basic{
	int a=1000;
	public void getVal(){
		System.out.println("Super is "+super.a+" but this class is "+ this.a);
	}
	public int getVal(double a) {
		return (int)a;
	}
}
class Low extends Basic{
	int a;
	public Low(int a) {
		this.a=a;
	};
	void getLow() {
		System.out.println("The low value is "+a);
	}
}
class Avg extends Normal  {
	int a=99;
	public Avg(int a) {
		if(a==this.a) {
			getVal();
		}
	}
}

public class Allclass {
	
		
	public static void main(String[] args) {
		Avg avg = new Avg(99);
		Low low = new Low(5);
		low.getLow();
		Normal a= new Normal();
		Basic b=new Basic();
		b.getVal();
		a.getVal();
		a.getVal(1.00);
		System.out.println(a.getVal(1.6));
		int v=Cube.cube(4);
		System.out.println(v);
		
	}
}



