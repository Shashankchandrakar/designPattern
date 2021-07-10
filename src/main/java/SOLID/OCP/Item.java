package SOLID.OCP;

public class Item {
    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", color=" + color +
                ", shape=" + shape +
                "}\n";
    }

    private String name;
    private Color color;
    private Shape shape;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public Item(String name, Color color, Shape shape) {
        this.name = name;
        this.color = color;
        this.shape = shape;
    }
}

enum Color{
    RED,BLUE,GREEN
}

enum Shape {
    SMALL,MEDIUM,LARGE
}

