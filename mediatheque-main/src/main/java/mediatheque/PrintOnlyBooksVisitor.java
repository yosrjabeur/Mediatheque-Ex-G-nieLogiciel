package mediatheque;

public class PrintOnlyBooksVisitor implements Visitor {

    @Override
    public void visit(Book book) {
        System.out.println("Imprimer les détails du livre : " + book.getTitle());
    }

    @Override
    public void visit(CD cd) { }
}