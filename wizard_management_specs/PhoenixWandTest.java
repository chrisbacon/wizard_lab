import static org.junit.Assert.*;
import org.junit.*;
import wizard_management.*;

public class PhoenixWandTest {

  PhoenixWand wand;

  @Before 
  public void before() {
    wand = new PhoenixWand(30);
  }

  @Test
  public void canCastHealing() {
    String spell = "fire!";
    assertEquals("Wand casts fire! at power level: 30", wand.cast(spell));
  }
}