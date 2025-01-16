package fr.boucles;

public class ExerciceBouclesEtTests {

    public static void main(String[] args) {

        // Déclaration du tableau
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;

        // Affichage de la liste
        for (int elem: array) {
            System.out.println(elem);
        }

        // Affichage de la liste inverse
        for (int i = array.length-1; i > 0; i--) {
            System.out.println(array[i]);
        }

        // Affichage des entiers supérieurs à 3
        for (int elem: array) {
            if (elem > 3) {
                System.out.println(elem);
            }
        }

        // Affichage des entiers pairs
        for (int elem: array) {
            if (elem % 2 == 0) {
                System.out.println(elem);
            }
        }

        // Affichage de la valeur des index pairs
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                System.out.println(array[i]);
            }
        }

        // Affichage des entiers impairs
        for (int elem: array) {
            if (elem % 2 != 0) {
                System.out.println(elem);
            }
        }
    }
}
