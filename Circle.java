public class Circle extends Shape2D {
    public Circle(double radious){
        super(radious);
    }
    public double getarea(){
        return (getPi() * getRadious() * getRadious());
    }
}
