# Unit 1 - Exercise 1 - Multiprocess programming

<hr/>
<hr/>

## Description

In this project, we have created a main process which calls another process (subprocess) which has as its purpose to count how many times the character passed as parameters appears in the text that passed as parameters as well.

<hr/>
<hr/>

## Class and Methods

### Utils Class

This class is used for reuse in some parts of the code.

- The **getText()** method that is intended to read a text file and return a string.
- The **printText()** method that is intended to print the text that return us buy the getText() method.
- The **printVocals()** method that is intended to print the number of times there are of a list of characters in a file passed by parameters and the sum total of these.
- The **convertStringToNumeric()** method coverts a string passed by parameter to number.
- The **removeOutputFile()** method removes a file passed as a parameter if the file exits.
<hr/>
<hr/>

### ProcessLauncher Class

This class is used to create a ProcessBuilder and send to the main process the subprocess.

- The **initProcess()** method is in charge of creating the subprocess and returning it.
<hr/>
<hr/>

### CharacterCounter Class

This class acts as the subprocess.

- The **main()** executable method is one that, when sending the character and text as an argument, counts and displays how many times it has found that character.
<hr/>
<hr/>

## Main Class

This class actsa as the main process.

- The **main()** executable method is where we will call five subprocess corresponding to the wowels that exist. Once done and executed we show them using the methods of the utils class.
<hr/>
<hr/>
