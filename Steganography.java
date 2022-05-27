import java.awt.*;

public class Steganography {
    /**
     * Clear the lower (rightmost) two bits in a pixel.
     */
    public void Steganography(){}

    public static void clearLow( Pixel p )
    {
        int count;
        Color rgbNum;
        int rgbRed;
        int green;
        int blue;
        rgbNum = p.getColor();
        rgbRed = rgbNum.getRed();
        System.out.println(rgbRed);
        }
    }

