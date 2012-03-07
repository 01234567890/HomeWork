package javaapplication1;
public class Deque1 {
    int[] k;

    Deque1() {
        k = new int[0];
    }
    void pushBack(int a) {
        int[] k1 = new int[k.length + 1];
        for (int i = 0; i < k.length; i++) {
            k1[i] = k[i];
        }
        k1[k.length] = a;
        k = k1;
    }
    int popBack() throws DequeOutOfBoundsException1 {
        if (k.length == 0) {
            throw new DequeOutOfBoundsException1(k.length);
        }
        int[] k1 = new int[k.length - 1];
        if (k1.length <= 0) {
            throw new DequeOutOfBoundsException1(k1.length);
        }
        int y = k[k.length - 1];
        for (int i = 0; i < k.length - 1; i++) {
            k1[i] = k[i];
        }
        k = k1;
        return y;
    }

    void pushFront(int a1) {
        int[] k1 = new int[k.length + 1];
        for (int i = 0; i < k.length; i++) {
            k1[i + 1] = k[i];
        }
        k1[0] = a1;
        k = k1;
    }

    int popFront() throws DequeOutOfBoundsException1 {
        if (k.length == 0) {
            throw new DequeOutOfBoundsException1(k.length);
        }
        int[] k1 = new int[k.length - 1];
        int y = k[0];
        for (int i = 0; i < k.length - 1; i++) {
            k1[i] = k[i + 1];
        }
        k = k1;
        return y;
    }

    void print() {
        for (int i = 0; i < k.length; i++) {
            System.out.print(k[i]+"   ");
        }
    }
}