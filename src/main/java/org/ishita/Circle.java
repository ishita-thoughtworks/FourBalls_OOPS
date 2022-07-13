package org.ishita;

import processing.core.PApplet;

public class Circle extends PApplet {
    int height;
    int speed;
    int x_speed;

    public Circle(int x_speed,int height, int speed) {
        this.height = height;
        this.speed = speed;
        this.x_speed=x_speed;
    }

    public void move_horizontal() {
        this.x_speed+=speed;
    }
}
