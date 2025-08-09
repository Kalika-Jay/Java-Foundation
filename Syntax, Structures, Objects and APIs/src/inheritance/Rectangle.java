package inheritance;

public class Rectangle {
    protected int width;
    protected int length;
    protected double sides = 4;

    public double getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public double getSides() {
        return sides;
    }
    public void setSides(double sides) {
        this.sides = sides;
    }
    public double calculatePerimeter() {
        return width *2+ length*2;
    }

    public void print(){
        System.out.println("I'm a rectangle");
    }
}
