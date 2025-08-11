
public class NGThread extends Thread
{
	NumberGenerator ng;
	public NGThread(NumberGenerator ng) {
		this.ng=ng;
	}
	
	public void run() {
		try {
			ng.generate();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
