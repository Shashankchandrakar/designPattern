package SOLID.OCP;

public interface Specification<T> {
    boolean isValidSpecification(T t);
}
