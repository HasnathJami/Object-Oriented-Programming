package problemsolvingfromntu;

class Circle {

    private double radius;

    public Circle() {
        radius = 3.0;
    }

    public Circle(double radius) {

        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public String toStr() {
        return "Radius=" + radius;
    }

}

public class Circle1_1 {

    public static void main(String[] args) {
        Circle c = new Circle();
        c.setRadius(8.0);
        System.out.println(c.toStr());
        System.out.println("Area of the circle=" + c.getArea());
        System.out.println("Circumference of the circle=" + c.getCircumference());

        Circle c1 = new Circle(10.0);
        System.out.println(c1.toStr());
        System.out.println("Area of the circle=" + c1.getArea());
        System.out.println("Circumference of the circle=" + c1.getCircumference());

    }

}
