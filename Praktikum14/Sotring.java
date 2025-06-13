package Praktikum14;

import java.util.ArrayList;
import java.util.Collections;

public class Sotring {
    public static void main(String[] args) {
        ArrayList<String> daftarSiswa = new ArrayList<>();
        daftarSiswa.add("Zainab");
        daftarSiswa.add("Andi");
        daftarSiswa.add("Rara");


        Collections.sort(daftarSiswa);
        System.out.println("Daftar siswa terurut: " + daftarSiswa);

        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer(3, "Zakia"));
        customers.add(new Customer(1, "Budi"));
        customers.add(new Customer(2, "Andi"));

        customers.sort((c1, c2) -> c1.name.compareTo(c2.name));
        System.out.println("\nCustomer terurut by name:");
        System.out.println(customers);

        customers.sort((c1, c2) -> c1.id - c2.id);
        System.out.println("\nCustomer terurut by ID:");
        System.out.println(customers);
    }
    
}
