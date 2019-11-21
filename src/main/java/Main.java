import dao.GenericDao;
import model.Author;
import service.AuthorServiceImpl;

public class Main {
    public static void main(String[] args) {
        GenericDao<Integer, Author> author = new AuthorServiceImpl();
        author.create(1, new Author("Quang", 45535435362l, "abc"));
        author.create(2, new Author("Duc", 3454534l, "def"));
        System.out.println(author.getInfo(2).toString());
    }
}
