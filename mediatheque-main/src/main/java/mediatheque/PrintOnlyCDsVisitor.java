package mediatheque;

public class PrintOnlyCDsVisitor implements Visitor {

    @Override
    public void visit(Book book) { }

    @Override
    public void visit(CD cd) {
        System.out.println("Imprimer les détails du CD : " + cd.getTitle());
    }
}

