package wizard_management;
import java.util.*;

public class SpellBook implements Readable{
  ArrayList<String> spells;

  public SpellBook(){
    this.spells = new ArrayList<String>();
  }

  public void addSpell(String spell){
    this.spells.add(spell);
  }

  public int spellCount(){
    return this.spells.size();
  }

  public String read(){
    return this.spells.get(0);
  }
}