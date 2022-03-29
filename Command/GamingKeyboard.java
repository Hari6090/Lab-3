package Command;

public class GamingKeyboard implements KeyboardOrder {

	private Keyboard keyboard;

	public GamingKeyboard(Keyboard keyboard) {
		this.keyboard = keyboard;
	}

	@Override
	public String order() {
		// TODO Auto-generated method stub
		return keyboard.Gaming();
	}

}
