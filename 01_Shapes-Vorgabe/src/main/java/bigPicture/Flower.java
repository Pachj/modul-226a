package bigPicture;

import shapes.Canvas;
import shapes.Circle;
import shapes.Square;
import shapes.Triangle;

public class Flower {
    private int xPosition;
    private int yPosition;

    public Flower(int xPosition, int yPosition) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    public void draw() {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle();
        Circle circle3 = new Circle();
        Circle circle4 = new Circle();
        Circle circle5 = new Circle();

        circle1.moveVertical(this.yPosition);
        circle1.moveHorizontal(this.xPosition);
        circle1.changeColor("yellow");

        // top
        circle2.moveVertical(this.yPosition - 15);
        circle2.moveHorizontal(this.xPosition);

        // right
        circle3.moveVertical(this.yPosition);
        circle3.moveHorizontal(this.xPosition + 15);

        // left
        circle4.moveVertical(this.yPosition);
        circle4.moveHorizontal(this.xPosition - 15);

        // bottom
        circle5.moveVertical(this.yPosition + 15);
        circle5.moveHorizontal(this.xPosition);

        Triangle triangle1 = new Triangle();
        triangle1.changeColor("black");
        triangle1.changeSize(60, 7);
        triangle1.moveVertical(this.yPosition + 60);
        triangle1.moveHorizontal(this.xPosition -15);

        Triangle triangle2 = new Triangle();
        triangle2.changeColor("black");
        triangle2.changeSize(10, 15);
        triangle2.moveVertical(this.yPosition + 90);
        triangle2.moveHorizontal(this.xPosition - 15 + 7);

        Triangle triangle3 = new Triangle();
        triangle3.changeColor("black");
        triangle3.changeSize(10, 15);
        triangle3.moveVertical(this.yPosition + 100);
        triangle3.moveHorizontal(this.xPosition - 15 - 7);


        triangle1.makeVisible();
        circle2.makeVisible();
        circle3.makeVisible();
        circle4.makeVisible();
        circle5.makeVisible();
        circle1.makeVisible();
        triangle2.makeVisible();
        triangle3.makeVisible();
    }
}
