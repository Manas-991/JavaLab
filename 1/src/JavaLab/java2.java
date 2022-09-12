package JavaLab;
import java.util.Scanner;
public class java2 {

	public static void main(String[] args) {
		System.out.println("Enter size of 2d array");
		int l,m;
		Scanner sc=new Scanner(System.in);
		l=sc.nextInt();
		m=sc.nextInt();
		int a[][]=new int[l][m];
		System.out.println("Enter array elements");
		for(int i=0;i<l;i++)
			for(int j=0;j<m;j++)
				a[i][j]=sc.nextInt();
		System.out.println("The 2D array is");
		for(int i=0;i<l;i++) {
			for(int j=0;j<m;j++) 
				System.out.print(a[i][j]+" ");
			System.out.println();
		}
	}
}
