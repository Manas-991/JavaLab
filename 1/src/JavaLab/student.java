package JavaLab;
import java.util.*;
public class student 
{
	
	String USN,Name,Branch,Phone;
	
	student(String USN,String Name,String Branch,String Phone){
	this.USN=USN;
	this.Name=Name;
	this.Branch=Branch;
	this.Phone=Phone;
	}
	
	public String toString() {
		System.out.println("The details are");
		return this.USN+" "+this.Name+" "+this.Branch+" "+this.Phone;
	}
	
	public static void main(String[] args) {
		System.out.println("Enter number of students");
		int n;
		Scanner sc = new Scanner(System.in);
		Scanner sl = new Scanner(System.in);
		n = sc.nextInt();
		Vector<student> v=new Vector<student>();
		for(int i=0;i<n;i++) {
			System.out.println("Enter USN NAME BRANCH PHONE");
			student st=new student(sl.nextLine(),sl.nextLine(),sl.nextLine(),sl.nextLine());
			v.add(st);
		}
		for(student sd:v)
			System.out.println(sd);
		sc.close();
		sl.close();
	}

}
