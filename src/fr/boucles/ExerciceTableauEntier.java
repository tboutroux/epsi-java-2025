package fr.boucles;

public class ExerciceTableauEntier {
    public static void main(String[] args) {
        // Tableau contenant les entiers de 1 à 10
        int[] entiersDe1A10 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Affichage du premier élément du tableau
        System.out.println(entiersDe1A10[0]);

        // Affichage de la longueur du tableau
        System.out.println(entiersDe1A10.length);

        // Affichage du dernier élément du tableau
        System.out.println(entiersDe1A10[entiersDe1A10.length - 1]);

        // Modification de l'élément d'index 4
        entiersDe1A10[4] = 8;
        System.out.println(entiersDe1A10[4]);


    }
}
