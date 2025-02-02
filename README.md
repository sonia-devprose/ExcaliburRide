# ExcaliburRide
Excalibur Ride

![image](https://github.com/user-attachments/assets/0fd79433-7476-4ad8-90bc-b4982d45fb19)

### Excalibur Ride Simulator

This Java project demonstrates **inheritance** in object-oriented programming (OOP) by modeling an amusement park ride, specifically the "Excalibur" spinning teacup ride. The project features a base class for general ride properties and behaviors, which is then extended by a subclass to represent a specific type of ride with additional unique behaviors.

### Features:
- **Ride Class**: A generic class that represents a basic amusement ride with properties like name, capacity, and speed.
- **SpinningTeacup Class**: A subclass of `Ride` that adds functionality specific to the "Excalibur" spinning teacup ride, including rotation speed and spinning behavior.
- **Demonstrates Inheritance**: The project uses **multilevel inheritance** to extend the base `Ride` class and customize the behavior for the teacup ride.

### Key Concepts:
- **Inheritance**: The `SpinningTeacup` class inherits from the `Ride` class, allowing it to reuse common properties and methods like `startRide()` and `displayInfo()`, while adding its own specific behaviors like `spin()`.
- **Method Overriding**: The `startRide()` method is overridden to include custom spinning behavior for the teacup ride.
- **Encapsulation**: Attributes like ride name, capacity, speed, and rotation speed are encapsulated within the classes.

### How to Run:
1. Clone or download this repository.
2. Compile and run the `Main.java` file using a Java IDE or command-line tools.
3. The program will simulate the ride's startup, display its details, and simulate the spinning behavior of the "Excalibur" ride.

### Example Output:
```
Ride Name: Excalibur
Capacity: 20 people
Speed: 10.0 km/h
Rotation Speed: 15.0 RPM
Excalibur is starting!
The Excalibur is spinning at 15.0 RPM!
The Excalibur is spinning around its central hub!
```

### Technologies:
- **Java**: Object-Oriented Programming
- **Inheritance & Polymorphism**


