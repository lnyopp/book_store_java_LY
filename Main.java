public class Main {
    public static void main(String[] args) {

        Bookstore bookstore = new Bookstore("Bookstar", "Apex", 2001, 100000, true);
        // Bookstore bookstore3 = new Bookstore("Bookstar", "Apex", 13000, true);

        System.out.println("A Little bit about us!");
        System.out.println("We are called: " + bookstore.name);

        System.out.println(bookstore.name + " was established in " + bookstore.dateEst);
        System.out.println("We are located in " + bookstore.location + ", In a " + bookstore.size
                + " sqaure foot 2 story building.");
        System.out.println("We are open from 8am - 10pm M-F, 9am - 11 pm Saturday, and 11 am - 5pm on Sunday");

        System.out.println("You might ask yourself does " + bookstore.name + " have used books?");
        System.out.println("Answer: " + bookstore.usedBooks);
        System.out.println("Here's a sample of some of our books : ");
        bookstore.getTitles();

    }
}
