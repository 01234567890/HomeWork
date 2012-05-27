
package queue;

public class Queue1 {
    private Object[] data;
    private int size;
    private int front;
    private int back;

    public Queue1() {
        data = new Object[100];
   }
    
     public boolean isEmpty() {
        return size == 0;

    }
     public int size() {
            return size;
     }
     
      public Object getFront() throws QueueException {

        if (isEmpty()) {
            throw new QueueException("QueueEmpty");
        }
        return data[front];
    }    
 	
    public void enqueue(Object obj) {                              //добавляет элемент в конец очереди
        data[size] = obj;
        size++;
    }
    
    public Object dequeue() throws QueueException {   //удаляет первый элемент
        size--;
        if (isEmpty()) {
            throw new QueueException("QueueEmpty");
        }
        front++;
        return data[front- 1];
    }    
}

