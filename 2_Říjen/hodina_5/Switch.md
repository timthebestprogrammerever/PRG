# Switch

- řídící konstrukce pro možnost širšího větvění
- využívá se místo delších `if...else` bloku
- na základě podmínky vybere jeden z bloku, který se provede

### Syntax

```java
switch(expression) {
  case x:
    // code block
    break;
  case y:
    // code block
    break;
  default:
    // code block
}
```

### Jak to funguje?

- `expression` je vyhodnoceno pouze jednou
- hodnota výrazu se porovná s každou hodnotou `case`
- pokud se shoduje, provede se konkrétní blok
- pokud neukončíte blok slovem `break` a spustí se nějaký blok (napříkad)`case x:` tak se provede **každý blok** od `case x` až dolů

### Příklad

```java
int day = 4;
switch (day) {
  case 1:
    System.out.println("Monday");
    break;
  case 2:
    System.out.println("Tuesday");
    break;
  case 3:
    System.out.println("Wednesday");
    break;
  case 4:
    System.out.println("Thursday");
    break;
  case 5:
    System.out.println("Friday");
    break;
  case 6:
    System.out.println("Saturday");
    break;
  case 7:
    System.out.println("Sunday");
    break;
}
// Outputs "Thursday" (day 4)
```