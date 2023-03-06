import java.util.Scanner;
public  class Book {

    private Author author;
    private int year;
    private String title;
    public Book(Author author,int year, String title) {
        this.year = year;
        this.title = title;
    }
    public int getYear() {
        return year;
    }
    public String getTitle() {
        return title;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public void setAuthor(Author author) {
        this.author = author;
    }
    public void setTitle(String title) {
        this.title = title;
    }


    public static void main(String[] args) {

        Scanner aa = new Scanner(System.in);
        String name, gender, email;
        //
        System.out.println("Введите имя ");
        name = aa.next();
        System.out.println("Введите пол ");
        gender = aa.next();
        System.out.println("Введите почту ");
        email = aa.next();

        Author a = new Author(name, gender, email);
        System.out.println(a);

        //
        String title;
        int year;
        //

        Scanner ab = new Scanner(System.in);
        System.out.println("Введите название ");
        title = ab.nextLine();
        System.out.println("Введите год ");
        year = ab.nextInt();

        Book b = new Book(null, year, title);
        System.out.println(b);

    }
}
