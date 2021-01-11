package SOLID.OCP;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class OpenClosedPrinciple {

    public static void main(String[] args) {
        Item pen = new Item("PEN", Color.BLUE,Shape.SMALL);
        Item laptop = new Item("Laptop",Color.GREEN,Shape.MEDIUM);
        Item car = new Item("Car",Color.RED,Shape.LARGE);

        List<Item> items = Arrays.asList(pen,laptop,car);

        Specification<Item> blueColorSpecification = new ColorSpecification(Color.BLUE);
        Specification<Item> redColorSpecification = new ColorSpecification(Color.RED);

        Specification<Item> smallShapeSpecification = new ShapeSpecification(Shape.SMALL);
        Specification<Item> mediumShapeSpecification = new ShapeSpecification(Shape.MEDIUM);

        Stream<Item> itemStream = new ItemFilter().doFilter(items,blueColorSpecification);
        System.out.println("Blue filter");
        itemStream.forEach(System.out::print);


        itemStream = new ItemFilter().doFilter(items,redColorSpecification);
        System.out.println("Red filter");
        itemStream.forEach(System.out::print);

        itemStream = new ItemFilter().doFilter(items,smallShapeSpecification);
        System.out.println("Small filter");
        itemStream.forEach(System.out::print);

        itemStream = new ItemFilter().doFilter(items,mediumShapeSpecification);
        System.out.println("Medium filter");
        itemStream.forEach(System.out::print);

    }
}





