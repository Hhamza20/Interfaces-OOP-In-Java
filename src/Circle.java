public class Circle extends ShapeWithArea implements Displayable{
    private long centerX;
    private long centerY;
    private double radius;
    public Circle(long centerX,long centerY,double radius){
        this.radius=radius;
        this.centerX=centerX;
        this.centerY=centerY;
        calcArea();
    }

    public long getCenterX() {
        return centerX;
    }

    public long getCenterY() {
        return centerY;
    }

    @Override
    public void calcArea() {
        area=3.14159*radius*radius;
    }

    @Override
    public void display() {
        System.out.println("Area of Circle : "+getArea()+"\tX and Y indexes :"+getCenterX()+" "+getCenterY());
    }

    @Override
    public void displayWithPrecision(int precision) {
        System.out.printf("%."+precision+"f",getArea());
    }
}
