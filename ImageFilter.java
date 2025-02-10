import org.code.theater.*;
import org.code.media.*;

public class ImageFilter extends ImagePlus {

  // Constructor that initializes the image file
  public ImageFilter(String filename) {
    super(filename); // Call the constructor of the parent class ImagePlus with the filename
  }

  // Method to create a negative effect on the image
  public void makeNegative() {
    // Retrieve the pixel array of the image
    Pixel[][] pixels = getImagePixels();

    // Loop through each row of the pixel array
    for (int row = 0; row < pixels.length; row++) {
      // Loop through each column of the pixel array
      for (int col = 0; col < pixels[0].length; col++) {

        // Get the current pixel at the specified row and column
        Pixel currentPixel = pixels[row][col];

        // Calculate the new red value by subtracting the current red value from 255
        int newRed = 255 - currentPixel.getRed();
        currentPixel.setRed(newRed); // Set the new red value to the current pixel

        // Calculate the new green value by subtracting the current green value from 255
        int newGreen = 255 - currentPixel.getGreen();
        currentPixel.setGreen(newGreen); // Set the new green value to the current pixel

        // Calculate the new blue value by subtracting the current blue value from 255
        int newBlue = 255 - currentPixel.getBlue();
        currentPixel.setBlue(newBlue); // Set the new blue value to the current pixel
      }
    }
  }
}