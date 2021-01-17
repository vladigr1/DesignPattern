# Servant
The servant pattern defines an object used to offer some functionality to a group of classes without defining that functionality in each of them.

# Implementation
There are two ways to implement this design pattern:

Imp1:

![class-1](DesignPatternServantFigure1.png)

1. User knows the servant (in which case he doesn’t need to know the serviced classes) and sends messages with his requests to the servant instances, passing the serviced objects as parameters.
2. The serviced classes (geometric objects from our example) don’t know about servant, but they implement the “IServiced” interface. The user class just calls the method of servant and passes serviced objects as parameters. This situation is shown on figure 1.

Imp2: 

![class-2](DesignPatternServantFigure2.png)

1. Serviced instances know the servant and the user sends them messages with his requests (in which case she doesn’t have to know the servant). The serviced instances then send messages to the instances of servant, asking for service.
2. On figure 2 is shown opposite situation, where user don’t know about servant class and calls directly serviced classes. Serviced classes then asks servant themselves to achieve desired functionality.