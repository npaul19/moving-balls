package com.oops;

import processing.core.PApplet;

public class Ball { //Good Abstraction

    private int positionX;
    private final int height;
    private final int speed;
    private final int diameterX;
    private final int diameterY;

    public Ball(int positionX, int height, int speed, int diameterX, int diameterY) {
        this.positionX = positionX;
        this.height = height;
        this.speed = speed;
        this.diameterX = diameterX;
        this.diameterY = diameterY;
    }

    public void draw(PApplet sketch) {
        sketch.ellipse(positionX, height, diameterX, diameterY);
    }

    public void move(PApplet sketch) {
//        sketch.ellipse(positionX+=speed, height, diameterX, diameterY);
        positionX += speed;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "positionX=" + positionX +
                ", diameterX=" + diameterX +
                ", diameterY=" + diameterY +
                '}';
    }
}

//b1.move()
//b1.draw()

//Do One thing in a method
//Always think about the what will the the behavior of a class
