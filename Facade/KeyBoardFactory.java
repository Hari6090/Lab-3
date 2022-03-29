package Facade;

public class KeyBoardFactory {
	private KeyFactory qwertyOrder;
	private KeyFactory gamingOrder;

	public KeyBoardFactory() {
		qwertyOrder = new QwertyOrder();
		gamingOrder = new GamingOrder();
	}

	public void displayQwertyOrder() {
		qwertyOrder.orderStatus();
	}

	public void displayGamingOrder() {
		gamingOrder.orderStatus();
	}
}
