public interface Movable { // An interface defines a list of public
    // abstract methods to be implemented by the subclasses.

    void moveUp();  //"Public" and "abstract" by default
    void moveDown();
    void moveLeft();
    void moveRight();
    String getCoordinate();
}
