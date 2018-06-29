package uebung;

public class Hunger {
	public static void main(String[] args) {
		Essbar schoko = new Schokolade();
		Essbar chips = new Chips();
		Essbar pizza = new Pizza();
		schoko.essen();
		chips.essen();
		pizza.essen();
	}
}
