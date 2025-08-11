
public class AppJoin {

	public static void main(String[] args) throws InterruptedException {
		MyThread t1=new MyThread();
		MyThread t2=new MyThread();
		MyThread t3=new MyThread();
		MyThread t4=new MyThread();
		
		t1.setName("Mithun");
		t2.setName("Harinath");
		t3.setName("Samarth");
		t4.setName("Adharv");
		
		t1.start();
		t2.start();
//		t2.join();		//t2 says, whoever already started can proceed and complete. 
					//others who have not started, please wait
		
		t3.start();
		t3.join();
		t4.start();
		
		
		
	}

}
