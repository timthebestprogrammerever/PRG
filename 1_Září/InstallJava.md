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
   - [Oficiální odkaz na stažení JDK](https://www.oracle.com/java/technologies/javase-jdk-downloads.html)
   
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
