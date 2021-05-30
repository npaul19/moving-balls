package com.oops;

import processing.core.PApplet;

import java.util.ArrayList;
import java.util.Arrays;

public class Main extends PApplet {
    public static final int WIDTH = 640;
    public static final int HEIGHT = 500;
    public static final int DIAMETER = 10;
    public int BALL_SPACING;
    ArrayList<Ball> balls = new ArrayList<>();

    public static void main(String[] str) {
        PApplet.main("com.oops.Main", str);
    }

    @Override
    public void settings() {
        super.settings();

        size(WIDTH, HEIGHT);
        BALL_SPACING = HEIGHT / 5;
        int heightCounter = 1;
        int speedCounter = 1;

        for(int idx = 0; idx < 5; idx++)
            balls.add(new Ball(0, BALL_SPACING * heightCounter++, speedCounter++, DIAMETER, DIAMETER));
    }

    @Override
    public void setup() {
        super.setup();
    }

    @Override
    public void draw() {
        for(int idx = 0; idx < 5; idx++){
            balls.get(idx).draw(this);
            balls.get(idx).move(this);
        }
    }
}
