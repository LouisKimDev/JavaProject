package FinalExam;

public class ExamTester {
    public static void main(String[] args){
        Book book = new Book();
        EMail email = new EMail();

        book.getAuthors();

        book.addAuthor("Kim");
        System.out.println("title of the book: "+book.getTitle());
        System.out.println("Author of the book: "+book.getAuthors());
        System.out.println("Dat of the book: "+book.getDate());

        email.addAuthor("Park");
        System.out.println("The subject of the Email: " + email.getSubject());
        System.out.println("The recipient of the Email: "+email.getTo());





    }
}
