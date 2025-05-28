package Jobsheet13;

public class DoubleLinkedLists01 {
    Node01 head;
    Node01 tail;

    public DoubleLinkedLists01() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa01 data) {
        Node01 newNode = new Node01(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(Mahasiswa01 data) {
        Node01 newNode = new Node01(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void insertAfter(String keyNim, Mahasiswa01 data) {
        Node01 current = head;

        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Node dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }

        Node01 newNode = new Node01(data);

        if (current == tail) {
            current.next = newNode;
            newNode.prev = current;
            tail = newNode;
        } else {
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
        }
        System.out.println("Node berhasil disisipkan setelah NIM " + keyNim);
    }

    public void print() {
        if (isEmpty()) {
        System.out.println("⚠️ Linked list kosong!");
        return;
        }
        
        Node01 current = head;
        System.out.println("Daftar Mahasiswa:");
        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
    }

    public void removeFirst() {
    if (isEmpty()) {
        System.out.println("List kosong, tidak bisa dihapus.");
        return;
    }
    Mahasiswa01 removedData = head.data; 
    if (head == tail) {
        head = tail = null;
    } else {
        head = head.next;
        head.prev = null;
    }
    System.out.println("Data sudah berhasil dihapus. Data yang terhapus adalah:");
    removedData.tampil(); 
    }

    public void removeLast() {
    if (isEmpty()) {
        System.out.println("List kosong, tidak bisa dihapus.");
        return;
    }
    Mahasiswa01 removedData = tail.data; 
    if (head == tail) {
        head = tail = null;
    } else {
        tail = tail.prev;
        tail.next = null;
    }
    System.out.println("Data sudah berhasil dihapus. Data yang terhapus adalah:");
    removedData.tampil(); 
    }

    public void add(int index, Mahasiswa01 data) {
    if (index < 0) {
        System.out.println("Indeks tidak valid!");
        return;
    }
    if (index == 0) {
        addFirst(data);
        return;
    }
    Node01 newNode = new Node01(data);
    Node01 current = head;
    int count = 0;
    while (current != null && count < index - 1) {
        current = current.next;
        count++;
    }
    if (current == null) {
        System.out.println("Indeks melebihi panjang list");
        return;
    }
    newNode.next = current.next;
    newNode.prev = current;
    if (current.next != null) {
        current.next.prev = newNode;
    } else {
        tail = newNode;
    }
    current.next = newNode;
    System.out.println("Data berhasil ditambahkan pada indeks " + index);
    }
    
    public void removeAfter(String keyNim) {
    if (isEmpty()) {
        System.out.println("List kosong!");
        return;
    }    
    Node01 current = head;
    while (current != null && !current.data.nim.equals(keyNim)) {
        current = current.next;
    }    
    if (current == null || current.next == null) {
        System.out.println("Tidak ada node setelah " + keyNim);
        return;
    }    
    Node01 toRemove = current.next;
    System.out.println("Data yang dihapus:");
    toRemove.data.tampil();
    current.next = toRemove.next;
    if (toRemove.next != null) {
        toRemove.next.prev = current;
    } else {
        tail = current;
    }
    }


    public void remove(int index) {
    if (isEmpty() || index < 0) {
        System.out.println("Indeks tidak valid atau list kosong");
        return;
    }    
    if (index == 0) {
        removeFirst();
        return;
    }    
    Node01 current = head;
    int count = 0;    
    while (current != null && count < index) {
        current = current.next;
        count++;
    }    
    if (current == null) {
        System.out.println("Indeks melebihi panjang list");
        return;
    }    
    System.out.println("Data yang dihapus:");
    current.data.tampil();    
    current.prev.next = current.next;
        if (current.next != null) {
            current.next.prev = current.prev;
        } else {
            tail = current.prev;
        }
    }

    public Mahasiswa01 getFirst() {
    if (isEmpty()) {
        System.out.println("List kosong!");
        return null;
    }
    return head.data;
    }

    public Mahasiswa01 getLast() {
    if (isEmpty()) {
        System.out.println("List kosong!");
        return null;
    }
    return tail.data;
    }

    public Mahasiswa01 getIndex(int index) {
    if (isEmpty() || index < 0) {
        System.out.println("Indeks tidak valid atau list kosong");
        return null;
    }    
    Node01 current = head;
    int count = 0;    
        while (current != null && count < index) {
            current = current.next;
            count++;
        }
        if (current == null) {  
            System.out.println("Indeks melebihi panjang list");
            return null;
        }    
    return current.data;
    }

    public int size() {
        int count = 0;
        Node01 current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public Node01 search(String nim) {
        Node01 current = head;
        while (current != null) {
            if (current.data.nim.equals(nim)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }
}