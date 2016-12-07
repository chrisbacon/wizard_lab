import static org.junit.Assert.*;
import org.junit.*;
import wizard_management.*;

public class WizardTest {

  Wizard wizard;
  Broomstick broomstick;
  Protectable defender;
  Wand wand;

  @Before
  public void before(){
    broomstick = new Broomstick("Nimbus", 10);
    wand = new PhoenixWand(30);
    defender = new Dragon("Erik");
    wizard = new Wizard("Toby", broomstick, defender,wand);

  }

@Test
public void canSetRide(){
  Dragon dragon = new Dragon("Erik");
  wizard.setRide(dragon);
  assertEquals("Standing up tall, beating wings, lift off!",wizard.fly());
}
  @Test
  public void canFlyDragon(){
    Dragon dragon = new Dragon("Tilly");
    wizard = new Wizard("Dumbledore", dragon, defender, wand);
    assertEquals("Standing up tall, beating wings, lift off!",wizard.fly());
  }

  @Test
  public void hasName(){
    assertEquals("Toby", wizard.getName());
  }

  @Test
  public void hasBroomstick(){
    Broomstick broomstick = (Broomstick) wizard.getRide();
    assertEquals("Nimbus", broomstick.getBrand());
  }

  @Test
  public void hasDefender(){
    Dragon dragon = (Dragon)wizard.getDefender();
    assertEquals("Erik", dragon.getName());
  }

  @Test
  public void canSetDefender(){
    Protectable ogre = new Ogre("Sid");
    wizard.setDefender(ogre);
    assertEquals("Ogre smashes attacker!", wizard.defend());
  }

  @Test
  public void canDefend(){
    assertEquals("Dragon burns attacker!", wizard.defend());
  }

  @Test
  public void canFly(){
    assertEquals(wizard.fly(),"mounting broom, running, skipping, flying!");
  }

  @Test
  public void canCast(){
    assertEquals("Wand casts fire! at power level: 30", wizard.cast("fire!"));
  }
}