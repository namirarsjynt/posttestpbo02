package com.mycompany.tokoicecreamm;

import akunUtama.kasir;
import akunUtama.Product;
import akunUtama.Pembeli;
import akunUtama.Pembeli;
import induktoko.Person;
import induktoko.Employee;
import java.util.ArrayList;
import java.util.Scanner;

public final class Tokoicecreamm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Person> peopleList = new ArrayList<>();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. penambahan karyawan");
            System.out.println("2. kasir");
            System.out.println("3. Nama Pembeli");
            System.out.println("4. varian rasa");
            System.out.println("5. Tampilkan semua rasa");
            System.out.println("6. Hapus variasi rasa");
            System.out.println("7. Exit");
            System.out.print("Pilihan Anda: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Membersihkan newline dari buffer

            switch (choice) {
                case 1:
                    System.out.print("Nama Karyawan: ");
                    String employeeName = scanner.nextLine();
                    System.out.print("Gaji Karyawan: ");
                    double employeeSalary = scanner.nextDouble();
                    scanner.nextLine(); // Membersihkan newline dari buffer
                    peopleList.add(new Employee(employeeName, employeeSalary));
                    break;
                case 2:
                    System.out.print("Nama Kasir: ");
                    String cashierName = scanner.nextLine();
                    System.out.print("Gaji Kasir: ");
                    double cashierSalary = scanner.nextDouble();
                    scanner.nextLine(); // Membersihkan newline dari buffer
                    peopleList.add(new kasir(cashierName, cashierSalary));
                    break;
                case 3:
                    System.out.print("Nama Pembeli: ");
                    String customerName = scanner.nextLine();
                    System.out.print("Dompet Pelanggan: ");
                    double wallet = scanner.nextDouble();
                    scanner.nextLine(); // Membersihkan newline dari buffer
                    peopleList.add(new Pembeli(customerName, wallet));
                    break;
                case 4:
                    System.out.print("tambahkan varian rasa: ");
                    String productName = scanner.nextLine();
                    System.out.print("price ice cream: ");
                    double productPrice = scanner.nextDouble();
                    scanner.nextLine(); // Membersihkan newline dari buffer
                    peopleList.add(new Product(productName, productPrice));
                    break;
                case 5:
                    for (Person person : peopleList) {
                        person.displayToko();
                    }
                    break;

                case 6:
                    System.out.print("Masukkan rasa yang ingin di hapus: ");
                    String deleteName = scanner.nextLine();
                    boolean removed = false;

                    for (int i = 0; i < peopleList.size(); i++) {
                        Person person = peopleList.get(i);
                        if (person.getName().equals(deleteName)) {
                            peopleList.remove(i);
                            removed = true;
                            System.out.println("berhasil dihapus.");
                            break;
                        }
                    }

                    if (!removed) {
                        System.out.println("FAIL.");
                    }

                    break;
                case 7:
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Coba lagi.");
            }
        }
    }
}

