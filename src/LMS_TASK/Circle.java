package LMS_TASK;

public class Circle {
    private int radius;
    final double pi = Math.PI;

    public Circle() {
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", pi=" + pi +
                '}';
    }
    public static void circumferense(Circle circle){

        double v = Math.PI * (circle.getRadius() * circle.getRadius());
        System.out.println(v);
    }
    public static void area(Circle circle){
        double l = Math.PI * 2 * circle.getRadius();
        System.out.println(l);
    }
//    PI * (radius * radius)
////circumferenceти табуу учун PI * 2 * radius
}
