package induktoko;

abstract public class Person {
    final String name;

    public Person(String name) {
        this.name = name;
    }

    public final String getName() {
        return name;
    }

    abstract public void displayToko();
}
