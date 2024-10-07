# Operace s proměnnými
- Existuje několik operací, které lze nad proměnnými dělat
- K provádění operací slouží operátory

### Typy operátoru

- Aritmetické operátory
- Přiřazovací operátory
- Porovnávácí operátory
- Logické operátory
- Bitové operátory

## Aritmetické operace

### Operátory

- operátory slouží k provádění operací nad hodnotami a proměnnými

#### Seznam aritmetických operátorů

- `+` součet dvou čísel, či spojení dvou řetězců
- `-` rozdíl dvou čísel
- `/` podíl dvou čísel
- `*` součin dvou čísel
- `%` modulo operátor - vrátí zbytek po dělení
- `++` inkrement operátor - zvýší hodnotu o 1
- `--` dekrement operátor - sníží hodnotu o 1

#### Příklady použítí
```java
int soucet = 100 + 200;         // 300
int rozdil = soucet - 100;       // 300 - 100 = 200
int podil = soucet / rozdil;    // 300 / 200 = 1.5! Ale ukládáme do int => 1
```

#### Logické výrazy
- `and &&` všechny výrazy musí být pravda 
- `or ||` alespoň jeden výraz musí být pravda
- `not !` změní výraz `true` na `false` a naopak
