package wizard_management;

public class PhoenixWand extends Wand{

  public PhoenixWand(int power){
    super(power);
  }

  public String cast(String spell){
    if (spell == "fire!") {
      return super.cast(spell);
    }
    return "Wand does nothing."; 
  }
}