package SOLID.OCP;

public class ColorSpecification implements Specification<Item>{

    private final Color color;

    public ColorSpecification(Color color) {
        this.color = color;
    }

    @Override
    public boolean isValidSpecification(Item item) {
        return item.getColor().equals(color);
    }
}
