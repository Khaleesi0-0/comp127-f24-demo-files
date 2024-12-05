import edu.macalester.graphics.CanvasWindow;
import edu.macalester.graphics.events.KeyboardEvent;
import edu.macalester.graphics.GraphicsText;
import edu.macalester.graphics.Rectangle;

import java.awt.Color;
import java.util.Random;

// Main Game Class
public class Game {
    private Game2048Manager gameManager;

    public Game() {
        CanvasWindow canvas = new CanvasWindow("2048", 500, 600);
        gameManager = new Game2048Manager(canvas);
        gameManager.startNewGame();
    }

    public static void main(String[] args) {
        new Game();
    }
}
