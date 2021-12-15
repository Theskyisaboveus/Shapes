package shapes;
/**
 *
 * @author m-keeka
 */
import java.util.ArrayList;
import java.util.Scanner;
public class Shapes
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        char moreShapes;
        ArrayList<Shape> shapes = new ArrayList<>();
        do
        {
            System.out.println("Please enter '1' to add a rectangle, '2' for a circle, '3' for a cuboid, '4' for a cylinder, or '5' for a triangle.");
            int choice = scanner.nextInt();
            switch(choice)
            {
                case 1: System.out.println("Please enter the length, followed by the width of the rectangle.");
                Rectangle rectangle = new Rectangle(scanner.nextDouble(),scanner.nextDouble());
                shapes.add(rectangle);
                    break;
                case 2: System.out.println("Please enter the radius.");
                Circle circle = new Circle(scanner.nextDouble());
                shapes.add(circle);
                    break;
                case 3: System.out.println("Please enter the length, followed by the width, followed by the depth of the cuboid.");
                Cuboid cuboid = new Cuboid(scanner.nextDouble(),scanner.nextDouble(),scanner.nextDouble());
                shapes.add(cuboid);
                    break;
                case 4: System.out.println("Please enter the radius, followed by the depth of the cylinder.");
                Cylinder cylinder = new Cylinder(scanner.nextDouble(),scanner.nextDouble());
                shapes.add(cylinder);
                    break;
                case 5: System.out.println("Please enter the height, followed by the base of the triangle.");
                Triangle triangle = new Triangle(scanner.nextDouble(),scanner.nextDouble());
                shapes.add(triangle);
                    break;
                default: System.out.println("That was not an option.");
            }
            System.out.println("Please enter 'Y' to enter another shape or 'N' to finish.");
            moreShapes = scanner.next().charAt(0);
        }
        while(moreShapes=='y'||moreShapes=='Y');
        for(Shape shape : shapes )
        {
            System.out.println("-------------------------------------------");
            System.out.println(shape.toString());
            System.out.println("Area: " + shape.Area());
            if(shape instanceof Polygon)
            {
                System.out.println("Sides: " + ((Polygon)shape).Sides());
                if(shape instanceof Triangle)
                {
                    System.out.println("Height: " + ((Triangle)shape).Height());
                    System.out.println("Base: " + ((Triangle)shape).Base());
                }  
                if(shape instanceof Rectangle)
                {
                    System.out.println("Length: " + ((Rectangle)shape).Length());
                    System.out.println("Width: " + ((Rectangle)shape).Width());
                    if(shape instanceof Cuboid)
                    {
                        System.out.println("Height: "+((Cuboid)shape).Height());
                        System.out.println("Faces: " + ((Cuboid)shape).Faces());
                        System.out.println("Cross Sectional Shape: "+((Cuboid)shape).CrossSectionalShape());
                        System.out.println("Volume: "+((Cuboid)shape).Volume());
                    }
                }  
            }
            if(shape instanceof Circle)
            {
                System.out.println("Radius: "+((Circle)shape).Radius());
                System.out.println("Circumference: "+((Circle)shape).Circumference());
                System.out.println("Diameter: "+((Circle)shape).Diameter());
                if(shape instanceof Cylinder)
                {
                    System.out.println("Height: "+((Cylinder)shape).Height());
                    System.out.println("Faces: " + ((Cylinder)shape).Faces());
                    System.out.println("Cross Sectional Shape: "+((Cylinder)shape).CrossSectionalShape());
                    System.out.println("Volume: "+((Cylinder)shape).Volume());
                }
            }
        }
    }
}