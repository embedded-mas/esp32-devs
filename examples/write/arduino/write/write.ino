/* sudo chmod a+rw /dev/ttyUSB0 */

const int LIGHT_A = 9;
const int LIGHT_B = 10;
void setup() 
{
  
  Serial.begin(9600);
}

void loop() 
{
  Serial.println("test");
  while (Serial.available() > 0 ) {

     String str = Serial.readString();

     delay(10000);
     Serial.println(str);
  }
  delay(1000);
}
