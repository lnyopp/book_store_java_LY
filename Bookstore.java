import java.io.IOException;
import java.util.ArrayList;

public class Bookstore {

    String name;
    int dateEst;
    String location;
    int size;
    boolean usedBooks;

    public Bookstore(String name, String location, int dateEst, int size, boolean usedBooks) {
        this.name = name;
        this.location = location;
        this.size = size;
        this.usedBooks = usedBooks;
        this.dateEst = dateEst;

        titles = new ArrayList<String>();
        loadTitles();

    }

    public void getTitles() {

        System.out.println("We have the following titles(and many more!) : ");
        titles.forEach((n) -> System.out.println(n));

    }

    private ArrayList<String> titles;

    private void loadTitles() {
        try {
            Utils.loadStringsToArray(this.titles);
        } catch (IOException e) {
            // for now simply init the array to zero
            System.out.println("Could not initilize the titles");
            // make sure it is empty
            this.titles = new ArrayList<String>();

        }
    }
}