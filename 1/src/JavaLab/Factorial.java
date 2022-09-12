package JavaLab;
import java.util.Scanner;
public class Factorial {
	public static int fact(int a) {
		int prod=1;
		for(int i=2;i<=a;i++) prod=prod*i;
		return prod;
	}
	public static void primen(int a) {
		int f=0;
		for(int i=2;i<a/2;i++) {
				if(a%i==0) f++;
		if(f==0) { 
			System.out.println(a);
		}
		f=0;
		}
		//return 0;
		}
	public static int farhenheitToCelsius(float a) {
	int c = (int)((a-32)*(0.5555));
	return c;
	}
	public static void main(String[] args) {
		//int n;
		System.out.println("Enter number to factorial");
		//System.out.println();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Factorial is " + fact(n) );
		System.out.println("Enter till where to prime");
		int f = sc.nextInt();
		System.out.println("Prime numbers are");
		for(int i=2;i<=f;i++) primen(i);
		System.out.println("Farhenheit to celsius"+farhenheitToCelsius(84));
		//primen(5);
	}

}
