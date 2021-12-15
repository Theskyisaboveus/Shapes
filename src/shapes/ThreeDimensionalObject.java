package shapes;
/**
 *
 * @author m-keeka
 */
public interface ThreeDimensionalObject extends Shape
{
    double Height();
    double Volume();
    int Faces();
    String CrossSectionalShape();
}
