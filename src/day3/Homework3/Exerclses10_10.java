package day3.Homework3;

public class Exerclses10_10 {
    public static void main(String[] args) {
        Queue queue = new Queue(20);

        for (int i = 1; i <= 20; i++)
            queue.enqueue(i);

        while (!queue.empty())
            System.out.print(queue.dequeue() + " ");
    }
}

class Queue{
    private int[] elements;
    private int size;
    public static final int DEFAULT_CAPACITY = 8;

    public Queue(){
        this (DEFAULT_CAPACITY);
    }

    public Queue(int capacity) {
        elements = new int[capacity];
    }

    public void enqueue(int v){
        if (size >= elements.length){
            //数组扩列
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0,temp, 0,elements.length);
            elements = temp;
        }

        elements[size++] = v;
    }

    public int dequeue(){
        //先进先出输出
        return elements[elements.length - (size--)];
    }

    public boolean empty(){
        return size == 0;
    }

    public int getSize(){
        return size;
    }
}
