package shapes;
/**
 *
 * @author m-keeka
 */
public class Cylinder extends Circle implements ThreeDimensionalObject
{
    private double height = 0;
    public Cylinder(double radius, double height)
    {
        super(radius);
        this.height = height;
    }
    @Override
    public int Faces()
    {
        return 2;
    }
    @Override
    public double Height()
    {
        return height;
    }
    @Override
    public String CrossSectionalShape()
    {
        return "Circle";
    }
    @Override
    public double Area()
    {
        return height * Circumference() + (Math.PI * Radius() * Radius() * 2);
    }
    @Override
    public double Volume()
    {
        return (Math.PI*Radius()*Radius())*height;
    }
}
