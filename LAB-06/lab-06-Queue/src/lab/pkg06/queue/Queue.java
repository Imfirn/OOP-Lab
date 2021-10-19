/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg06.queue;

/**
 *
 * @author USER
 */
public class Queue {

    private int[] elements;
    private int size;

    public Queue() {
        elements = new int[8];

    }

    public boolean empty() {
        int count = 0;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == 0) {
                count++;
                if (count >= 1) {
                    return true;
                }

            }
        }

        return false;
    }

    public int getSize() {
        return size;
    }

    public int getE() {
        return elements.length;
    }

    public void printQuene() {
        for (int i = 0; i < size; i++) {

            System.out.println(elements[i]);

        }
    }

    public int[] enqueue(int v) {
        ///if full 
        if (size >= elements.length) {
            // doubled once
            int[] valu = new int[elements.length * 2];
            System.arraycopy(elements, 0, valu, 0, elements.length);
            elements = valu;
        }
        //add
        elements[size] = v;
        size++;
        return elements;
    }

    public int dequeue() {
        ///start at first queue
        int val = elements[0];
        ///lost 1 index
        int[] temp = new int[elements.length - 1];
        System.arraycopy(elements, 1, temp, 0, elements.length - 1);
        elements = temp;
        size--;

        return val;
    }

}
