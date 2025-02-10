import org.code.theater.*;
import org.code.media.*;

public class MyStory extends Scene {

  // Instance Variables
  private String[][] places; // Holds places (countries) information
  private ImageFilter[][] photos; // Holds image filter array

  // Constructor
  public MyStory(String[][] places, ImageFilter[][] photos) {
    this.places = places; // Initialize places variable
    this.photos = photos; // Initialize photos variable
  }

  // Draws the entire scene
  public void drawScene() {
    // Draw each scene in sequence
    drawFirstScene(); // Ireland
    drawSecondScene(); // Norway
    drawThirdScene(); // Switzerland
    drawFourthScene(); // Iceland
    drawFifthScene(); // Ireland (text)
    drawSixthScene(); // Switzerland (text)
    drawSeventhScene(); // Iceland (text)
    drawEighthScene(); // Norway (text and final image)
  }

  // Scene 1: Ireland
  public void drawFirstScene() {
    // Clear the screen with a white background
    clear("white");

    // Draw text at different positions
    drawText(places[0][0], 50, 100); // Place name at position (50, 100)
    pause(0.5); // Wait 0.5 seconds
    drawText(places[0][0], 250, 100);
    pause(0.5); // Wait 0.5 seconds
    drawText(places[0][0], 50, 300);
    pause(0.5); // Wait 0.5 seconds
    drawText(places[0][0], 250, 300);

    // Wait for 1 second before moving to next scene
    pause(1.0);
  }

  // Scene 2: Norway
  public void drawSecondScene() {
    // Clear the screen with a white background
    clear("white");

    // Draw images at different positions
    drawImage(photos[2][0], 0, 0, 200); // Photo 1 at position (0, 0) with width 200
    pause(0.5); // Wait 0.5 seconds
    drawImage(photos[2][1], 200, 0, 200); // Photo 2 at position (200, 0) with width 200
    pause(0.5); // Wait 0.5 seconds
    drawImage(photos[2][2], 0, 200, 200); // Photo 3 at position (0, 200) with width 200
    pause(0.5); // Wait 0.5 seconds
    drawImage(photos[2][3], 200, 200, 200); // Photo 4 at position (200, 200) with width 200

    // Wait for 1 second before moving to next scene
    pause(1.0);
  }

  // Scene 3: Switzerland
  public void drawThirdScene() {
    // Clear the screen with a white background
    clear("white");

    // Draw text at different positions
    drawText(places[0][1], 50, 100);
    pause(0.5);
    drawText(places[0][1], 250, 100);
    pause(0.5);
    drawText(places[0][1], 50, 300);
    pause(0.5);
    drawText(places[0][1], 250, 300);

    // Wait for 1 second before moving to next scene
    pause(1.0);
  }

  // Scene 4: Iceland
  public void drawFourthScene() {
    // Clear the screen with a white background
    clear("white");

    // Draw images at different positions
    drawImage(photos[1][0], 0, 0, 200);
    pause(0.5);
    drawImage(photos[1][1], 200, 0, 200);
    pause(0.5);
    drawImage(photos[1][2], 0, 200, 200);
    pause(0.5);
    drawImage(photos[1][3], 200, 200, 200);

    // Wait for 1 second before moving to next scene
    pause(1.0);
  }

  // Scene 5: Ireland (text)
  public void drawFifthScene() {
    // Clear the screen with a white background
    clear("white");

    // Draw text at different positions
    drawText(places[1][0], 50, 100);
    pause(0.5);
    drawText(places[1][0], 250, 100);
    pause(0.5);
    drawText(places[1][0], 50, 300);
    pause(0.5);
    drawText(places[1][0], 250, 300);

    // Wait for 1 second before moving to next scene
    pause(1.0);
  }

  // Scene 6: Switzerland (text)
  public void drawSixthScene() {
    // Clear the screen with a white background
    clear("white");

    // Draw images at different positions
    drawImage(photos[0][0], 0, 0, 200);
    pause(0.5);
    drawImage(photos[0][1], 200, 0, 200);
    pause(0.5);
    drawImage(photos[0][2], 0, 200, 200);
    pause(0.5);
    drawImage(photos[0][3], 200, 200, 200);

    // Wait for 1 second before moving to next scene
    pause(1.0);
  }

  // Scene 7: Iceland (text)
  public void drawSeventhScene() {
    // Clear the screen with a white background
    clear("white");

    // Draw text at different positions
    drawText(places[1][1], 50, 100);
    pause(0.5);
    drawText(places[1][1], 250, 100);
    pause(0.5);
    drawText(places[1][1], 50, 300);
    pause(0.5);
    drawText(places[1][1], 250, 300);

    // Wait for 1 second before moving to next scene
    pause(1.0);
  }

  // Scene 8: Iceland and final image
  public void drawEighthScene() {
    // Clear the screen with a white background
    clear("white");

    // Draw images at different positions
    drawImage(photos[3][0], 0, 0, 200);
    pause(0.5);
    drawImage(photos[3][1], 200, 0, 200);
    pause(0.5);
    drawImage(photos[3][2], 0, 200, 200);
    pause(0.5);
    drawImage(photos[3][3], 200, 200, 200);
    // Wait for 1 second before moving to next scene
    pause(1.0);
    // Clear the screen with a black background at the end
    clear("black");
  }
}