import java.awt.Color;
/**
 * Write a description of class BlueFilter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BlueFilter extends Filter
{
    
    public BlueFilter(String name)
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
                int bluevalue = pix.getBlue(); 
                image.setPixel(x, y, new Color(bluevalue, bluevalue, bluevalue));
            }
        }
        
    }
}