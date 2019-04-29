import java.awt.Color;
/**
 * Write a description of class GreenFilter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GreenFilter extends Filter
{
    
    public GreenFilter(String name)
    {
        super(name);
    }
    
    public void apply(OFImage image)
    {
        int height = image.getHeight();
        int width = image.getWidth();
        for(int y = 0; y < height; y++) {
            for(int x = 0; x < width; x++) {
                Color pix = image.getPixel(x, y);
                int greenvalue = pix.getGreen(); 
                image.setPixel(x, y, new Color(greenvalue, greenvalue, greenvalue));
            }
        }
        
    }
}