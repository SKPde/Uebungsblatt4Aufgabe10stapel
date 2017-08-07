
public class Stapelhauptfeld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FeldStapel fs = new FeldStapel();
		fs.push(new Bauklotz("Kübel"));
		fs.push(new Bauklotz("Zoller"));
		fs.push(new Bauklotz("Ernst"));
		fs.push(new Bauklotz("Bean"));
		System.out.println(fs.peek().toString());
	}

}
