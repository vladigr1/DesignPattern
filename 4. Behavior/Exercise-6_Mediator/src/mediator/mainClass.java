package mediator;

public class mainClass {
  public static void main(String[] args) {
    ApplicationMediator mediator = new ApplicationMediator();
    ConcretePlane plane1 = new ConcretePlane(mediator, "plane1");
    ConcretePlane plane2 = new ConcretePlane(mediator, "plane2");
    ConcretePlane plane3 = new ConcretePlane(mediator, "plane3"); 
    Helicopter helicopter = new Helicopter(mediator, "helipcopter"); 
    SpaceShuttle SpaceShuttle = new SpaceShuttle(mediator, "SpaceShuttle"); 
   // ConcreteColleague mobile = new MobileColleague(mediator);
    mediator.addPlane(plane1);
    mediator.addPlane(plane2);
    mediator.addPlane(plane3);
    mediator.addPlane(helicopter);
    mediator.addPlane(SpaceShuttle);
    //mediator.addColleague(mobile);
    plane2.send("Hello...");
    SpaceShuttle.send("GOD...");
    helicopter .send("hello...");
    //mobile.send("Hello");
  }
}