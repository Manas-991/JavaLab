
package JavaLab;
import java.util.Scanner;
public class Lab2 {
public static void main(String[] args) {
	System.out.println("Enter Size of Array");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int a[]= new int[n];
	System.out.println("Enter elements of Array");
	for(int i=0;i<n;i++) {
	a[i]=sc.nextInt();	
	}
	int sum=0;
	for(int i=0;i<n;i++)
		sum+=a[i];
	System.out.println("The sum is "+sum);
}
}
