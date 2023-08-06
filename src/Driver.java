public class Driver {
    public static void main(String[] args) {
        Circle c1=new Circle(33,55,20.9);
        Rectangle r1=new Rectangle(200,100);
        c1.display();
        c1.displayWithPrecision(4);
        System.out.println("\n");
        r1.display();
        r1.displayWithPrecision(2);
    }
}
