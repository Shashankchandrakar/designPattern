package SOLID.OCP;

import java.util.List;
import java.util.stream.Stream;

public class ItemFilter implements Filter<Item>{
    @Override
    public Stream<Item> doFilter(List<Item> items, Specification<Item> specification) {
        return items.stream().filter(specification::isValidSpecification);
    }
}
