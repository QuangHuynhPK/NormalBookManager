import dao.GenericDao;
import model.Author;
import service.AuthorServiceImpl;

public class Main {
    public static void main(String[] args) {
        GenericDao<Integer, Author> author = new AuthorServiceImpl();
    }
}
