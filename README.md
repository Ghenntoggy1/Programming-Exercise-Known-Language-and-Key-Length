# Programming-Exercise-Known-Language-and-Key-Length
Assignments from OOP Course on Java Programming: Arrays, Lists, and Structured Data, week 4. https://www.coursera.org/learn/java-programming-arrays-lists-data/supplement/od7mx/programming-exercise-known-language-and-key-length

PROJECT TITLE: "Programming Exercise: Known Language and Key Length"

PURPOSE OF PROJECT: Assignment : English Language, Known Key Length
                    Modify program that breaks a Vigenère cipher, where you know 
                    that the language is English and the key length is also known.  
                    task 1 - Write the public method sliceString, which has three 
                    parameters—a String message, representing the encrypted message, 
                    an integer whichSlice, indicating the index the slice should start 
                    from, and an integer totalSlices, indicating the length of the key. 
                    This method returns a String consisting of every totalSlices-th 
                    character from message, starting at the whichSlice-th character.
                    task 2 - Write the public method tryKeyLength, which takes three 
                    parameters—a String encrypted that represents the encrypted message, 
                    an integer klength that represents the key length, and a character 
                    mostCommon that indicates the most common character in the language 
                    of the message. This method should make use of the CaesarCracker class, 
                    as well as the sliceString method, to find the shift for each index in 
                    the key. You should fill in the key (which is an array of integers) and 
                    return it. Test this method on the text file athens_keyflute.txt, which 
                    is a scene from A Midsummer Night’s Dream encrypted with the key “flute”, 
                    and make sure you get the key {5, 11, 20, 19, 4}.
                    task 3 - Write the public method breakVigenere with no parameters.
                    This void method should put everything together, so that you can create 
                    a new VigenereBreaker in BlueJ, call this method on it, and crack the 
                    cipher used on a message.

DATE: 31.07.2023

HOW TO START THIS PROJECT: Use BlueJ Environment to open project named 
                           "package.bluej". Find inside of this project 4 
                           classes: 
                           CaesarCipher (Caesar Cipher decryption and 
                           encryption algorithm);
                           CaesarCracker (Caesar Cipher decryption based on
                           frequency of a certain letter in a language)
                           VigenereCipher (Vigenere Cipher encryption and
                           decryption algorithm)
                           VigenereBreaker (Vigenere Cipher decryption based 
                           on frequency of a specific letter in a language, 
                           specifically it slices strings in a known amount 
                           of slices based on key length and finds the key 
                           which was used to encrypt a message and uses it to
                           decrypt the message)
                           - compile, create object of 
                           type VigenereBreaker and start the function: 
                           "breakViginere" for task 1, 2 and 3; 

AUTHOR: Gusev Roman

USER INSTRUCTIONS: you will need library: "edu.duke.\*"
                   (simplified version of File function from Java)
                   and "java.util.\*"
