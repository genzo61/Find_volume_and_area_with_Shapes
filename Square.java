public class Square extends Shape2D{
    public Square(double width){
        super(width);
    }
    public double getarea(){
        return (getWidth() * getWidth());
    }
}
