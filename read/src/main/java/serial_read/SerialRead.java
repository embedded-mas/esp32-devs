/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package serial_read;

import arduino.Arduino;

import com.fazecast.jSerialComm.*;

public class SerialRead {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
        
        Arduino a = new Arduino("/dev/ttyUSB0", 9600);      
        a.openConnection();
        
        String s = a.serialRead(); //read from serial until getting a linebreak (\n)
        System.out.println(s);
        
        String r = a.serialRead(3); //read a number of bytes set in the parentesis
        System.out.println(r);
        
        
    }
}
