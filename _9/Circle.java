package AdvancedJavaOOP._9;

public class Circle extends GeometricShape{


    public Circle(double height, double widht) {
        super(height, widht);
    }
    public void circleArea(){
        double area = Math.PI * Math.pow((height / 2), 2);

        System.out.println("Area del cerchio : "+ area);
    }
}
