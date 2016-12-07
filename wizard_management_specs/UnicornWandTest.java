import static org.junit.Assert.*;
import org.junit.*;
import wizard_management.*;

public class UnicornWandTest {

  UnicornWand wand;

  @Before 
  public void before() {
    wand = new UnicornWand(20);
  }

  @Test
  public void canCastHealing() {
    String spell = "healing!";
    assertEquals("Wand casts healing! at power level: 20", wand.cast(spell));
  }
}