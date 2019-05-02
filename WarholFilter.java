import java.awt.Color;
/**
 * Write a description of class WarholFilter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WarholFilter extends Filter
{
    // instance variables - replace the example below with your own
   private OFImage original;
   private int width;
   private int height;
    
   public WarholFilter(String name)
   {
       super(name);
   }
   
   public void apply(OFImage image)
   {
      original = new OFImage(image);
      width = original.getWidth();
      height = original.getHeight(); 
      
      
      
      
      
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
