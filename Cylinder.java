public class Cylinder extends Shape3D{
    public Cylinder(double height, double radious){
        super(height, radious);
    }
    public double getvolume(){
        return (getPi() * getRadious() * getRadious() * getHeight());
    }
    public double getarea(){
        return ((2 * getPi() * getRadious() * getRadious()) + (2 * getPi() * getRadious() * getHeight()));
    }
}
