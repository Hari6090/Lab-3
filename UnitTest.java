import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Command.Keyboard;
import Facade.GamingOrder;

public class UnitTest {
	@Test
	public void commandTest() {
		Keyboard keyboard = new Keyboard();
		assertEquals("\nQwerty keyboard order processed", keyboard.Qwerty());
	}
	
	public void facadeTest() {
		Keyboard keyboard = new Keyboard();
		assertEquals("\nGaming keyboard order processed", keyboard.Gaming());
	}
}
