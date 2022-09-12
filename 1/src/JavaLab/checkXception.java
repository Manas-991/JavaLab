package JavaLab;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.File;
class SuperDudeException extends Exception{
	public SuperDudeException(String str) {
		super(str);
	}
}
public class checkXception {
	static void baby(String s) throws SuperDudeException{
		if(s!="Dude") {
			throw new SuperDudeException("No dude");
		}
		else
			System.out.println("Dude");
	}
	public static void main(String args[]) {
		String fil1 = "what.txt";
	try {
		int a=0;
		int b=10/a;
	}
	catch(ArithmeticException e) {
		System.out.print("Arithmetic exception");
	}
	finally {
		System.out.println("Hello");
	}
	try {
		File file=new File(fil1);
		FileInputStream stream=new FileInputStream(file);
	}
	catch(FileNotFoundException ex) {
		System.out.println("File not found");
	}
	try {
		baby("bro");
	}
	catch(SuperDudeException ext) {
		System.out.println("Caught exception is "+ext);
	}
	/*catch(ArithmeticException e) {
		System.out.print("Arithmetic exception");
	}*/
}
}
