package JavaLab;

public class threadProgram implements Runnable
{
	double number;
     public threadProgram()
     {                   
         Thread th = new Thread(this);
         th.start();

         Thread th1 = new Thread(new Runnable()
         {
                public void run()
                {
                    m2();
                }
         });
          th1.start();

         Athread a = new Athread();
     }
      
     public void run()
     {
         m1();
     }

     public synchronized void m1()
     {
         //System.out.println("Random number generator :");
         number=Math.random()*100;
         System.out.println("Random number is "+number);
       
     }

     public synchronized void m2()
     {
         int i = 1;
         System.out.println("Square of the number ");
         while(i<=2)
         {
        
           System.out.println(number*number);
           i++;
         }  
     }
   
     public static void main(String args[])
     {
         new threadProgram();
     }
};

class Athread extends Thread 
{
    public Athread()
    {
        Thread th3 = new Thread(this);
        th3.start();
    }

    public synchronized void run()
    {
         
         System.out.println("Cube of the number");
         try
         {
           for(int i=1;i<=10;i++)
        	 System.out.println(i*i*i);
          
         }  
         catch(Exception e) {
        	 System.out.println(e);
         }
     
    }
}