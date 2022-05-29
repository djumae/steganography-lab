import java.awt.*;

public class Steganography {
    /**
     * Clear the lower (rightmost) two bits in a pixel.
     */
    public void Steganography(){}

    public static void clearLow( Pixel p )
    {
        Color rgbNum;
        int rgbRed;
        int rgbGreen;
        int rgbBlue;
        rgbNum = p.getColor();
        rgbRed = rgbNum.getRed();
        rgbGreen = rgbNum.getGreen();
        rgbBlue = rgbNum.getBlue();
        rgbNum.red  = (rgbRed /4) *4;
        rgbNum.green = (rgbGreen / 4) * 4;
        rgbNum.blue = (rgbBlue / 4 ) * 4;

        //somehow use the setColor method in Pixel class.



        }
    }

