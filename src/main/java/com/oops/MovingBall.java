package com.oops;

import processing.core.PApplet;

public class MovingBall {

    private PApplet sketch;
    private int positionX;
    private int positionY;
    private int diameterX;
    private int diameterY;

    public MovingBall(PApplet sketch, int positionX, int positionY, int diameterX, int diameterY) {
        this.sketch = sketch;
        this.positionX = positionX;
        this.positionY = positionY;
        this.diameterX = diameterX;
        this.diameterY = diameterY;
    }

    public void drawMovingBall(int speedCounter) {
        sketch.ellipse(positionX+=speedCounter, positionY, diameterX, diameterY);
    }

    @Override
    public String toString() {
        return "MovingBall{" +
                "positionX=" + positionX +
                ", positionY=" + positionY +
                ", diameterX=" + diameterX +
                ", diameterY=" + diameterY +
                '}';
    }
}
