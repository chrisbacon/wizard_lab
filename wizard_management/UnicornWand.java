package wizard_management;

public class UnicornWand extends Wand{

  public UnicornWand(int power){
    super(power);
  }

  public String cast(String spell){
    if (spell == "healing!") {
      return super.cast(spell);
    }
    return "Wand does nothing."; 
  }
}