# Příklady na procvičování k testu

### Termíny testů
- A1 - 9.10.2024
- A2 - 10.10.2024
- Ke každému příkladu je i vzorové řešení. 
- Existuje **více než jedno** řešení pro každou úlohu, pokud se vaše řešení neshoduje se vzorovým, **neznámená to, že je špatně**.
- Pokud si nebudete jistý svým řešením, můžete mi ho zaslat na e-mail.
## A – AND (Podmínky s AND)

### 1. Povolení vstupu na atrakci:

- Uživatel chce jít na adrenalinovou atrakci v zábavním parku.
- Aby mohl vstoupit, musí být starší než 12 let a jeho výška musí být alespoň 140 cm, ale ne více než 200 cm.
- Program se zeptá uživatele na věk a výšku, a poté vypíše, zda mu je vstup povolen.

<details>
<summary style="font-size: 1.17em; font-weight: bold;"> Vzorové řešení </summary>

```java
import java.util.Scanner;

public class NazevSouboru {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Zadej svůj věk: ");
        int vek = sc.nextInt();

        System.out.println("Zadej svoji výšku v cm: ");
        int vyska = sc.nextInt();

        if (vek > 12 && vyska >= 140 && vyska < 200) {
            System.out.println("Vstup povolen");
        }
        else{
            System.out.println("Vstup zamítnut");
        }
    }
}

```

</details>

### 2. Platná registrace na závod:

- Uživatel se chce zaregistrovat na maraton, ale musí splnit dvě podmínky.
- Musí mít alespoň 18 let a musí mít tréninkový čas na 10 km menší než 60 minut.
- Program se zeptá uživatele na věk a čas na 10 km, a pokud splňuje obě podmínky, povolí registraci
    - vypíše `splněné podmínky pro registraci`.

<details>
<summary style="font-size: 1.17em; font-weight: bold;"> Vzorové řešení </summary>

  ```java
import java.util.Scanner;

public class NazevSouboru {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Zadej svůj věk: ");
        int vek = sc.nextInt();

        System.out.println("Zadej svůj čas na 10 km v minutách");
        int cas = sc.nextInt();

        if (vek >= 18 && cas < 60) {
            System.out.println("splněné podmínky pro registraci");
        }
        else {
          System.out.println("Nejsou splněné všechny podmínky pro registraci");
        }
    }
}

```

</details>

### 3. Slevová akce:

- Uživatel získá slevu na nákup, pokud jeho věrnostní body překročí 100 a současně jeho nákupní košík
  obsahuje zboží v hodnotě alespoň 5000 Kč.
- Program se zeptá uživatele na počet věrnostních bodů a celkovou hodnotu
  košíku, a vypíše, zda uživatel získá slevu.

<details>
<summary style="font-size: 1.17em; font-weight: bold;"> Vzorové řešení </summary>

  ```java
import java.util.Scanner;

public class NazevSouboru {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Zadej počet svých věrnostních bodů: ");
        int vernostniBody = sc.nextInt();

        System.out.println("Zadej hodnotu svého nákupu");
        int hodnotaKosiku = sc.nextInt();

        if (vernostniBody > 100 && hodnotaKosiku >= 5000) {
            System.out.println("Máte nárok na slevu");
        }
        else {
          System.out.println("Nelze uplatnit slevu na nákup");
        }
    }
}

```

</details>

## B – OR + Random (Podmínky s OR a generování náhodných čísel)

### 1. Generování dvou náhodných čísel (1-12)

- Napište program, který vygeneruje dvě náhodná čísla mezi 1 a 12 (
  reprezentující hodnotu karet).
- Uživatel vyhraje, pokud je součet obou karet přesně 21 nebo menší než 10.
- Program vypíše, zda uživatel vyhrál nebo ne.

