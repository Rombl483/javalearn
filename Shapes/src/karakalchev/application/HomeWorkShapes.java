package karakalchev.application;

import java.util.Arrays;

import karakalchev.libraries.Shape;
import karakalchev.libraries.ShapePerimeterComparator;
import karakalchev.libraries.ShapeAreaComparator;
import karakalchev.libraries.shapes.Circle;
import karakalchev.libraries.shapes.Rectangle;
import karakalchev.libraries.shapes.Square;
import karakalchev.libraries.shapes.Triangle;


public class HomeWorkShapes {
    public static void main(String[] args) {
        ShapePerimeterComparator shapeMaxPerimeter = new ShapePerimeterComparator();
        ShapeAreaComparator shapeMaxArea = new ShapeAreaComparator();

        Shape[] shapes = new Shape[10];

        shapes[0] = new Circle(5);
        shapes[1] = new Triangle(1, 2, 4, 7, 7, 2);
        shapes[2] = new Rectangle(10, 5);
        shapes[3] = new Square(10);
        shapes[4] = new Circle(15);
        shapes[5] = new Triangle(1, 2, 7, 10, 7, 2);
        shapes[6] = new Rectangle(3, 3);
        shapes[7] = new Square(7);
        shapes[8] = new Rectangle(3, 4);
        shapes[9] = new Square(4);

        for (Shape e : shapes) {
            System.out.println(e);
            System.out.printf(" Площадь = %.2f%n", e.getArea());
            System.out.printf(" Периметр = %.2f%n", e.getPerimeter());
            System.out.println();
        }

        Arrays.sort(shapes, shapeMaxArea);

        System.out.println("Фигура с максимальной площадью:");
        System.out.println(shapes[0]);
        System.out.printf(" Площадь = %.2f%n", shapes[0].getArea());
        System.out.println();

        Arrays.sort(shapes, shapeMaxPerimeter);

        System.out.println("Фигура с 2-м по величине периметром:");
        System.out.println(shapes[1]);
        System.out.printf(" Периметр = %.2f%n", shapes[1].getPerimeter());
    }
}
