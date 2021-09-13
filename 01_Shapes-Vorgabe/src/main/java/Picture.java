import bigPicture.Cloud;
import bigPicture.Flower;
import shapes.Circle;
import shapes.Square;
import shapes.Triangle;

public class Picture {
    Picture() {}

    void draw() {
        Square background1 = new Square();
        background1.changeColor("blue");
        background1.changeSize(600);
        background1.moveHorizontal(-150);
        background1.moveVertical(-100);
        Square background2 = new Square();
        background2.changeColor("green");
        background2.changeSize(600);
        background2.moveHorizontal(-150);
        background2.moveVertical(130);

        background1.makeVisible();
        background2.makeVisible();

        Square square = new Square();
        Square square2 = new Square();
        Triangle triangle = new Triangle();
        Circle circle = new Circle();

        square.changeSize(120);
        square.moveVertical(50);

        square2.changeColor("black");
        square2.moveVertical(80);
        square2.moveRight();

        triangle.changeSize(60, 150);
        triangle.changeColor("green");
        triangle.moveVertical(25);
        triangle.moveHorizontal(70);

        circle.changeColor("yellow");
        circle.changeSize(60);
        circle.moveHorizontal(180);

        square.makeVisible();
        square2.makeVisible();
        triangle.makeVisible();
        circle.makeVisible();

        Cloud cloud1 = new Cloud(20, -20);
        Cloud cloud2 = new Cloud(160, -40);
        Cloud cloud3 = new Cloud(230, -20);
        Cloud cloud4 = new Cloud(10, -40);
        cloud1.drawRandom();
        cloud2.drawRandom();
        cloud3.drawRandom();
        cloud4.drawRandom();

        Flower flower1 = new Flower(20, 150);
        Flower flower2 = new Flower(90, 160);
        Flower flower3 = new Flower(150, 145);
        flower1.draw();
        flower2.draw();
        flower3.draw();
    }
}
