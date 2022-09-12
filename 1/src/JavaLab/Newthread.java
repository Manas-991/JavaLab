package JavaLab;

class Nwthread implements Runnable {
	Thread t;
	public Nwthread(){
	 t= new Thread(this);
	 t.start();
	}
	public void run() {
		try {
			for(int i=0;i<10;i++) {
				System.out.println("Child");
				Thread.sleep(500);
			}
		}
		catch (InterruptedException e) {
			System.out.println(e);
		}
	
	}
}
public class Newthread{
	public static void main(String args[]) {
	Nwthread lol=new Nwthread();
	System.out.println(lol.t.isAlive());
	try {
		lol.t.join();
		for(int i=0;i<10;i++) {
			System.out.println(i+"main");
			Thread.sleep(500);
		}
	}
	catch(InterruptedException e) {
		System.out.println(e);
	}
	System.out.println(lol.t.isAlive());
	}
}


