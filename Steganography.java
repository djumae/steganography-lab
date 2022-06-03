import java.awt.*;

public class Steganography {
    /**
     * Clear the lower (rightmost) two bits in a pixel.
     */
    public void Steganography(){}

    public static void clearLow( Pixel p )
    {

        int rgbRed;
        int rgbGreen;
        int rgbBlue;
        rgbRed = p.getRed();
        rgbGreen = p.getGreen();
        rgbBlue = p.getBlue();
        p.setRed((rgbRed /4) *4);
        p.setGreen((rgbGreen / 4) * 4);
        p.setBlue((rgbBlue / 4 ) * 4);



        }
    public static Picture testClearLow(Picture testPic){
        Picture newPic = testPic;
        Picture[] picArray = new Picture[][]
        for (int x =0, )



        return newPic;
    }
}

