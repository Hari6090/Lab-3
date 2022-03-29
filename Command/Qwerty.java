package Command;

public class Qwerty implements KeyboardOrder{
	
	private Keyboard keyboard;
	
	public Qwerty(Keyboard keyboard) {
		this.keyboard = keyboard;
	}
	@Override
	public String order() {
		// TODO Auto-generated method stub
		return keyboard.Qwerty();
	}

}
