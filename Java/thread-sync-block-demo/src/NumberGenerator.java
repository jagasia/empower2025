
public class NumberGenerator {
	
	public void generate() throws InterruptedException {
		String name=Thread.currentThread().getName();
		System.out.println(name+" Entered the generate method now...");
		
		for(int i=0;i<5;i++) {
			System.out.println(name+" ... "+i);
			Thread.sleep(1000);
		}
		
		synchronized (this) {
			System.out.println(name+" Entered the sync block now...");
			for(int i=100;i<110;i++) {
				System.out.println(Thread.currentThread().getName()+" : "+i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}			
			System.out.println(name+" exited the sync bloc now...");
		}
		for(int i=0;i<35;i++) {
			System.out.println(name+" ... "+i);
			Thread.sleep(1000);
		}
		System.out.println(name+" exited the generate method now...");
	}
}
