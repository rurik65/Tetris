package Tetris.Model;

import java.awt.*;
import java.util.Arrays;

public class Figure {
    private final int[] figures = new int[]{
            4,4,6,0,0,7,4,0,3,1,1,0,0,1,7,0,
            0,7,2,0,2,6,2,0,2,7,0,0,2,3,2,0,
            6,3,0,0,1,3,2,0,6,3,0,0,1,3,2,0,
            2,2,2,2,0,0,15,0,2,2,2,2,0,0,15,0,
            0,2,3,0,0,3,2,0,0,3,1,0,0,1,3,0,
            2,2,2,0,0,7,0,0,2,2,2,0,0,7,0,0,
            1,1,3,0,0,4,7,0,6,4,4,0,0,7,1,0,
            0,3,3,0,0,3,3,0,0,3,3,0,0,3,3,0,
            7,5,5,0,7,1,7,0,5,5,7,0,7,4,7,0,
            4,7,1,0,3,2,6,0,4,7,1,0,3,2,6,0,
            3,2,3,6,0,8,15,5,3,6,2,6,0,10,15,1};
    private int[] fig = new int[16]; // 4 проекции фигуры
    private int view;                   //проекция фигуры
    private Color colorFig;
    public int getView() {
        return view;
    }
    public void rotate(){if (++view == 4) view = 0; }

    public void setView(int view) {
        this.view = view;}

    public int[] getFig() {
        return fig;
    }

    public Color getColorFig() {
        return colorFig;
    }

    public Figure(){
        int index = 16 * (int)(8*Math.random());    // одна из 8 фигур (можно 11)
        view = (int)(4*Math.random());            // одна из 4-х проекций фигуры
        System.arraycopy(figures,index,fig,0,16);
        colorFig = BodyPart.getRandomColor();
    }
}
