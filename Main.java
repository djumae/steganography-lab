import java.awt.Color;

public class Main {
  public static void main(String[] args) {
    Steganography steg = new Steganography();
    
    // Activity 1.8
    
    Picture beach = new Picture ("beach.jpg");
    beach.explore();
    //Picture copy = steg.testClearLow(beach);
    //commented out for testing
    //copy.explore();
    
    
    // Activity 1.12
    /*
    Picture beach2 = new Picture ("beach.jpg");
    beach2.explore();
    Picture copy2 = steg.testSetLow(beach2, Color.PINK);
    copy2.explore();
    */
    
    // Activity 1.14
    /*
    Picture copy3 = steg.revealPicture(copy2);
    copy3.explore();
    */
    System.out.println(Steganography.clearLow(Pixel ));
  }
}