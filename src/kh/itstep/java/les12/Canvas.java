package kh.itstep.java.les12;

public class Canvas {
    private Shape[] shapes = new Shape[100];
    private int idx = 0;

    public void addShape(Shape shape) {
        shapes[idx++] = shape;
        shape.setCanvas(this);
    }
}
