import java.util.Scanner;

public class Stapelhauptfeld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FeldStapel fs = new FeldStapel();
		Scanner in = new Scanner(System.in);
		int aktion = 0;
		String name;
		Bauklotz klotz;

	    do {
	        System.out.println("Moegliche Aktionen:");
	        System.out.println(" Klotz aufstapeln(1)," +
	                           " Klotz runter nehmen (2)," + 
	                           " Klotz anzeigen (3) " +
	                           " Programmende (0)");
	        System.out.print("Ihre Wahl: ");
	        aktion = in.nextInt();
	        if (aktion == 1) {
	          System.out.print("Bauklotz aufstapeln:");
	          System.out.print("Name: ");
	          name = (String) in.next();
	          System.out.println("                   ");
	          fs.push(new Bauklotz(name));
	        }
	        else if (aktion == 2) {
	          klotz = fs.pop();
	          if (klotz == null)
	            System.out.println("Keine Klötze mehr auf dem Stapel!");
	          else {
	            System.out.print("Es wurde folgender Klotz entnommen:  ");
	            System.out.println(klotz);
	          }
	        }
	        else if (aktion == 3) {
	        		klotz = fs.peek();
	        		if(klotz == null) {
	        			System.out.println("Es befindet sich kein Klotz im Stapel");
	        		} else {
	        		System.out.print("Folgender Klotz liegt gerade oben:  ");
	            System.out.println(klotz);
	        		}
	        }
	      } while (aktion != 0);
	}

}
