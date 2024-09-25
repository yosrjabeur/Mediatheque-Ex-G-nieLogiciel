package mediatheque;

import java.util.LinkedList;
import java.util.List;

public class Mediatheque {
	private final List<Item> items = new LinkedList<>();

	public void addItem(Item i) {
		items.add(i);
	}
	
	public void printCatalog() {
		for (Item i : items)
			i.print();
	}
	
	public void printOnlyBooks() {
		PrintOnlyBooksVisitor printBooksVisitor = new PrintOnlyBooksVisitor();
		for (Item item : items) {
			item.accept(printBooksVisitor);
		}
	}

	public void printOnlyCDs() {
		PrintOnlyCDsVisitor printCDsVisitor = new PrintOnlyCDsVisitor();
		for (Item item : items) {
			item.accept(printCDsVisitor);
		}
	}

}
