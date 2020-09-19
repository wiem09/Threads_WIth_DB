package Threads;

public class Threadex extends Thread {
public Threadex(String name) {
	super(name);
}

	public void run() {
		// TODO Auto-generated method stub
		if(Thread.currentThread().getName()=="A") {
			for(int i=0;i<27;i++) {
				System.out.println("le thread"+" "+this.getName()+" affiche "+i);
			}
	}
		else {
			for(char i='A';i<'Z'+1;i++)
				System.out.println("le thread"+" "+this.getName()+" affiche: "+i);	
		}
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
Threadex t1=new Threadex("A");
Threadex t2=new Threadex("B");
t1.start();
//Thread.sleep(5000);
t2.start();
	}
}
