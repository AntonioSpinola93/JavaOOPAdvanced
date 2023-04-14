package AdvancedJavaOOP._9;

public abstract class GeometricShape {
    public double height, widht;

    public GeometricShape(double height, double widht) {
        this.height = height;
        this.widht = widht;

    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidht() {
        return widht;
    }

    public void setWidht(double width) {
        this.widht = width;
    }
}
