package org.ishita;

import processing.core.PApplet;

public class FourBalls extends PApplet {

    public static final int HEIGHT = 640;
    public static final int WIDTH = 740;
    static Circle circles[]=new Circle[4];
    public static void main(String[] args) {
        PApplet.main("org.ishita.FourBalls",args);
        for (int i=0;i<4;i++)
        {
            circles[i]=new Circle(0,(i+1)*(HEIGHT/5),(i+1));
        }
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        for (int i=0;i<4;i++){
            ellipse(circles[i].x_speed,circles[i].height,20,20);
            circles[i].move_horizontal();
        }
    }
}
