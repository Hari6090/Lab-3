import java.util.Scanner;

import Command.GamingKeyboard;
import Command.Keyboard;
import Command.KeyboardOrder;
import Command.OrderCommand;
import Command.Qwerty;
import Facade.KeyBoardFactory;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean flag = true;

		System.out.println("\nKeyboard Factory...");
		String keyboardType;
		Scanner scan = new Scanner(System.in);
		int orderCount;
		System.out.println("\nEnter keyboard type(Qwerty/Gaming) to place an order: ");
		keyboardType = scan.next();
		System.out.println("Enter order count: ");
		orderCount = scan.nextInt();

		OrderCommand orderCommand = new OrderCommand();

		Keyboard keyboard = new Keyboard();

		KeyboardOrder keyboardOrder = null;

		KeyBoardFactory keyBoardFactory = new KeyBoardFactory();

		if (keyboardType.equalsIgnoreCase("Qwerty")) {
			keyboardOrder = new Qwerty(keyboard);
			keyBoardFactory.displayQwertyOrder();

		} else if (keyboardType.equalsIgnoreCase("Gaming")) {
			keyboardOrder = new GamingKeyboard(keyboard);
			keyBoardFactory.displayGamingOrder();

		} else {
			System.out.println("Invalid Keyboard name...");
		}
		orderCommand.placeOrder(keyboardOrder);
		orderCommand.keyboardPlaceOrder();

	}
}
