package fr.boucles;

public class ExerciceBouclesBase {
    public static void main(String[] args) {

        // Boucle qui affiche les nombres de 1 à 10
        for (byte i = 0; i < 10; i++) {
            System.out.println(i + 1);
        }

        // Boucle qui affiche 20 fois nom et prenom
        for (int i = 0; i < 20; i++) {
            System.out.println(i+1 + " nom prenom");
        }

        // Boucle qui affiche les nombre pairs de 2 à 100
        for (byte i = 2; i < 101; i ++) {
            if (i%2 == 0){
                System.out.println(i + " est pair");
            }
        }

        // Boucle qui affiche les chiffres impairs de 1 à 99
        for (byte i = 1; i < 100; i++) {
            if (i%2 != 0) {
                System.out.println(i + " est impair");
            }
        }

    }
}
