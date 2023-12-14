public class Pyramid extends Shape3D{
    public Pyramid(double depht, double height, double width){
        super(depht,height,width);
    }
    public double getvolume(){
        return (1/3 * getDepth() * getHeight() * getWidth());
    }
    public double getarea(){
        return ((2 * getHeight() * getDepth() * getWidth()) + (getDepth() * getDepth()));
    }
}