<details>
<summary style="font-size: 1.17em; font-weight: bold;"> Vzorové řešení </summary>

  ```java
import java.util.Random;

public class NazevSouboru {
  public static void main(String[] args) {
    Random random = new Random();

    // Generování dvou náhodných čísel (karet) mezi 1 a 12
    int karta1 = random.nextInt(1, 13); // způsob 1
    int karta2 = random.nextInt(12) + 1; // způsob 2

    // Výpis hodnot karet (Pro kontrolu, není potřeba pro řešení)
    System.out.println("První karta: " + karta1);
    System.out.println("Druhá karta: " + karta2);

    // Výpočet součtu karet
    int soucet = karta1 + karta2;

    // Kontrola podmínky pro výhru
    if (soucet == 21 || soucet <= 10) {
      System.out.println("Vyhrál jsi! Součet karet je: " + soucet);
    } else {
      System.out.println("Prohrál jsi. Součet karet je: " + soucet);
    }
  }
}


```

</details>

### 2. Hod dvou kostek:

- Napište program, který simuluje hození dvěma kostkami (hodnoty mezi 1 a 6).
- Uživatel vyhraje, pokud součet hozených hodnot je menší než 10 nebo pokud obě kostky mají hodnotu 6.
- Program vypíše, zda uživatel vyhrál.

<details>
<summary style="font-size: 1.17em; font-weight: bold;"> Vzorové řešení </summary>

  ```java
import java.util.Random;

public class HodKostkami {
  public static void main(String[] args) {
    Random random = new Random();

    // Generování hodnot dvou kostek (1 až 6)
    int kostka1 = random.nextInt(6) + 1;
    int kostka2 = random.nextInt(6) + 1;

    // Výpis hodnot kostek
    System.out.println("První kostka: " + kostka1);
    System.out.println("Druhá kostka: " + kostka2);

    // Výpočet součtu kostek
    int soucet = kostka1 + kostka2;

    // Kontrola podmínek pro výhru
    if (soucet < 10 || (kostka1 == 6 && kostka2 == 6)) {
      System.out.println("Vyhrál jsi! Součet kostek je: " + soucet);
    } else {
      System.out.println("Prohrál jsi. Součet kostek je: " + soucet);
    }
  }
}

```

</details>

### 3. Hod tří kostek:

- Napište program, který simuluje hození třemi kostkami (hodnoty mezi 1 a 6).
- Uživatel vyhraje, pokud jsou alespoň dvě kostky stejné.
- Program vypíše, zda uživatel vyhrál.

<details>
<summary style="font-size: 1.17em; font-weight: bold;"> Vzorové řešení </summary>

  ```java
import java.util.Random;

public class HodTremiKostkami {
  public static void main(String[] args) {
    Random random = new Random();

    // Generování hodnot tří kostek (1 až 6)
    int kostka1 = random.nextInt(6) + 1;
    int kostka2 = random.nextInt(6) + 1;
    int kostka3 = random.nextInt(6) + 1;

    // Výpis hodnot kostek
    System.out.println("První kostka: " + kostka1);
    System.out.println("Druhá kostka: " + kostka2);
    System.out.println("Třetí kostka: " + kostka3);

    // Kontrola podmínky pro výhru (alespoň dvě kostky jsou stejné)
    if (kostka1 == kostka2 || kostka1 == kostka3 || kostka2 == kostka3) {
      System.out.println("Vyhrál jsi! Alespoň dvě kostky jsou stejné.");
    } else {
      System.out.println("Prohrál jsi. Žádné dvě kostky nejsou stejné.");
    }
  }
}


```

</details>

## C – Reálné scénáře (Praktické použití podmínek)

### 1. Pozdrav podle času:

- Napište program, který získá od uživatele aktuální hodinu (0–23) a na základě toho uživatele
  pozdraví.
- Pokud je hodina mezi 5 a 11, program vypíše "Dobré ráno".
- Pokud je hodina mezi 12 a 17, vypíše "Dobré
  odpoledne".
- Pokud je hodina mezi 18 a 4, vypíše "Dobrý večer".

<details>
<summary style="font-size: 1.17em; font-weight: bold;"> Vzorové řešení </summary>

  ```java
import java.util.Scanner;

public class PozdravPodleHodiny { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Získání hodiny od uživatele, budeme předpokládát, že uživatel vždy zadá číslo z rozsahu 0 - 23
        System.out.println("Zadejte aktuální hodinu (0-23): ");
        int hodina = sc.nextInt();

        // Určení pozdravu na základě hodiny
        if (hodina >= 5 && hodina <= 11) {
          System.out.println("Dobré ráno");
        } else if (hodina >= 12 && hodina <= 17) {
          System.out.println("Dobré odpoledne");
        } else {
          System.out.println("Dobrý večer");
        }
     }
}


```

