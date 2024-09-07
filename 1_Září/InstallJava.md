# Instalace Javy a IntelliJ IDEA

Tento návod vás provede instalací JDK (Java Development Kit), SDK (Software Development Kit) a vývojového prostředí IntelliJ IDEA.

## Požadavky

- Operační systém: Windows, macOS, nebo Linux
- Stabilní připojení k internetu

---

## Krok 1: Instalace JDK (Java Development Kit)

Java Development Kit (JDK) je nástroj potřebný k vývoji a spouštění Java aplikací.

### 1.1 Stažení JDK

1. Přejděte na oficiální web Oracle a stáhněte si JDK (Java SE Development Kit):
   - [Oficiální odkaz na stažení JDK](https://www.oracle.com/java/technologies/downloads/)
   
2. Zvolte správnou verzi JDK podle vašeho operačního systému (Windows, macOS, Linux).

### 1.2 Instalace JDK

#### Windows
1. Spusťte stažený `.exe` soubor.
2. Postupujte podle pokynů instalačního průvodce.
3. Po dokončení instalace nastavte systémovou proměnnou prostředí `JAVA_HOME`:
   - Otevřete **Ovládací panely** > **Systém a zabezpečení** > **Systém** > **Nastavení systémových proměnných**.
   - V sekci **Systémové proměnné** klikněte na **Nová**.
   - Nastavte proměnnou `JAVA_HOME` na cestu k JDK (např. `C:\Program Files\Java\jdk-XX`).
   - Přidejte `JAVA_HOME\bin` do proměnné prostředí `Path`.

#### macOS
1. Spusťte `.dmg` soubor a postupujte podle instalačního průvodce.
2. Po instalaci otevřete terminál a ověřte instalaci příkazem:

   ```bash
   java -version

## Krok 2: Instalace IntelliJ IDEA

[IntelliJ IDEA](https://www.jetbrains.com/idea/) je integrované vývojové prostředí (IDE) od JetBrains, určené pro vývoj v Javě.

### 2.1 Stažení IntelliJ IDEA
1. Přejděte na [oficiální stránku pro stažení IntelliJ IDEA](https://www.jetbrains.com/idea/download/).
2. Vyberte verzi **Community Edition** (zdarma) nebo **Ultimate Edition** (placená, s dalšími funkcemi).

### 2.2 Instalace IntelliJ IDEA

#### Windows
1. Spusťte stažený `.exe` soubor.
2. Postupujte podle pokynů instalačního průvodce.
3. Během instalace vyberte možnosti, jako je přidání zástupce na plochu a asociace souborů `.java` s IntelliJ IDEA.

### macOS
1. Otevřete stažený `.dmg` soubor.
2. Přetáhněte aplikaci IntelliJ IDEA do složky **Applications**.
3. Spusťte IntelliJ IDEA z **Applications**.

