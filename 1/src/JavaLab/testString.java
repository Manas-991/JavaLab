package JavaLab;

public class testString {
	public static void main(String args[]) {
		String s1=new String("Te NIE");
		String s2=new String("The National inst");
		String s3=new String("oopj");
		String s4=new String("OOPJ");
		int f=0;
		for(int i=0;s1.charAt(i)!=' '||s2.charAt(i)!=' ';i++) {
			if(s1.charAt(i)!=s2.charAt(i)) {
				f++;
				break;
			}
		}
		if(f==1) {
			return;
		}
		else
		{
			if(s3.equalsIgnoreCase(s4))
				System.out.println("Same string");
		}
	}
}
