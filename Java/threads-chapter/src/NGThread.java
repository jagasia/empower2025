
public class NGThread extends Thread
{
	NumberGenerator ng;
	public NGThread(NumberGenerator ng) {
		this.ng=ng;
	}
	
	public void run() {
		ng.generate();
	}
}
