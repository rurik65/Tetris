package Tetris.Main;

import Tetris.DesktopGameBuilder;
import Tetris.Game;
import Tetris.MainScene;

import java.awt.*;

import static Tetris.Constants.*;


public class Main {
    public static void main(String[] args) {
        int screenWidth = WORLD_WIDTH * CELL_SIZE;
        int screenHeight = WORLD_HEIGHT * CELL_SIZE;
        Dimension screenSize = new Dimension(screenWidth, screenHeight);
        DesktopGameBuilder.build(screenSize);
        System.out.println("Tetris started");
     //   game.setScene(new MainScene(game));
     //   game.start();
    }
}
