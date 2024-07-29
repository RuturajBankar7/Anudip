package com.Module12.MethodOverriding;



//Parent class Vehicle
class Vehicle 
{
 // Method to start the engine
 public void startEngine() 
 {
     System.out.println("Engine started.");
 }

 // Method to stop the engine
 public void stopEngine() 
 {
     System.out.println("Engine stopped.");
 }
}

//Child class Car extending Vehicle
class Car extends Vehicle 
{
 // Method overriding to start the car engine
 public void startEngine()
 {
     System.out.println("You can start the car engine with the start button.");
 }

 // Method overriding to stop the car engine
 public void stopEngine() 
 {
     System.out.println("You can stop the car engine by pushing the same start button while engine is on.");
 }
}

//Child class Motorcycle extending Vehicle
class Motorcycle extends Vehicle
{
 // Method overriding to start the motorcycle engine
 public void startEngine() {
     System.out.println("You can start the motorcycle engine by applying clutch and clicking start button at the same time.");
 }
 
 // Method overriding to stop the motorcycle engine
 public void stopEngine() 
 {
     System.out.println("You can stop the motorcycle engine by moving the key in anti-clockwise direction.");
 }
}

public class VehicleOverriding {

 public static void main(String[] args) {
     
     // Creating an object of Vehicle class
     Vehicle v = new Vehicle();
     v.startEngine(); // Calling startEngine method of Vehicle class
     System.out.println("---------------------");
     v.stopEngine();  // Calling stopEngine method of Vehicle class
 
     System.out.println("_____________________________________________________________________________________________________________");
     
     // Creating an object of Car class
     Car c = new Car();
     c.startEngine(); // Calling overridden startEngine method of Car class
     System.out.println("-----------------------------------------------------------------------------------------------------------");
     c.stopEngine(); // Calling overridden stopEngine method of Car class
     
     System.out.println("_____________________________________________________________________________________________________________");
     
     // Creating an object of Motorcycle class
     Motorcycle m = new Motorcycle();
     m.startEngine(); // Calling overridden startEngine method of Motorcycle class
     System.out.println("-----------------------------------------------------------------------------------------------------------");
     m.stopEngine(); // Calling overridden stopEngine method of Motorcycle class
     
     System.out.println("_____________________________________________________________________________________________________________");
     
     // Upcasting - Creating an object of Vehicle class and referring to a Car object
     Vehicle vc = new Car(); // Upcasting
     vc.startEngine(); // Calls startEngine method of Car class (polymorphism)
     System.out.println("-----------------------------------------------------------------------------------------------------------");
     vc.stopEngine(); // Calls stopEngine method of Car class (polymorphism)
     
     System.out.println("_____________________________________________________________________________________________________________");
     
     // Upcasting - Creating an object of Vehicle class and referring to a Motorcycle object
     Vehicle vm = new Motorcycle(); // Upcasting
     vm.startEngine(); // Calls startEngine method of Motorcycle class (polymorphism)
     System.out.println("-----------------------------------------------------------------------------------------------------------");
     vm.stopEngine(); // Calls stopEngine method of Motorcycle class (polymorphism)
 }
}

/*

Sure! Here’s the code with added comments and a detailed dry run:

java
Copy code
package com.lab2;

//Parent class Vehicle
class Vehicle 
{
 // Method to start the engine
 public void startEngine() 
 {
     System.out.println("Engine started.");
 }

 // Method to stop the engine
 public void stopEngine() 
 {
     System.out.println("Engine stopped.");
 }
}

//Child class Car extending Vehicle
class Car extends Vehicle 
{
 // Method overriding to start the car engine
 public void startEngine()
 {
     System.out.println("You can start the car engine with the start button.");
 }

 // Method overriding to stop the car engine
 public void stopEngine() 
 {
     System.out.println("You can stop the car engine by pushing the same start button while engine is on.");
 }
}

//Child class Motorcycle extending Vehicle
class Motorcycle extends Vehicle
{
 // Method overriding to start the motorcycle engine
 public void startEngine() {
     System.out.println("You can start the motorcycle engine by applying clutch and clicking start button at the same time.");
 }
 
 // Method overriding to stop the motorcycle engine
 public void stopEngine() 
 {
     System.out.println("You can stop the motorcycle engine by moving the key in anti-clockwise direction.");
 }
}

public class VehicleOverriding {

 public static void main(String[] args) {
     
     // Creating an object of Vehicle class
     Vehicle v = new Vehicle();
     v.startEngine(); // Calling startEngine method of Vehicle class
     System.out.println("---------------------");
     v.stopEngine();  // Calling stopEngine method of Vehicle class
 
     System.out.println("_____________________________________________________________________________________________________________");
     
     // Creating an object of Car class
     Car c = new Car();
     c.startEngine(); // Calling overridden startEngine method of Car class
     System.out.println("-----------------------------------------------------------------------------------------------------------");
     c.stopEngine(); // Calling overridden stopEngine method of Car class
     
     System.out.println("_____________________________________________________________________________________________________________");
     
     // Creating an object of Motorcycle class
     Motorcycle m = new Motorcycle();
     m.startEngine(); // Calling overridden startEngine method of Motorcycle class
     System.out.println("-----------------------------------------------------------------------------------------------------------");
     m.stopEngine(); // Calling overridden stopEngine method of Motorcycle class
     
     System.out.println("_____________________________________________________________________________________________________________");
     
     // Upcasting - Creating an object of Vehicle class and referring to a Car object
     Vehicle vc = new Car(); // Upcasting
     vc.startEngine(); // Calls startEngine method of Car class (polymorphism)
     System.out.println("-----------------------------------------------------------------------------------------------------------");
     vc.stopEngine(); // Calls stopEngine method of Car class (polymorphism)
     
     System.out.println("_____________________________________________________________________________________________________________");
     
     // Upcasting - Creating an object of Vehicle class and referring to a Motorcycle object
     Vehicle vm = new Motorcycle(); // Upcasting
     vm.startEngine(); // Calls startEngine method of Motorcycle class (polymorphism)
     System.out.println("-----------------------------------------------------------------------------------------------------------");
     vm.stopEngine(); // Calls stopEngine method of Motorcycle class (polymorphism)
 }
}
Dry Run:
1.Creating a Vehicle object (Vehicle v = new Vehicle();):

v.startEngine() prints "Engine started."
v.stopEngine() prints "Engine stopped."

2.Creating a Car object (Car c = new Car();):

c.startEngine() prints "You can start the car engine with the start button."
c.stopEngine() prints "You can stop the car engine by pushing the same start button while engine is on."

3.Creating a Motorcycle object (Motorcycle m = new Motorcycle();):

m.startEngine() prints "You can start the motorcycle engine by applying clutch and clicking start button at the same time."
m.stopEngine() prints "You can stop the motorcycle engine by moving the key in anti-clockwise direction."

4.Upcasting Car object to Vehicle (Vehicle vc = new Car();):

vc.startEngine() prints "You can start the car engine with the start button." (polymorphism)
vc.stopEngine() prints "You can stop the car engine by pushing the same start button while engine is on." (polymorphism)

5.Upcasting Motorcycle object to Vehicle (Vehicle vm = new Motorcycle();):

vm.startEngine() prints "You can start the motorcycle engine by applying clutch and clicking start button at the same time." (polymorphism)
vm.stopEngine() prints "You can stop the motorcycle engine by moving the key in anti-clockwise direction." (polymorphism)
*/


