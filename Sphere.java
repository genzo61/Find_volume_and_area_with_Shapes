public class Sphere extends Shape3D{
    public Sphere(double depth, double radious){
        super(depth,radious);
    }
    public double getvolume(){
        return (4/3 * getPi() * getRadious() * getRadious() * getRadious());
    }
    public double getarea(){
        return (4 * getPi() * getRadious() * getRadious());
    }
}