</details>

### 2. Cenová kalkulace při prodeji vstupenek na koncert:

- Uživatel zadá počet vstupenek, které chce koupit na koncert.
- Cena jedné vstupenky je 1200 Kč.
- Pokud uživatel objedná 1–5 vstupenek, platí plnou cenu.
- Pokud objedná 6–10 vstupenek, dostane slevu 15 %.
- Pokud objedná 11–20 vstupenek, dostane slevu 25 %.
- Pokud objedná více než 20 vstupenek, objednávka je zamítnuta, protože překračuje limit.
- Program vypíše celkovou cenu, kterou uživatel zaplatí, nebo informaci, že objednávka byla zamítnuta.

<details>
<summary style="font-size: 1.17em; font-weight: bold;"> Vzorové řešení </summary>

  ```java
import java.util.Scanner;

public class VstupenkyNaKoncert {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Cena jedné vstupenky
    int cenaJedneVstupenky = 1200;

    // Získání počtu vstupenek od uživatele
    System.out.println("Zadejte počet vstupenek, které chcete koupit: ");
    int pocetVstupenek = sc.nextInt();

    // Proměnná pro celkovou cenu
    double celkovaCena = 0;

    // Výpočet celkové ceny na základě počtu vstupenek a slevy
    if (pocetVstupenek > 20) {
      System.out.println("Objednávka zamítnuta, překročili jste limit počtu vstupenek.");
    } 
    else if (pocetVstupenek >= 11) {
      celkovaCena = pocetVstupenek * cenaJedneVstupenky * 0.75; // 25% sleva
      System.out.println("Celková cena se slevou 25 %: " + celkovaCena + " Kč.");
    } 
    else if (pocetVstupenek >= 6) {
      celkovaCena = pocetVstupenek * cenaJedneVstupenky * 0.85; // 15% sleva
      System.out.println("Celková cena se slevou 15 %: " + celkovaCena + " Kč.");
    } 
    else if (pocetVstupenek >= 1) {
      celkovaCena = pocetVstupenek * cenaJedneVstupenky; // Plná cena
      System.out.println("Celková cena: " + celkovaCena + " Kč.");
    } 
    else {
      System.out.println("Neplatný počet vstupenek.");
    }
  }
}


```

</details>

### 3. Výpočet ceny za spotřebu vody:

- Uživatel zadá svou měsíční spotřebu vody v litrech.
- Program vypočítá a vypíše, kolik uživatel zaplatí celkem za spotřebu vody za daný měsíc.
- Cena za 1 litr vody se odvíjí od spotřeby podle následujícího ceníku:

  | spotřeba v litrech | Cena za 1 litr |
  |--------------------|----------------|
  | 0 – 4999           | 0,03 Kč        |
  | 5000 – 9999        | 0,025 Kč       |
  | 10 000 – 14 999    | 0,02 Kč        |
  | 15 000 a více      | 0,015 Kč       |

<details>
<summary style="font-size: 1.17em; font-weight: bold;"> Vzorové řešení </summary>

```java
import java.util.Scanner;

public class SpotrebaVody {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Získání spotřeby vody od uživatele
    System.out.println("Zadejte svou měsíční spotřebu vody v litrech: ");
    int spotreba = sc.nextInt();

    // Proměnná pro cenu za 1 litr vody
    double cenaZaLitr = 0;

    // Určení ceny za 1 litr na základě spotřeby
    if (spotreba >= 0 && spotreba <= 4999) {
      cenaZaLitr = 0.03;
    } 
    else if (spotreba >= 5000 && spotreba <= 9999) {
      cenaZaLitr = 0.025;
    } 
    else if (spotreba >= 10000 && spotreba <= 14999) {
      cenaZaLitr = 0.02;
    } 
    else if (spotreba >= 15000) {
      cenaZaLitr = 0.015;
    }

    // Výpočet celkové ceny
    double celkovaCena = spotreba * cenaZaLitr;

    // Výpis celkové ceny
    System.out.println("Celková cena za spotřebu vody: " + celkovaCena + " Kč.");
  }
}

```

</details>
