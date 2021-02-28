# Factory Method - Virtual Constructor
 methods to deal with the problem of creating objects without having to specify the exact class of the object that will be created.

Creational pattern, Define an interface for creating an object, but let **subclasses decide which class** to instantiate.
Factory Method lets a class defer instantiation to subclasses.
![factory](./factory.png)

The `FactoryMethod` is abstract and the `AnOperation` is general Implementation.

* Product (Document)
  * defines the interface of objects the factory method creates.
* ConcreteProduct (MyDocument)
  * implements the Product interface.
* Creator (Application)
  * declares the factory method, which returns an object of type Product.
    Creator may also define a default implementation of the factory method that returns a default ConcreteProduct object.
  * may call the factory method to create a Product object.
* ConcreteCreator (MyApplication)
  * overrides the factory method to return an instance of a ConcreteProduct.
# Applicability
Use the Factory Method pattern when
1. a class can't anticipate the class of objects it must create.
2. a class wants its subclasses to specify the objects it creates.
3. classes delegate responsibility to one of several helper subclasses, and you want
to localize the knowledge of which helper subclass is the delegate.
# Exercise 
look at markdown wiki example 