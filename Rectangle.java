public class Rectangle extends Shape2D{
    public Rectangle(double height, double width){
        super(height,width);
    }
    public double getarea(){
        return (getHeight() * getWidth());
    }
}
