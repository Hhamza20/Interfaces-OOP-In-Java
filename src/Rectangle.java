public class Rectangle extends ShapeWithArea implements BasicShape,Displayable{
    private long width;
    private long length;
    public Rectangle(long width, long length){
        this.width=width;
        this.length=length;
        calcArea();
    }

    public long getLength() {
        return length;
    }

    @Override
    public void calcArea() {
        area=length*width;
    }
    @Override
    public void display() {
        System.out.println("Area of Circle : "+getArea()+"\tLength and Width are: "+length+" "+width);
    }

    @Override
    public void displayWithPrecision(int precision) {
        System.out.printf("%."+precision+"f",getArea());
    }
}
