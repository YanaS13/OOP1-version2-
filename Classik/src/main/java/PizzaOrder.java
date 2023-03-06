import java.util.Scanner;
public  class PizzaOrder {

    private String name;

    private boolean needSous;
    private String address;
    public boolean orderAcc = false;
    private String size;

    //
    public PizzaOrder(String name, String size, boolean needSous, String address) {
        this.name = name;
        this.size = size;
        this.needSous = needSous;
        this.address = address;
    }

    public void order() {

        if (!orderAcc) {
            if (needSous) {
                System.out.println("Заказ принят." + this.size + " пицца " + this.name + " с соусом на адрес " + this.address);
                this.orderAcc = true;
            } else {
                System.out.println("Заказ принят. " + this.size + " пицца " + this.name + " без соуса на адрес " + this.address);
                this.orderAcc = true;
            }
        } else {
            System.out.println("Заказ уже принят");
        }
    }

    public void cancel() {
        System.out.println("Заказ не был принят");
        this.orderAcc = false;
    }

    public String getName() {
        return name;
    }

    public boolean isNeedSous() {
        return needSous;
    }

    public String getSize() {
        return size;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setNeedSous(boolean needSous) {
        this.needSous = needSous;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        String name, gender, email, address, ch;
        int b;
        Boolean needsoys;
        String size;
        //
        System.out.println("Название пиццы ");
        name = a.nextLine();
        System.out.println("Выберите размер ");
        size = a.nextLine();
        System.out.println("Введите адрес ");
        address = a.nextLine();
        System.out.println("Нужен соус?");
        System.out.println("Если с соусом то 1, если без то 0");
        b = a.nextInt();
        if (b == 1){needsoys = true;}else{needsoys = false;}

        PizzaOrder P = new PizzaOrder(name, size, needsoys, address);

        P.order();

        P.order();
        P.cancel();

        System.out.println(P);
    }
}
