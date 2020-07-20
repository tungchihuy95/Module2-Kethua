package BT_CircleandCylinder;

public class Circle {
    private String color;
    private double radius;

    public Circle() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(String color, double radius) {
        this.color = color;
        this.radius = radius;
    }

    public double getArea() {
        return Math.pow(this.radius,2)*Math.PI;
    }
    public double getPerimeter() {
        return this.radius*2*Math.PI;
    }

    @Override
    public String toString() {
        return "shape.Circle {color: "+this.getColor()+"; radius: " +this.getRadius()
                + "; Area: " +this.getArea()+"; Perimeter: "+this.getPerimeter();
    }

    public static void main(String[] args) {
        Circle circle=new Circle("red",100);
        System.out.println(circle);
    }
}
