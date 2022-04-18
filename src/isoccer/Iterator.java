package isoccer;

public interface Iterator {
    boolean isDone();
    Object first();
    boolean hasNext();
    Object next();
}
