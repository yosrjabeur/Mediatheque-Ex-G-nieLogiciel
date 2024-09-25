package mediatheque;

public class printCatalog implements Visitor {
    
    public void printCatalog() {
            for (Item i : items)
                i.print();
        }
}