
public class KettenStapel {
	
	public Bauklotz oben;
	
	
	public void push(Bauklotz klotz) {
		klotz.zuvor = oben;
		oben = klotz;
		
	}
	
	public Bauklotz pop() {
		
		if(oben == null) {
			return null;
		}
		
		Bauklotz ausgabe = oben;
		if(oben.zuvor != null) {
			oben = oben.zuvor;
		} else {
			oben = null;
		}

		return ausgabe;
	}
	
	public Bauklotz peek() {
		return oben;
	}
	
}
