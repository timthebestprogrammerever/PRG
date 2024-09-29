package hodina_3;

import java.util.Scanner;

public class VariablesCV {
    public static void main(String[] args) {
        // připomínka z minulé hodiny

        // Rozdělte datové typy k proměnnám


        int vek = 0;                         // celá čísla v rozsahu cca -2 miliardy až ~2 miliardy
        double PI = 3.14159d;                // reálná čísla (s desetinou čárkou)
        boolean isTrue = true;               // pravdivostní hodnota true/false (ano/ne)
        char bigA = 'A';                     // jeden znak, píše se do ''
        String name = "Jmeno";               // textový řetězec (znak/slovo/text), píše se do "";

        /**
         * CV 1
         * Uložte 2 libovolná čísla do 2 proměnných
         * Poté je:
         * Vypište, Přehoďte, Vypište,
         */
        Scanner sc = new Scanner(System.in);
        int cisloA = sc.nextInt();
        int cisloB = sc.nextInt();
        int temp = 0;

        System.out.println("První zadané číslo je: " + cisloA);
        System.out.println("Druhé zadané číslo je: " + cisloB);

        temp = cisloA;
        cisloA = cisloB;
        cisloB = temp;

        System.out.println("První zadané číslo nyní je: " + cisloA);
        System.out.println("Druhé zadané číslo nyní je: " + cisloB);


        /**
         * CV 2
         * Napište jednoduchou kalkulačku, která bude umět +, -, *, / nad dvěma čísly z množiny R (Reálných čísel).
         * Výsledky vypište na konzoli
         */

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Součet: " + (a + b));
        System.out.println("Rozdíl: " + (a - b));
        System.out.println("Součin: " + (a * b));
        System.out.println("Podíl: " + (a / b));

        /**
         * CV 3
         * Uložte do proměnné pravdivostního typu, zda součet 3 libovolných malých písmen je větší než 300.
         * Výsledek vypište na konzoli
         */
        boolean isBig = 'f' + 'a' + 'a' > 300;

        /**
         * CV 4
         * Zeptejte se uživatele na jeho, jméno, příjmení, PSČ a rodné číslo
         * Údaje pak uživateli vypište
         */

        System.out.println("Zadejte své jméno");
        String jmeno = sc.next();

        System.out.println("Zadejte své příjmení");
        String prijmeni = sc.next();

        System.out.println("Zadejte své PSČ");
        int psc = sc.nextInt();

        System.out.println("Zadejte své rodné číslo");
        String rodneCislo = sc.next();

        /**
         * BONUS
         * CV 5
         * Vygenerujte šachovnici o velikosti NxN, kde N je vstup od uživatele
         *
         * Pro generaci šachovnice odkomentujte následující kód
         */
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i + j) % 2 == 0) System.out.print("■");
                else System.out.print("□");
            }
            System.out.println();
        }


        /*
        Pokud byste chtěli vypisovat barevně, lze využít tyto řetězců
        - Použití - System.out.println(RED + "Your message" + Reset);
        je třeba vložit na začátek programu
        final String RESET = "\u001B[0m";
        final String BLACK = "\u001B[30m";
        final String RED = "\u001B[31m";
        final String GREEN = "\u001B[32m";
        final String YELLOW = "\u001B[33m";
        final String BLUE = "\u001B[34m";
        final String PURPLE = "\u001B[35m";
        final String CYAN = "\u001B[36m";
        final String WHITE = "\u001B[37m";
        */
    }
}
