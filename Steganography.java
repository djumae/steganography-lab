import java.awt.*;

public class Steganography {
    /**
     * Clear the lower (rightmost) two bits in a pixel.
     */
    public void Steganography(){}

    public static void clearLow( Pixel p )
    {
        Color rgbNum = p.getColor();;
        int rgbRed;
        int rgbGreen;
        int rgbBlue;
        rgbRed = rgbNum.getRed();
        rgbGreen = rgbNum.getGreen();
        rgbBlue = rgbNum.getBlue();
        int newRed = rgbRed / 4 * 4;
        rgbNum.getRed()  = rgbRed.setRed(newRed);
        rgbNum.green = rgbGreen.setGreen(rgbGreen / 4 *4) ;
        rgbNum.blue = rgbBlue.setBlue(rgbBlue / 4 * 4) ;


        //somehow use the setColor method in Pixel class.



        }
    }

