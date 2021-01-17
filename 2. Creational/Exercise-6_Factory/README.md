# Factory Method - Virtual Constructor
Creational pattern, Define an interface for creating an object, but let **subclasses decide which class** to instantiate.
Factory Method lets a class defer instantiation to subclasses.
![factory](./factory.png)

The `FactoryMethod` is abstract and the `AnOperation` is general Implementation.
# Applicability
Use the Factory Method pattern when
1. a class can't anticipate the class of objects it must create.
2. a class wants its subclasses to specify the objects it creates.
3. classes delegate responsibility to one of several helper subclasses, and you want
to localize the knowledge of which helper subclass is the delegate.
# Exercise 
look at markdown wiki example 