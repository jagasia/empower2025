
public class NumberGenerator {
	
	public synchronized void generate() {
		for(int i=100;i<110;i++) {
			System.out.println(Thread.currentThread().getName()+" : "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
