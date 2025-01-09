package org.example;

public class Point {

    private int x;
    private int y;

    //constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //getter
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


    //setter
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    //method
    public double distance() {
        return distance(0, 0);
    }

    public double distance(Point p) {
        return distance(p.getX(), p.getY());
    }

    public double distance(int a, int b) {
        return Math.sqrt(((this.x - a) * (this.x - a)) + ((this.y - b) * (this.y - b)));
    }

}
