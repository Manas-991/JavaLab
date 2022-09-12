package Stack;



public class stack
{
	int a[];
	int s;
	int t;
	public stack(int s)
    {
		this.s=s;
		t=-1;
		a=new int[this.s];
    }
	 void push(int b) 
	{
		if(t==s)
			System.out.print("Overflow");
	else a[++t]=b;
		
	}
	
	int pop()
    {
		int l;
		if(t<=-1)
        {
			System.out.print("Underflow");
			return -1;
		}
		else
		{
			l=a[t--];
			System.out.print(l);
		}	
		return l;
	}
	int disp() {
		if(t==-1){
			System.out.println("Stack empty");
			
	}
		else 
			for(int i=t;i>=0;i--)
				System.out.print(a[i]+" ");
			
		return 0;
	}
	
	
	public static void main(String args[]) 
   {
		stack s= new stack(Integer.parseInt(args[0]));
		//stack s= new stack(5);
		//s.push(Integer.parseInt(args[5]));
		s.push(5);
		s.push(3);
		s.push(7);
		s.pop();
		s.disp();
		
	}
}