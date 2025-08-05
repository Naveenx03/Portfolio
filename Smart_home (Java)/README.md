# Smart Home System

I built a console-based Smart Home simulation in Java by applying OOP concepts.

## What this project does?

It simulates two rooms in a smart home, each with a light and thermostat device.

Users can input brightness levels and temperature settings for each room, and the system displays and performs device functions.

## Project Structure

Main.java // Runs the program  
SmartDevice.java // Abstract base class for all smart devices  
Light.java // Extends SmartDevice for light control  
Thermostat.java // Extends SmartDevice for temperature control  
Room.java // Represents a room with 2 smart devices  
House.java // Represents the smart house with 2 rooms

## OOP Concepts I Applied!

Abstraction: SmartDevice is an abstract class with a common method performFunction().  
Inheritance: Light and Thermostat extend SmartDevice.  
Encapsulation: Device-specific details like brightness and temperature are stored privately and accessed via methods.  
Aggregation: Each Room has 2 SmartDevices, and House has 2 Rooms.  
Polymorphism: Device actions are triggered using performFunction() through SmartDevice references.

## Program Functionality

# Main Class

- Takes user input for room name, light brightness, and thermostat temperature.
- Creates Light and Thermostat objects for each room.
- Stores them in Room objects.
- Adds rooms to House and controls all devices.

# SmartDevice Class (abstract)

- Field: deviceName  
- Provides:
  - Constructor to initialize device name  
  - Getter and setter for device name  
  - Abstract method performFunction() for device-specific behavior

# Light Class (extends SmartDevice)

- Field: brightnessLevel  
- Sets brightness level using constructor  
- Overrides performFunction() to display brightness adjustment message

# Thermostat Class (extends SmartDevice)

- Field: temperature  
- Sets temperature using constructor  
- Overrides performFunction() to display temperature setting message

# Room Class

- Fields: roomName, device1, device2  
- Constructor initializes room and devices  
- Method showRoomDevices() displays device info for the room  
- Method controlDevices() calls performFunction() for both devices

# House Class

- Fields: room1, room2  
- Constructor sets both rooms  
- Method showAllDevices() shows devices for both rooms  
- Method controlAllDevices() performs all device functions

## Working

1. Program prompts user to input room name, light brightness, and thermostat temperature for 2 rooms.
2. Each room is created with a light and a thermostat.
3. All devices are added to a House object.
4. The program:
   - Displays all devices in each room
   - Performs each device's function (adjusting light brightness and thermostat temperature)
