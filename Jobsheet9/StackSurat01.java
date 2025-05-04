package Jobsheet9;

public class StackSurat01 {
    Surat01[] stack;
    int top;

    public StackSurat01(int kapasitas) {
        stack = new Surat01[kapasitas];
        top = -1;
    }

    public void push(Surat01 s) {
        if (top == stack.length - 1) {
            System.out.println("Stack penuh, tidak dapat menambahkan surat.");
        } else {
            stack[++top] = s;
            System.out.println("Surat berhasil ditambahkan.");
        }
    }

    public Surat01 pop() {
        if (top == -1) {
            System.out.println("Stack kosong, tidak ada surat untuk diproses.");
            return null;
        } else {
            return stack[top--];
        }
    }

    public Surat01 peek() {
        if (top == -1) {
            System.out.println("Stack kosong.");
            return null;
        } else {
            return stack[top];
        }
    }

    public void cariSurat(String nama) {
        boolean ditemukan = false;
        for (int i = top; i >= 0; i--) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                System.out.println("Surat ditemukan:");
                stack[i].tampilkanSurat();
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Surat atas nama " + nama + " tidak ditemukan.");
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }
}
