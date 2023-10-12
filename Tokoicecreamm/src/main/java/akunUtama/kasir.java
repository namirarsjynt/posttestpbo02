package akunUtama;

import induktoko.Employee;

public final class kasir extends Employee {
    public kasir(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void displayToko() {
        System.out.println("Nama kasir: " + getName() + ", Gaji: $" + getSalary());
    }
}