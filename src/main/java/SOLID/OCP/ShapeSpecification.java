package SOLID.OCP;

public class ShapeSpecification implements Specification<Item>{

    private final Shape shape;

    public ShapeSpecification(Shape shape) {
        this.shape = shape;
    }

    @Override
    public boolean isValidSpecification(Item item) {
        return item.getShape().equals(shape);
    }
}
