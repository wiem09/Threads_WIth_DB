package Threads;

public class Threadex2 implements Runnable {
	String name;
public Threadex2(String name) {
	this.name=name;
}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		if(Thread.currentThread().getName()=="A") {
			for(int i=0;i<27;i++)
				System.out.println("le thread"+" "+this.name+" affiche "+i);
	}
		else {
			for(char i='A';i<'Z'+1;i++)
				System.out.println("le thread"+" "+this.name+" affiche: "+i);	
		}	
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
Threadex2 th1=new Threadex2("A");
Threadex2 th2=new Threadex2("B");
Thread t1=new Thread(th1);
Thread t2=new Thread(th2);
t1.start();
t2.start();
t1.join();
t2.join();
	}
}