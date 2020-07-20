package BT_CircleandCylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(String color, double radius, double height) {
        super(color, radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return Math.pow(this.getRadius(),2)*Math.PI*this.height;
    }

    @Override
    public double getPerimeter() {
        return 2*this.getRadius()*Math.PI*this.getHeight();
    }

    @Override
    public String toString() {
        return "Cylinder {color: "+this.getColor()+"; radius: " +this.getRadius()+"; height: "+this.getHeight()
                + "; Area: " +this.getArea()+"; Perimeter: "+this.getPerimeter();
    }

    public static void main(String[] args) {
        Cylinder cylinder=new Cylinder("yellow",10,20);
        System.out.println(cylinder);
    }
}
