public class Cone extends Shape3D{
    public Cone(double height, double radious){
        super(height,radious);
    }
    public double getvolume(){
        return (1/3 * getPi() * getRadious() * getRadious() * getHeight());
    }
    public double getarea(){
        return (getPi() * getRadious() * getHeight());
    }
}
