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
public class Lab06Queue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Queue queue = new Queue();
        
        
        
        for (int i = 1; i <= 20; i++) {
            queue.enqueue(i);
        }
        queue.printQuene();
        System.out.println("Empty: "+queue.empty());
        int queueSize = queue.getSize();       
        
        System.out.println("Size: "+queue.getSize());
        System.out.println("Element: "+queue.getE());
        
        System.out.println("_______________________");
      
        for (int j = 0; j <5; j++) {
            queue.dequeue();
        }
        
               
        queue.printQuene();
        System.out.println("_______________________");
        System.out.println("Size: "+queue.getSize());
        System.out.println("Element: "+queue.getE());
       
        
        
      for (int i = 1; i <= 12; i++) {
            queue.enqueue(i);
        }
        System.out.println("_____After enqueue 12 _______");
         queue.printQuene();
        System.out.println("Size: "+queue.getSize());
        System.out.println("Element: "+queue.getE());
        System.out.println("Empty: "+queue.empty());
       
    }

}
