package structural.facade;

public class ShapeMaker {

    private Shape0 circle;
    private Shape0 rectangle;
    private Shape0 square;

    public ShapeMaker(Shape0 circle, Shape0 rectangle, Shape0 square) {
        super();
        this.circle = circle;
        this.rectangle = rectangle;
        this.square = square;
    }

    public ShapeMaker() {
        super();
        this.circle = new Circle();
        this.rectangle = new Rectangle();
        this.square = new Square();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }

    public void drawSquare() {
        square.draw();
    }

    public Shape0 getCircle() {
        return circle;
    }

    public void setCircle(Shape0 circle) {
        this.circle = circle;
    }

    public Shape0 getRectangle() {
        return rectangle;
    }

    public void setRectangle(Shape0 rectangle) {
        this.rectangle = rectangle;
    }

    public Shape0 getSquare() {
        return square;
    }

    public void setSquare(Shape0 square) {
        this.square = square;
    }

}
