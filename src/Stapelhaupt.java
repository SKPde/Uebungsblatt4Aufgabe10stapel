import java.util.Scanner;

public class Stapelhaupt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int aktion = 0;
		Scanner in = new Scanner(System.in);
		String name;
		KettenStapel ks = new KettenStapel();
		Bauklotz klotz;
		
	    do {
	        System.out.println("Moegliche Aktionen:");
	        System.out.println(" Klotz aufstapeln(1)," +
	                           " Klotz runter nehmen (2)," + 
	                           " Programmende (0)");
	        System.out.print("Ihre Wahl: ");
	        aktion = in.nextInt();
	        if (aktion == 1) {
	          System.out.print("Bauklotz aufstapeln:");
	          System.out.print("Name: ");
	          name = (String) in.next();
	          System.out.println("                   ");
	          ks.push(new Bauklotz(name));
	        }
	        else if (aktion == 2) {
	          klotz = ks.pop();
	          if (klotz == null)
	            System.out.println("Keine Klötze mehr auf dem Stapel!");
	          else {
	            System.out.print("Es wurde folgender Klotz entnommen:  ");
	            System.out.println(klotz);
	          }
	        }
	      } while (aktion != 0);
	}

}
