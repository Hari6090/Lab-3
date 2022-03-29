package Command;

import java.util.ArrayList;
import java.util.List;

public class OrderCommand {

	private List<KeyboardOrder> keyboardList = new ArrayList<KeyboardOrder>();

	public void placeOrder(KeyboardOrder keyboardOrder) {
		keyboardList.add(keyboardOrder);
	}

	public void keyboardPlaceOrder() {
		for (KeyboardOrder keyboardOrder : keyboardList) {
			System.out.println(keyboardOrder.order());
		}
	}
}
