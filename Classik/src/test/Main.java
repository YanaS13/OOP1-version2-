public class Main {

    public static void Main(String[] args) {

        Scanner a = new Scanner(System.in);

        String name, gender, email;
        //
        System.out.println("Введите имя ");
        name = a.next();
        System.out.println("Введите пол ");
        gender = a.next();
        System.out.println("Введите почту ");
        email = a.next();

        Author a = new Author(name, gender, email);
        System.out.println(a);

        //
        String title;
        int years;
        //
        System.out.println("Введите название ");
        title = a.nextLine();
        System.out.println("Введите год ");
        year = a.nextInt();

        Book b = new Book(author, year, title);
        System.out.println(b);

        gender.getGender();
        System.out.println();

        name.getName();
        System.out.println();

        email.getEmail();
        System.out.println();

        year.getYear();
        System.out.println();

        title.getTitle();
        System.out.println();

    }
}