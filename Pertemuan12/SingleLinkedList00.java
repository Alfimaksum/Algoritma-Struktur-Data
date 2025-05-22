package Pertemuan12;

public class SingleLinkedList00 {
    Node00 head;
    Node00 tail;

    public boolean isEmpty() {
        return (head == null);
    }

    public void print() {
        if (!isEmpty()) {
            Node00 tmp = head;
            System.out.printf("%-10s %-10s %-5s %s\n", "Nama", "NIM", "Kelas", "IPK");
            while (tmp != null) {
                tmp.data.tampilkanInformasi();
                tmp = tmp.next;
            }
        } else {
            System.out.println("Linked list Kosong");
        }
        System.out.println();
    }

    public void addFirst(Mahasiswa00 input) {
        Node00 ndInput = new Node00(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    public void addLast(Mahasiswa00 input) {
        Node00 ndInput = new Node00(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void insertAfter(String key, Mahasiswa00 input) {
        Node00 ndInput = new Node00(input, null);
        Node00 temp = head;
        do {
            if (temp.data.nama.equalsIgnoreCase(key)) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) tail = ndInput;
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }

    public void insertAt(int index, Mahasiswa00 input) {
        if (index < 0) {
            System.out.println("Indeks salah");
        } else if (index == 0) {
            addFirst(input);
        } else {
            Node00 temp = head;
            for (int i = 0; i < index - 1; i++) {
                if (temp.next == null) break;
                temp = temp.next;
            }
            temp.next = new Node00(input, temp.next);
            if (temp.next.next == null) tail = temp.next;
        }
    }
}