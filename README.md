# java_guess_word_game

* Building a word-guessing game - Part I

In this week's pairing challenge, you'll build an old school favourite — a word-guessing game in the terminal! Here's the specification for this game:

    When the game starts, it will choose a random word from a list of words.
    The game will then display the word to guess, with only the first letter visible (e.g H____ for "HOUSE").
    The player starts a counter of 10 attempts.
    The player will then be prompted to enter a letter they think might be in the word.
    If the letter is in the word, the game will display the word to guess, with the new letter visible.
    If the letter is not in the word, the game will display the same letters as before, and decrease the counter of remaining attempts.
    If the counter of attempts reaches zero, the player loses.
    If the player finds all the letters in the word, they win.

* Objectives

    Initialising a new project with gradle.
    Writing a test class and tests
    Writing a class and a method.
    Define a class constructor.
    Define class attributes.
    Using a loop and some of Java's built-in classes, like StringBuilder.
    Running tests.
    
    
* Building a word-guessing game - Part II

   - So far the Game class is doing two things:

    It picks a random word from the DICTIONARY
    It displays the word to guess with hidden letters

    It looks like there is an opportunity for us to tidy the codebase and achieve better separation of concerns.

* Objectives

    Extract functionality to a new class.
    Use dependency injection.

