
package javaapplication1;

    public class DequeOutOfBoundsException1 extends Exception{
    private int e;
    DequeOutOfBoundsException1(int s){
        e=s;
    }
    @Override
    public String toString(){
        return "DequeOutOfBoundsException !!![ "+e+" ]";
    }
   
    public void DequeOutOfBoundsException1(){
        System.err.println("DequeOutOfBoundsException !!!");
    }   
}

