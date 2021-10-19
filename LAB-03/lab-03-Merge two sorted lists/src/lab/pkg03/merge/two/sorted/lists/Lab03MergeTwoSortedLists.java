/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg03.merge.two.sorted.lists;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Lab03MergeTwoSortedLists {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter list1:");
        String numbers_1 = input.nextLine();
        String intString1[] = numbers_1.split(" ");
        //System.out.println(str.length);
        int[] intValue = new int[intString1.length];
        // int[] list1 = new int[input.nextInt()];
        for (int i = 0; i < intValue.length; i++) {
            // list1[i] = input.nextInt();
            intValue[i] = Integer.parseInt(intString1[i]);
        }

        System.out.print("Enter list2:");
        String numbers_2 = input.nextLine();
        String intString2[] = numbers_2.split(" ");
        //System.out.println(str.length);
        int[] intValue2 = new int[intString2.length];
        // int[] list1 = new int[input.nextInt()];
        for (int i = 0; i < intValue2.length; i++) {
            // list1[i] = input.nextInt();
            intValue2[i] = Integer.parseInt(intString2[i]);
        }
        /* System.out.print("Enter list2:");
        int[] list2 = new int[input.nextInt()];
        for (int i = 0; i < list2.length; i++) {
            list2[i] = input.nextInt();
        }
         */
        int[] merged_list = merge(intValue, intValue2);

      //  System.out.println(Arrays.toString(merged_list));

        java.util.Arrays.sort(merged_list);

        System.out.print("The merged list is ");
        for (int i = 0; i < merged_list.length; i++) {
            System.out.print(merged_list[i] + " ");
        }
        System.out.println();
    }

    private static int[] merge(int[] intValue, int[] intValue2) {
        int[] merged_list = new int[intValue.length + intValue2.length];

        for (int i = 0; i < intValue.length; i++) {
            merged_list[i] = intValue[i];
        }

        for (int i = 0, j = intValue.length; i < intValue2.length; i++, j++) {
            merged_list[j] = intValue2[i];
        }

        return merged_list;
    }
}
