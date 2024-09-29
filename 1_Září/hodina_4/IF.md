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



