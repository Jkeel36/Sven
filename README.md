Sven Smart Vending Machine Upgrades

See: https://repl.it/@jkeel36/Java-Sven-version-1-1-Real

Specs: https://github.com/mrminich/Sven

The upgrade that I added was the ability to use lowercase letters to select and option in order for the program to be more user-friendly

```
if (userMenuChoice.equals("1") || userMenuChoice.equals("A") || userMenuChoice.equals("a"))

else if (userMenuChoice.equals("2") || userMenuChoice.equals("C") || userMenuChoice.equals("c"))

else if (userMenuChoice.equals("3") || userMenuChoice.equals("E") || userMenuChoice.equals("e"))
```

I also added the ability to play a hidden "Easter Egg" game when the right code word is typed in. The code that calls this method can be seen below. The actual class can be found in the Hangman.java file.

```else if (userMenuChoice.equals("minich") || userMenuChoice.equals("Minich") || userMenuChoice.equals("MINICH"))
    {
      System.out.println("YOU HAVE ENTERED GAME MODE");
      Hangman game = new Hangman();
          game.play();
    }
```

The most up-to-date version of Sven that includes my classmates' and my contributions can be hound here: https://repl.it/@jkeel36/Java-Sven-version-1-5
