package akunUtama;

import induktoko.Person;

public final class Product extends Person {
    public double price;

    public Product(String name, double price) {
        super(name);
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void displayToko() {
        System.out.println("tambahkan varian rasa: " + getName() + ", price ice cream: $" + getPrice());
    }
}
