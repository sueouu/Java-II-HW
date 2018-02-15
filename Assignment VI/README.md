# Assignment 6

## Secret Message

Steganography is a technique of encoding a text message into a picture. Create a Steganographer class. Write a method for this class called "encode" that accepts a text filename, a Picture filename, and a target filename as arguments. The "encode" function should blend the text from the text file in a regulated manner to create a target Picture file. Write a function called "decode" that accepts an encoded Picture filename as an argument, decodes the Picture data, and prints the text to the user. Write a “main” method that demonstrates the encoding and decoding of a secret message.

Hint: The easy way to approach this is to cast your char values as ints (encoding), and then subsequently cast your int values as chars (decoding). By spreading your encoding across your images file, you’ll make it less likely that your message can be seen as a visual anomaly.

Caveat: The “.jpg” image format is a “lossy” format, in that when is saves it compresses and loses information. Therefore, you should use the “.png” format instead—it is “non-lossy”. 

Submit the all .java files, along with the support files used to test your code. Submit these files together as a single zipped attachment. Please use the zip format (not .rar or any other format).
