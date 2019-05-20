package season_3.HeCacDoiTuongHinhHoc;

public class Circle extends Shape {
    private double radius = 1.0;
    public Circle(){};
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){
        super(color,filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getAre(){
        return radius*radius*Math.PI;
    }

    public double getPerieter(){
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString(){
        return "A Circle with radius = "
                + getRadius()
                + ", Which is a subclass of "
                        +super.toString();
    }
}
