package wizard_management;

public class Wizard {
  String name;
  Flyable ride;
  Protectable defender;

  public Wizard(String name, Flyable ride, Protectable defender){
    this.name = name;
    this.ride = ride;
    this.defender = defender;
  }

  public String getName(){
    return this.name;
  }

  public Flyable getRide(){
    return this.ride;
  }

  public Protectable getDefender(){
    return this.defender;
  }

  public String fly(){
    return this.ride.fly();
  }

  public void setRide(Flyable ride){
this.ride = ride;
  }

public void setDefender(Protectable defender){
this.defender = defender;
}

public String defend(){
  return this.defender.defend();
}
}