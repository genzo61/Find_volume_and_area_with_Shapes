public class Shape3D extends Shape2D{
    private double depth;

    public Shape3D(double depth,double height,double width){
        super(height, width);
        this.depth = depth;
    }
    public Shape3D(double height, double radious){
        super(height,radious);
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public double getDepth() {
        return depth;
    }
    public double getvolume(){
        return (getDepth() * getHeight() * getWidth());
    }
}
