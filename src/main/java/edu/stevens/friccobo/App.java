package edu.stevens.friccobo;

import processing.core.PApplet;

/**
 * Hello world!
 */
public class App extends PApplet {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        App app = new App();
        PApplet.runSketch(new String[]{"App"}, app);
    }

    @Override
    public void settings() {
        size(1000, 1000);
    }

    int speed =5;
    int radius = 50;
    int diameter = radius * 2;

    int x;
    int y;

    public void draw() {
        background(255);

        fill(255, 0, 0);
        ellipse(x, y+25 , radius, radius);

        if(x < width-25 && y==0){
            x = x + speed;
        }
        else if(x >= width-25 && y<height-radius){
            y= y+speed;
        }
        else if(y>= height-radius && x>25){
            x = x-speed;
        }
        else if(y>0 && x==25){
            y = y-speed;
        }
    }
}
