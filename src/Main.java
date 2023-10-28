import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные для табуретки: ");
        System.out.println("Введите цвет табуретки: ");
        String color = scanner.nextLine();
        System.out.println("Введите высоту табуретки");
        int height = scanner.nextInt();
        Stool stool1 = new Stool(color, height );
        stool1.print();
        BarChair barChair1 = new BarChair("red", 200);
        barChair1.print();
        Closet closet1 = new Closet(10);
        closet1.showAmountOfCells();
    }
}
