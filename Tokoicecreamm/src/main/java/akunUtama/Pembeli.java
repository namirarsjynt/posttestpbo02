package akunUtama;

import induktoko.Person;

public final class Pembeli extends Person {
    public double wallet;

    public Pembeli(String name, double wallet) {
        super(name);
        this.wallet = wallet;
    }

    public double getWallet() {
        return wallet;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }

    @Override
    public void displayToko() {
        System.out.println("Nama pembeli: " + getName() + ", Isi dompet: $" + getWallet());
    }
}
