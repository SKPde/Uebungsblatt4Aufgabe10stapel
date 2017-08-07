
public class FeldStapel {

	private Bauklotz[] klotzarray = new Bauklotz[0];
	private Bauklotz[] temparray = new Bauklotz[0];
	private int lange = 0;
	
	
	public void push(Bauklotz klotz) {
		lange = klotzarray.length + 1;
		temparray = new Bauklotz[lange];
		System.arraycopy(klotzarray, 0, temparray, 0, klotzarray.length);
		temparray[lange-1] = klotz;
		klotzarray = new Bauklotz[temparray.length];
		System.arraycopy(temparray, 0, klotzarray, 0, temparray.length);
	}
	
	public Bauklotz pop() {
		
		
		return null;
	}
	
	public Bauklotz peek() {
		return klotzarray[klotzarray.length-1];
	}
}
