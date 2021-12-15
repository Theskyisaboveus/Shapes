package shapes;
/**
 *
 * @author m-keeka
 */
public class Circle implements Shape
{
    private double radius = 0;
    public Circle(double radius)
    {   
        this.radius = radius;
    }
    public double Radius()
    {
        return radius;        
    }
    public double Diameter()
    {
        return radius*2;        
    }
    public double Circumference()
    {
        return Diameter()*Math.PI;        
    }
    @Override
    public double Area()
    {
        return radius*radius*Math.PI;        
    }
}
