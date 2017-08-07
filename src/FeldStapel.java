
public class FeldStapel {

	private Bauklotz[] klotzarray = new Bauklotz[0];
	private Bauklotz[] temparray = new Bauklotz[0];
	private int lange = 0;
	Bauklotz bauklotz;
	
	
	public void push(Bauklotz klotz) {
		lange = klotzarray.length + 1;
		temparray = new Bauklotz[lange];
		System.arraycopy(klotzarray, 0, temparray, 0, klotzarray.length);
		temparray[lange-1] = klotz;
		klotzarray = new Bauklotz[temparray.length];
		System.arraycopy(temparray, 0, klotzarray, 0, temparray.length);
	}
	
	public Bauklotz pop() {
		if(klotzarray.length > 0) {
			bauklotz = klotzarray[Math.max(0, (klotzarray.length-1))];
			klotzarray[Math.max(0, (klotzarray.length-1))] = null;
			temparray = new Bauklotz[Math.max(0, (klotzarray.length-1))];
			System.arraycopy(klotzarray, 0, temparray, 0, Math.max(0, (klotzarray.length-1)));
			klotzarray = new Bauklotz[temparray.length];
			System.arraycopy(temparray, 0, klotzarray, 0, temparray.length);
			return bauklotz;
		}else {
			return null;
		}
	}
	
	public Bauklotz peek() {
		if(klotzarray.length > 0) {
			return klotzarray[Math.max(0, (klotzarray.length-1))];
		}
		
		return null;
	}
}
