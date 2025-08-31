package Queues;

public class Firsrt {

    private static final int maxSize = 101;
    private int[] a = new int[maxSize];
    private int front = 0;
    private int rear = -1;
    private int currentSize;


    public boolean isFull(){
        return currentSize == maxSize;
    }

    public int size(){
        return currentSize;
    }

    public void enqueue(int item){

        if(isFull()){
            System.out.println("Queue is full. Cannot enqueue");
            return;
        }
        else{
            rear = (rear + 1) % maxSize;
            a[rear] = item;
        }
        currentSize++;
    }

    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        int removedElem = a[front];
        front = (front + 1) % maxSize;
        currentSize--;
        return removedElem;
    }

    public boolean isEmpty(){
        if(currentSize == 0){
            return true;
        }
        else{
            return false;
        }
    }

}
