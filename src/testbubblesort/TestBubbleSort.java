package testbubblesort;

/**
 *
 * @author Samuele
 */
public class TestBubbleSort {

    public static void main(String[] args) {

        String nomi[] = {"Matteo", "Giancarlo", "Rick", "Begonia",
            "Ermenegilda", "Pipino", "Samuardo", "Shandro", "Dagoberto",
            "Adalberto", "Carmen", "Briseide", "Elena", "Paul",
            "Andrea", "Ernesto", "John"};

        String mid;

        System.out.println("Stringhe ordinate: ");

        for (int j = 0; j < nomi.length; j++) {

            for (int i = j + 1; i < nomi.length; i++) {
                // comparo le stringhe adiacenti
                if (nomi[i].compareToIgnoreCase(nomi[j]) < 0) {

                    mid = nomi[j];
                    nomi[j] = nomi[i];
                    nomi[i] = mid;
                }
            }
            System.out.println(nomi[j]);
        }

    }//fine main

    public static void BubbleSortDoc(String[] array) {

        boolean scambi = true;

        while (scambi) {

            scambi = false;

            for (int i = 0; i < array.length - 1; i++) {

                if (array[i].compareTo(array[i + 1]) > 0) {
                    scambia(array, i, i + 1);
                    scambi = true;
                }
            }
        }

    }

    private static void scambia(String[] array, int i, int j) {
        String mid = array[i];
        array[i] = array[j];
        array[j] = mid;

    }
    
}//fine
