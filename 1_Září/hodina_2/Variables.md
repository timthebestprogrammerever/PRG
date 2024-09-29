# Proměnné

- slouží jako kontejnery pro uchování dat
- v Javě **musí** mít každá proměnná definovaný datový typ
- proměnné se můžou jmenovat téměř jakkoliv, ale platí jistá pravidla
    - proměnné mohou obsahovat číslice, znaky `$` a `_`, ale **nesmí** číslíci začínat
    - **nelze** používat klíčová slova pro názvy proměnných.
    - Například: `class`, `static`, `int`, `import` a zhruba 60 dalších. Všechny lze
      najít [ZDE.](https://www.geeksforgeeks.org/list-of-all-java-keywords/)

### Jak pojmenovávat proměnné? (Zažíté konvence)

1. Používejte camelCase = každé nové slovo v proměnné začíná velkým písmenem, až na 1. slovo.
   Příklad: `int pocetStudentu`, `double prumernaZnamka`
2. Nepoužívejte háčky, čárky a jiné znaky mimo základní ASCII - znakovou sadu
3. názvy by měli být výstižné a srozumitelné
   1. `int a`, `boolean x` <= takhle ne
   2. `int vek`, `int pocetKnih` <= lepší
4. **Konstanty** jsou speciální typ proměnné. 
   1. Po inicializaci se hodnota již nemění.
   2. Před uvedením datového typu je klíčové slovo `final`
   3. Všechná písmená v názvu by měla být velká a oddělená znakem `_`

```java
// Příklady správně pojmenování proměnných
int vek = 25;
double prumernaTeplota = 36.6;
boolean isStudent = true;
final int MAX_POCET = 50;

// Příklady špatně pojmenovaných proměnných
int 1čislo = 42; // začíná číslem.
int static = 666; // static je klíčové slovo Javy.
```

- proměnné lze **deklarovat**

```java
// deklarace => připravení proměnné pro následné použití
int cislo;
```

- a následnědně **inicializovat**

```java
// inicializace => první nastavení hodnoty
cislo = 15;
```

- lze provést obojí naráz

```java
// deklarace a inicializace zároveň
int cislo = 15;
```

## Datové typy

### 1. Primitivní

- základní, jednoduché datové typy
- nejsou odvozené od jiných typů.
- **Příklady:**
- pro ukládání
    - celých čísel: `byte`, `short`, `int`, `long`
    - čísel s desetinou čárkou: `flaot`, `double`
    - hodnota true/false `boolean`
    - jeden znak `char`
- mají pevnou velikost
- Nejsou předem inicializovány, ale přiřazením je nastavena výchozí hodnota (např. `int` má výchozí hodnotu 0).

Hodnota primitivního typu je přímo uložena v paměti, takže když například deklarujete proměnnou `int a = 10;`, hodnota
10 je přímo uložena v proměnné `a`.

### 2. Referenční

- odkazují na objekty v paměti.
- **Příklady**: Třídy, objekty, pole, rozhraní, např. `String`, `ArrayList`, uživatelsky definované objekty (třídy).
- **Jak fungují?** U referenčních typů proměnná neukládá přímo hodnotu, ale odkaz (adresu) na místo v paměti, kde je uložen skutečný objekt. Například když deklarujete `String str = "Ahoj";`, proměnná str neukládá samotný text "Ahoj", ale adresu, kde je tento řetězec uložen v paměti.
#### 2.1 Vlastnosti:
- Neexistuje pevná velikost, závisí na objektu.
- Pracuje se s nimi jako s objekty, což znamená, že mohou mít metody a vlastnosti. (Vysvětleno později v roce)
- Výchozí hodnota je `null` (tedy neukazují na žádný objekt, dokud není explicitně inicializován).
