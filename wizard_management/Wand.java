package wizard_management;

public abstract class Wand { 
  int power;

  public Wand(int power){
    this.power = power;
  }

  public int getPower(){
    return this.power;
  }

  public String cast(String spell) {
    return "Wand casts " + spell + " at power level: " + this.power;
  }
}