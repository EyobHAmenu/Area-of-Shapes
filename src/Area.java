import java.util.Scanner;

public class Area {

    public static void main(String[] args) {

        double radius, base, height, length, width, circleArea,
                triangleArea, rectangleArea,squareArea;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter radius of the circle: ");
        radius = in.nextDouble();
        circleArea = getCircleArea(radius);
        System.out.println("Area of the circle is " + circleArea);

        System.out.print("Enter base of the triangle: ");
        base = in.nextDouble();
        System.out.print("Enter height of the triangle: ");
        height = in.nextDouble();
        triangleArea = getTriangleArea(base,height);
        System.out.println("Area of the triangle is " + triangleArea);

        System.out.print("Enter length of the rectangle: ");
        length = in.nextDouble();
        System.out.print("Enter width of the rectangle: ");
        width = in.nextDouble();
        rectangleArea = getRectangleArea(length,width);
        System.out.println("Area of the rectangle is " + rectangleArea);


        System.out.print("Enter length of the square: ");
        length = in.nextDouble();
        squareArea = getSquareArea(length);
        System.out.println("Area of the square is " + squareArea);


    }
    //Method that calculate area of circle
    public static double getCircleArea(double radius){
        final double PI = 3.14;
        double area;
        area = PI * radius * radius;
        return area;
    }

    //Method that calculate triangle
    public static double getTriangleArea(double base, double height){
        double area;
        area = (base * height) / 2;
        return area;
    }

    //Method that calculate area of rectangle
    public static double getRectangleArea(double length, double width){
        double area;
        area = length * width;
        return area;
    }

    //Method that calculate area of square
    public static double getSquareArea(double length){
        double area;
        area = length * length;
        return area;
    }


}
