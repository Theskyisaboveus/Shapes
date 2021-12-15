package shapes;
/**
 *
 * @author m-keeka
 */
public class Rectangle implements Polygon
{
    private double length = 0;
    private double width = 0;
    public Rectangle(double length, double width)
    {
        this.length = length;
        this.width = width;
    }
    @Override
    public int Sides()
    {
        return 4;
    }
    @Override
    public double Area()
    {
        return length * width;
    }
    public double Length()
    {
        return length;
    }
    public double Width()
    {
        return width;
    }
}
