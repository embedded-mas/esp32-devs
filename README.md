Walkthrough for read and write with ESP32:

►► Installing softwares:

   1) Install any version of the Arduino IDE software. You can download it in: https://www.arduino.cc/en/software
   2) On the Arduino IDE, go to File > Preferences and, in the Additional Boards Manager URLs, add the next URL to download the ESP32 type board: https://dl.espressif.com/dl/package_esp32_index.json
   3) Go to Tools > Board > Boards Manager, search for ESP32 and install the packcage.
   4) Go to Tools > Board > ESP32 Arduino and select the correct board you are working with.
   5) Install a JAVA compiler like Apache NetBeans. You can download this compiler in: https://netbeans.apache.org/download/nb125/nb125.html
   6) If you are having trouble making the Arduino IDE recognize your board, check if you have the proper driver for ESP32 installed. If not, install the Silicon Labs CP210x USB to UART Bridge driver. You can download it in: https://www.silabs.com/developers/usb-to-uart-bridge-vcp-drivers?tab=downloads

►► Warnings:

   1) Everytime you upload a program to the board, make sure to press and hold the BOOT button in the device until the sequence is finished.
   2) Once the upload is done, press the EN button in the device. This button is also used to reset the program.
   3) It's not possible to have both the Serial Monitor in the Arduino IDE and the JAVA application running at the same time. Make sure to interrupt one to use the other.
