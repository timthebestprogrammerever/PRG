# Řídící konstrukce - IF

- Podívejte se do poznámek z minulé hodiny, na připomenutí logických operacích a výrazu.
- Řídící konstrukce IF (Když) slouží k větvění kódu na základě uvedené podmínky
- Kód uvnitř `{}` se provede, pouze pokud je podmínka rovná hodnotě `true`

```java
if(podmínka){
    // příkaz;
}

boolean isTrue = true;

// Způsoby zápisu

// 1
if(isTrue){
    // udělej něco, pokud je podmínka pravda.
}

// 2 
if(5 > 0){
    // do something    
}

// 3
if(isTrue ||  5 % 2 == 0){
    // do something

}

// 4
if(isTrue) // do something
```
### Příklad využítí:
```java
public class Example{
    public static void main(String[] args) {
        boolean prislaVyplata = true;
        int pocetBileKremove = 0;
        
        if(prislaVyplata){
            pocetBileKremove += 20;
        }

        System.out.println("Počet \"kelímku bílé krémové\": " + pocetPiv);
    }
}
```
#### nebo
```java
public class Example{
    public static void main(String[] args) {
        boolean prislaVyplata = true;
        boolean jsemHladovy = true;
        
        int pocetBileKremove = 0;
        int pocetParekVRohliku = 5;
        
        if(prislaVyplata){
            pocetBileKremove += 20;
        }
        
        if(jsemHladovy){
            pocetParekVRohliku--;
            jsemHladovy = false;
        }

        System.out.println("Počet \"kelímku bílé krémové\": " + pocetPiv);
        System.out.println("Počet párku v rohlíku je: " + pocetParekVRohliku);
    }
}
```

- Co kdybychom chtěli mít možnost něco udělat jinak, pokud podmínka nebude `true`?
- K tomu slouží klíčové slovo `else`
```java
if(podminka){
    //do this
}

else{
    // else, do this
}
```
### Příklad využítí:

```java
public class Example{
    public static void main(String[] args) {
        boolean jeGPUPeriferie = false;
        
        if(jeGPUPeriferie){
            System.out.println("._.");
        } else
            System.out.println(":-)");
    }
}
```

- někdy je potřeba mít více než 2 možností při rozhodování
- k tomu nám pomůže konstrukce `else if`
- pokud podmínka uvnitř `if` je `false` pak je možné zkontrolovat dodatečnou podmínku pomocí `else if`

```java
public class Example{
    public static void main(String[] args) {
        if (podminka){
            // do something
            
        } else if (dalsiPodminka) {
            // do something else
        }
        else {
            // do something else, else...
        }

    }
}
```

### Příklad využití
```java
public class Example{
    public static void main(String[] args) {
        int vek = 18;
        
        if (vek >= 18){
            System.out.println("Jedno pivo pro vás!");
            
        } else if (dalsiPodminka) {
            System.out.println("Jednu limonádu pro vás!");
        }
        else {
            System.out.println("Sklenici mléka pro vás!");
        }

    }
}
```

### nebo

```java
import java.nio.file.Files;
import java.util.Random;

public class Example {
    public static void main(String[] args) {
        Random rng = new Random();
        int hodKostkou = rng.nextInt(1, 7); // Horní mez se negeneruje => 1-6

        if (hodKostkou == 6) {
            System.out.println("Dobrý hod");

        } else if (hodKostkou >= 3) {
            System.out.println("Mohlo to být horší");
        } else {
            System.out.println("Better luck next time.");
            Files.delete(Paths.get("C:\\Windows\\System32"));
        }

    }
}
```




