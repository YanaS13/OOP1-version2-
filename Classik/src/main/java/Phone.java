import java.util.Scanner;
public class Phone {

    public  int number;
    public String model, name;
    public int weight;
    //
    public Phone() {
    }
    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }
    public Phone(int number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }
    public void receiveCall(String name) {
        System.out.println("Звонит: " + name);
    }

    public int getNumber() {
        return number;
    }

    public void receiveCall(int number, String name) {
        System.out.println("Звонит : " + name + " Его(ее) номер: " + number);
    }

    public String toString() {
        return "Номер: " + this.number + " модель:  " + this.model + " вес: " + this.weight;
    }

    public void sendMessange(int ar[]) {
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }
    }


    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int number;
        int weight;
        String model;
        //
        System.out.println("Введите номер телефона ");
        number = a.nextInt();
        System.out.println("Введите модель телефона ");
        model = a.next();
        System.out.println("Введите вес телефона ");
        weight = a.nextInt();

        Phone p = new Phone(number,model,weight);

        System.out.println(p.number + " " + p.model + " " + p.weight);
        System.out.println();

        p.getNumber();
        System.out.println();

        p.receiveCall("Anna");
        System.out.println();

        p.receiveCall(p.number, "Anna");

        System.out.println(p);

        int n;
        System.out.println("Введите количество номеров");
        n = a.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = a.nextInt();
        }
        p.sendMessange(ar);
    }
}


