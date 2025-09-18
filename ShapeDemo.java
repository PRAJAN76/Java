abstract class Shape {
    int dim1;
    int dim2;
    abstract void printArea();
}
class Rectangle extends Shape {
    Rectangle(int length, int breadth) {
        this.dim1 = length; 
        this.dim2 = breadth;
    }
    @Override
    void printArea() {
        int area = dim1 * dim2;
        System.out.println("Area of Rectangle: " + area);
    }
}
class Triangle extends Shape {
    Triangle(int base, int height) {
        this.dim1 = base;
        this.dim2 = height;
    }
    @Override
    void printArea() {
        double area = 0.5 * dim1 * dim2;
        System.out.println("Area of Triangle: " + area);
    }
}
class Circle extends Shape {
    Circle(int radius) {
        this.dim1 = radius;
        this.dim2 = 0;
    }
    @Override
    void printArea() {
        double area = Math.PI * dim1 * dim1;
        System.out.println("Area of Circle: " + area);
    }
}
public class ShapeDemo {
    public static void main(String[] args) {
        Shape rect = new Rectangle(5, 10);
        rect.printArea(); 

        Shape tri = new Triangle(4, 8);
        tri.printArea(); 

        Shape circ = new Circle(7);
        circ.printArea(); 
    }
}