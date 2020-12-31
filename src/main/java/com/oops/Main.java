package com.oops;

import processing.core.PApplet;

public class Main extends PApplet {
    public static final int WIDTH = 640;
    public static final int HEIGHT = 500;
    public static final int DIAMETER = 10;
    public static final int BALL_SPACING = HEIGHT / 5;
    MovingBall ball1, ball2, ball3, ball4;

    public static void main(String str[]) {
        PApplet.main("com.oops.Main", str);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
        int heightCounter = 1;
        ball1 = new MovingBall(this, 0, BALL_SPACING * heightCounter++, DIAMETER, DIAMETER);
        ball2 = new MovingBall(this, 0, BALL_SPACING * heightCounter++, DIAMETER, DIAMETER);
        ball3 = new MovingBall(this, 0, BALL_SPACING * heightCounter++, DIAMETER, DIAMETER);
        ball4 = new MovingBall(this, 0, BALL_SPACING * heightCounter, DIAMETER, DIAMETER);
    }

    @Override
    public void setup() {
        super.setup();
    }

    @Override
    public void draw() {
        int speedCounter = 1;
        ball1.drawMovingBall(speedCounter++);
        ball2.drawMovingBall(speedCounter++);
        ball3.drawMovingBall(speedCounter++);
        ball4.drawMovingBall(speedCounter);
    }
}
