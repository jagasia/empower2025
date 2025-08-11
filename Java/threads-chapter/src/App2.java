
public class App2 {

	public static void main(String[] args) throws InterruptedException {
		MyThread t1=new MyThread();
		System.out.println(t1.getState());		//NEW 
		t1.start();
		System.out.println(t1.getState()); 		//RUNNABLE
		t1.sleep(10000);
		System.out.println(t1.getState());		//TIMED_WAITING
		t1=null;								//DEAD
		System.out.println(t1.getState());
	}

}
