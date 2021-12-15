package shapes;
/**
 *
 * @author m-keeka
 */
public class Triangle implements Polygon
{
    private double base;
    private double height;
    public Triangle(double height, double base)
    {   
        this.base = base;
        this.height = height;
    }
    @Override
    public int Sides()
    {
        return 3;
    }
    @Override
    public double Area()
    {
        return 0.5 * base * height;        
    }
    public double Base()
    {
        return base;        
    }
    public double Height()
    {
        return height;        
    }
}
