
package javaapplication1;


public class DequeUsageExaple1 {
           public static void main(String [] args){
        	   Deque1<Integer> d1 =  new Deque1<Integer>();
                  
                    try{    
 
    d1.popFront();

}     
         catch (DequeOutOfBoundsException1 e){
        System.err.println(e);  
        }
    }
           
}


