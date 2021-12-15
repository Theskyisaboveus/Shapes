package shapes;
/**
 *
 * @author m-keeka
 */
public class Cuboid extends Rectangle implements ThreeDimensionalObject 
{
    private double height = 0;
    public Cuboid(double length, double width, double height)
    {
        super(length, width);
        this.height = height;
    }
    @Override
    public int Faces()
    {
        return 6;
    }
    @Override
    public double Height()
    {
        return height;
    }
    @Override
    public String CrossSectionalShape()
    {
        return "Rectangle";
    }
    @Override
    public double Area()
    {
        return (Length() * Width() * 2) + (Length() * height * 2) + (Width() * height * 2);
    }
    @Override
    public double Volume()
    {
        return Length() * Width() * height;
    }
    @Override
    public int Sides()
    {
        return 12;
    }
}
