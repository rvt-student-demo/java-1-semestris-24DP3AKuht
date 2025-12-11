package rvt;

public class Chapter50 {
     public static void main(String[] args) {
        Box box1 = new Box(2.5, 5.0, 6.0);
        System.out.println("Box1 area: " + box1.area());
        System.out.println("Box1 volume: " + box1.volume());
        System.out.println("Box1 width: " + box1.width() + ", height: " + box1.height() + ", length: " + box1.length());
        System.out.println();

        Box box2 = new Box(box1);
        System.out.println("Box2 (copy of Box1) area: " + box2.area());
        System.out.println();

        Box bigger = Box.biggerBox(box1);
        System.out.println("Bigger box area: " + bigger.area() + ", volume: " + bigger.volume());

        Box smaller = Box.smallerBox(box1);
        System.out.println("Smaller box area: " + smaller.area() + ", volume: " + smaller.volume());
        System.out.println();

        System.out.println("Does Box1 nest in Bigger? " + box1.nests(bigger));
        System.out.println("Does Bigger nest in Box1? " + bigger.nests(box1));
        System.out.println("Does Smaller nest in Box1? " + smaller.nests(box1));
    }
}

class Box {
    private final double width;
    private final double height;
    private final double length;

    public Box(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public Box(double side) {
        this(side, side, side);
    }

    public Box(Box oldBox) {
        this(oldBox.width, oldBox.height, oldBox.length);
    }

    public double width() { return width; }
    public double height() { return height; }
    public double length() { return length; }

    public double volume() {
        return width * height * length;
    }

    public double area() {
        return 2 * faceArea() + 2 * topArea() + 2 * sideArea();
    }

    private double faceArea() { return width * height; }
    private double topArea()  { return width * length; }
    private double sideArea() { return height * length; }

    public static Box biggerBox(Box oldBox) {
        return new Box(
            1.25 * oldBox.width(),
            1.25 * oldBox.height(),
            1.25 * oldBox.length()
        );
    }

    public static Box smallerBox(Box oldBox) {
        return new Box(
            0.75 * oldBox.width(),
            0.75 * oldBox.height(),
            0.75 * oldBox.length()
        );
    }

    public boolean nests(Box outsideBox) {
        return this.width <= outsideBox.width() &&
               this.height <= outsideBox.height() &&
               this.length <= outsideBox.length();
    }
}

    

