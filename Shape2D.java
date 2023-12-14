public class Shape2D {
    final double pi = 3.14;
    private double height;
    private double radious;
    private double width;

    public Shape2D(double height,double width){
        this.height = height;
        this.width = width;
    }
    public Shape2D(double radious){
        this.radious = radious;
    }

    public double getHeight() {
        return height;
    }

    public double getPi() {
        return pi;
    }

    public double getRadious() {
        return radious;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setRadious(double radious) {
        this.radious = radious;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getarea(){
        return (4/3 * this.pi * this.radious * this.radious * this.radious);
    }

    @Override
    public String toString() {
        return "Area is : " + getarea();
    }
}
