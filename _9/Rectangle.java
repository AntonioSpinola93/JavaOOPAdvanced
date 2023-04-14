package AdvancedJavaOOP._9;

public class Rectangle extends GeometricShape{


    public Rectangle(double height, double widht) {
        super(height, widht);
        
    }

    public void rectangleArea(){
        double area = height * widht;
        System.out.println("Area del rettangolo : "+height+ " * "+ widht+ " = "+area);

    }
}
