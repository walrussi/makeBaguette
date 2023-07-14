import java.awt.*;
import java.awt.image.BufferedImage;

public class BaguetteMaking {


    /**
     * user should be able to create baguettes with
     * salad, tomatoes, cheese like
     * Baguette.build().withBred("weissbrot").withSize(2).withSalad().withCheese().build()
     * user should be able to print out an ascii image of a baguette
     */

    BaguetteMaking(String bread, int size, String salad, String cheese) {


        this.bread = bread;
        this.size = size;
        this.salad = salad;
        this.cheese = cheese;

    }

    public String bread;
    public String salad;
    public String cheese;

    public int size;

    public void background() {

        Settings settings = new Settings(100, 10);

        BufferedImage bufferedImage = new BufferedImage(50, 50, BufferedImage.TYPE_INT_RGB);
        Graphics graphics = bufferedImage.getGraphics();

        System.out.println(bufferedImage);

        Graphics2D graphics2D = (Graphics2D) graphics;
        graphics2D.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,
                RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        graphics2D.drawString("BAELDUNG", 12, 24);

        for (int y = 0; y < settings.height; y++) {
            StringBuilder stringBuilder = new StringBuilder();

            for (int x = 0; x < settings.width; x++) {
                stringBuilder.append(".");
            }

            if (stringBuilder.toString().trim().isEmpty()) {
                continue;
            }

            System.out.println(stringBuilder);
        }

    }

    public void topAndDown() {


    }

    public void contentOfBaguette() {


    }

    public void build() {

        background();
        topAndDown();
        contentOfBaguette();
    }

    public void withBread(BaguetteMaking bread) {


    }

    public void withSize() {


    }

    public void withSalad() {

    }

    public void withCheese() {


    }

    public class Settings {
        public Font font;
        public int width;
        public int height;

        public Settings(int width, int height) {

            this.width = width;
            this.height = height;
        }
    }
}
