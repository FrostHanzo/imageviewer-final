import java.awt.Color;
/**
 * Write a description of class RedFilter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RedFilter extends Filter
{
    
    public RedFilter(String name)
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
                int redvalue = pix.getRed(); 
                image.setPixel(x, y, new Color(redvalue, redvalue, redvalue));
            }
        }
        
    }
}
