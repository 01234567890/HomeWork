
package javaapplication1;


public class DequeUsageExaple1 {
           public static void main(String [] args){
                   Deque1 d1=new Deque1();
                    try{    
     
    d1.popBack();

}     
         catch (DequeOutOfBoundsException1 e){
        System.err.println(e);  
        }
    }
           
}


