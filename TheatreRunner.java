import org.code.theater.*;
import org.code.media.*;

public class TheaterRunner {
  public static void main(String[] args) {

    // 2D Array of places
    String[][] places = {
      {"Ireland", "Norway"},
      {"Switzerland", "Iceland"}
    };

    ImageFilter[][] photos = new ImageFilter[4][4];

    // Switzerland images with filter
    photos[0][0] = new ImageFilter("Switz1.jpg");
    photos[0][1] = new ImageFilter("Switz2.jpg");
    photos[0][2] = new ImageFilter("Switz3.jpg");
    photos[0][3] = new ImageFilter("Switz4.jpg");
    for (ImageFilter photo : photos[0]) {
      photo.makeNegative();
    }

    // Norway images with filter
    photos[1][0] = new ImageFilter("Norway1.jpg");
    photos[1][1] = new ImageFilter("Norway2.jpg");
    photos[1][2] = new ImageFilter("Norway3.jpg");
    photos[1][3] = new ImageFilter("Norway4.jpg");
    for (ImageFilter photo : photos[1]) {
      photo.makeNegative();
    }

    // Ireland images with filter
    photos[2][0] = new ImageFilter("Ireland1.jpg");
    photos[2][1] = new ImageFilter("Ireland2.jpg");
    photos[2][2] = new ImageFilter("Ireland3.jpg");
    photos[2][3] = new ImageFilter("Ireland4.jpeg");
    for (ImageFilter photo : photos[2]) {
      photo.makeNegative();
    }

    // Iceland images with filter
    photos[3][0] = new ImageFilter("Iceland1.jpg");
    photos[3][1] = new ImageFilter("Iceland2.jpg");
    photos[3][2] = new ImageFilter("Iceland3.jpg");
    photos[3][3] = new ImageFilter("Iceland4.jpg");
    for (ImageFilter photo : photos[3]) {
      photo.makeNegative();
    }

    // MyStory object
    MyStory scene = new MyStory(places, photos);
    
    // Call drawScene
    scene.drawScene();
    
    // Play scene in Theater
    Theater.playScenes(scene);
  }
}