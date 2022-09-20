Walkthrough for write with ESP32:

►► Serial Write:

   1) On the Arduino IDE, go to Tools > Port and select the port that your device is connected to.
   2) Upload the arduino program in the file "arduino/write" to the board.
   3) Go to Tools > Serial Monitor, if the others steps were correctly done, the message "test" will appear every 1 second. Close the monitor window afterwards.
   4) Open the JAVA file "App", change the port and the serial number to match the ones on the Arduino IDE program.
   5) Run the JAVA project. You should see in the compiler's monitor the message "Type the string to send to the serial:" appear.
   6) Type in some message you want to send.
   7) After the program is done running, go back to Arduino IDE and open again the Serial Monitor. The message you sent should appear after a few seconds.

►► Warnings:

   1) Everytime you upload a program to the board, make sure to press and hold the BOOT button in the device until the sequence is finished.
   2) Once the upload is done, press the EN button in the device. This button is also used to reset the program.
   3) It's not possible to have both the Serial Monitor in the Arduino IDE and the JAVA application running at the same time. Make sure to interrupt one to use the other.
