# OODFinal_Tamagotchi
 Object-Oriented Design final project

 Group: Kitty Kats
 - Daniel Messiana
 - Angelo Morelli
 - Ivy Bowers

## Youtube Link
https://youtu.be/lL7fg7_Q8-4

## Design Patterns

Singleton, Builder, Command, Observer

## Details

This app will allow users to create a new Tamagotchi pet with custom traits such as name, fur color, unique trait,
fashion accessory, and personality type.

## Software Design
Tamagotchi game that provides a user with a digital pet to take care of. You will be able to customize, feed, play with, heal, and clean the pet to keep them happy.  
-Singleton pattern: We just need a single instance of the user's Tamagatchi  
-Builder pattern: Builds a personalized tamagotchi pet, we can have a base tamagotchi class w/ multiple concrete implementations (cat, dog, bird). Builds the tamagotchi’s name, color, uniqueTrait, accessory, and personality depending on user’s input into a GUI element.  
-Observer pattern: Observes cleanliness, health, entertainment, and hunger levels to calculate happiness. So the publisher/subject of the observer will likely be each of those variables and the happiness is the subscriber/observer. (dependency inversion principle is followed)  
-Command pattern: Manages requests/interactions between the user and their tamagotchi. When the user presses clean, play, heal, and feed buttons on the UI. It will increase the values associated with the corresponding value being observed.  
  
-SOLID Principles: Single-Responsibility, Open/Closed, Interface Segregation

The user will create a pet by inputting a name into a textbox which is checked using a textbox validator, then the game loop will include the different interactions with the pet using buttons.

