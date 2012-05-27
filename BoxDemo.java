
package generics;

public class BoxDemo {

    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<Integer>();
        integerBox.add(new Integer(10));
        Integer someInteger = integerBox.get();
        System.out.println(someInteger);
    }
}

