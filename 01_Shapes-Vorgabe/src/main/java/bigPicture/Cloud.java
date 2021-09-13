package bigPicture;

import shapes.Circle;

import java.util.Random;

public class Cloud {
    private int xPosition;
    private int yPosition;

    public Cloud(int xPosition, int yPosition) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    public void draw() {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle();
        Circle circle3 = new Circle();
        Circle circle4 = new Circle();

        circle1.moveVertical(yPosition);
        circle1.moveHorizontal(xPosition);
        circle1.changeColor("white");

        circle2.moveVertical(yPosition + 5);
        circle2.moveHorizontal(xPosition - 10);
        circle2.changeColor("white");

        circle3.moveVertical(yPosition + 3);
        circle3.moveHorizontal(xPosition + 10);
        circle3.changeColor("white");

        circle4.moveVertical(yPosition + 8);
        circle4.moveHorizontal(xPosition);
        circle4.changeColor("white");

        circle1.makeVisible();
        circle2.makeVisible();
        circle3.makeVisible();
        circle4.makeVisible();
    }

    public void drawRandom() {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle();
        Circle circle3 = new Circle();
        Circle circle4 = new Circle();

        circle1.moveVertical(yPosition);
        circle1.moveHorizontal(xPosition);
        circle1.changeColor("white");

        int[] circle2Coords = generateRandomCoordinates();
        circle2.moveVertical(circle2Coords[0] + 5);
        circle2.moveHorizontal(circle2Coords[1] - 10);
        circle2.changeColor("white");

        int[] circle3Coords = generateRandomCoordinates();
        circle3.moveVertical(circle3Coords[0] + 3);
        circle3.moveHorizontal(circle3Coords[1] + 10);
        circle3.changeColor("white");

        int[] circle4Coords = generateRandomCoordinates();
        circle4.moveVertical(circle4Coords[0] + 8);
        circle4.moveHorizontal(circle4Coords[1]);
        circle4.changeColor("white");

        circle1.makeVisible();
        circle2.makeVisible();
        circle3.makeVisible();
        circle4.makeVisible();
    }

    private int[] generateRandomCoordinates() {
        int[] coordinates = new int[2];

        Random r = new Random();
        int lowY = this.yPosition - 7;
        int highY = this.yPosition + 7;
        int lowX = this.xPosition - 7;
        int highX = this.xPosition + 7;

        coordinates[0] = r.nextInt(highY-lowY) + lowY;
        coordinates[1] = r.nextInt(highX-lowX) + lowX;

        return coordinates;
    }
}
