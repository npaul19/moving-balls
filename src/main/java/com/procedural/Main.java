package com.procedural;

import processing.core.PApplet;

import java.util.ArrayList;
import java.util.Arrays;

public class Main extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 500;
    public static final int DIAMETER = 10;
    ArrayList<Integer> balls = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0));

    public static void main(String str[]) {
        PApplet.main("com.procedural.Main", str);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        int ballSpacing = HEIGHT / 5;

        for (int i=0; i<balls.size(); i++) {
            balls.set(i, drawCircle(balls.get(i) + i + 1, ballSpacing * (i + 1)));
        }
    }

    private int drawCircle(int positionX, float positionY) {
        ellipse(positionX, positionY, DIAMETER, DIAMETER);
        return positionX;
    }

}
