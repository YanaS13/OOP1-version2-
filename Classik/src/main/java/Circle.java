import java.util.Scanner;
public class Circle {

    public int radius;
    public String color;
    //
    public Circle(int radius, String color)  {
        this.radius = radius;
        this.color = color;
    }
    public void area() {
        System.out.println("Площадь: " + 3.14*radius*radius);
    }
    public void perimeter() {
        System.out.println("Периметр: " + 3.14*radius);
    }

    public String toString() {
        return "Радиус: " + this.radius + ", цвет: " + this.color ;
    }

    public static void main(String[] args) {
        Scanner aa = new Scanner(System.in);
        int radius;
        String color;
        //
        System.out.println("Введите радиус ");
        radius = aa.nextInt();
        System.out.println("Введите цвет");
        color = aa.next();

        Circle c = new Circle(radius, color);

        c.area();
        System.out.println();

        c.perimeter();
        System.out.println();

        System.out.println(c);
    }
}