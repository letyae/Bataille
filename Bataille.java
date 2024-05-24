// {
package com.egaetan;
// }

/*******
 * Lire les donnees depuis System.in
 * Utilise System.out.println pour afficher le resultat
 * Utilise System.err.println pour afficher des donnees de debug
 * ***/
import java.util.*;

public class Bataille {
	
	public void main() {
		String  line;
		Scanner sc = new Scanner(System.in);
        int nombreDeTour = sc.nextInt(), carteJoueurA, carteJoueurB, pointJoueurA=0, pointJoueurB=0;
        sc.nextLine();

		while(sc.hasNextLine()) {
			line = sc.nextLine();


            if (line.split(" ").length==2) {
             try {
                // Convertir les parties en entiers
                 carteJoueurA = Integer.parseInt(line.split(" ")[0]);
                 carteJoueurB = Integer.parseInt(line.split(" ")[1]);
                 if(carteJoueurA>carteJoueurB)
                    pointJoueurA++;
                else if(carteJoueurA<carteJoueurB)
                    pointJoueurB++;
            }catch (NumberFormatException e) {
                System.out.println("Erreur de format. Assurez-vous d'entrer deux nombres entiers.");
            }
           }

        }
        System.out.println(pointJoueurA>pointJoueurB ? "A"  : "B");

	/* Vous pouvez aussi effectuer votre traitement une fois que vous avez lu toutes les données.*/

	}
}
