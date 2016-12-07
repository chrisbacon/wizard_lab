import static org.junit.Assert.*;
import org.junit.*;
import wizard_management.*;

public class SpellBookTest {

  SpellBook spellBook;

  @Before
  public void before(){
    spellBook = new SpellBook();
  }

  @Test
  public void canAddSpell(){
    spellBook.addSpell("fire!");
    assertEquals(1, spellBook.spellCount());
  }

}