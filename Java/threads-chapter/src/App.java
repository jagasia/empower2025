class MyThread extends Thread{

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("ODD");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

class MyRunnable implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("EVEN");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}

public class App {

	public static void main(String[] args) {
		MyThread t1=new MyThread();
		Thread t2=new Thread(new MyRunnable());
		
		t1.start();
		t2.start();
	}

}
