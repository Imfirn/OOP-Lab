/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg03.explore.matrix;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Lab03ExploreMatrix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sizeOfMatrix,sumColum=0,colum=0,sumRow=0,sumDia=0, sumSDia=0,sumSuDia=0;
        boolean checkColum=false,checkRow=false;
        
        Random random = new Random();
        Scanner input = new Scanner(System.in);
         
         System.out.print("Enter the size of matrix : ");
         sizeOfMatrix=input.nextInt();
         if(sizeOfMatrix>1){
         int[][] matrix = new int[sizeOfMatrix][sizeOfMatrix];
        
         for(int i=0; i<sizeOfMatrix;i++)
         {
         for(int j=0; j<sizeOfMatrix;j++)
         {
            matrix[i][j] = random.nextInt(2);
         
         }
              }
         
         for(int i=0;i<sizeOfMatrix;i++){
         for(int j=0;j<sizeOfMatrix;j++){
              System.out.print(matrix[i][j]);
         }
             System.out.println();
         }
           
         //check colum
         for(int i=0;i<sizeOfMatrix;i++){
          for(int j=0;j<sizeOfMatrix;j++){
              if(matrix[0][i] == matrix[j][i]){
              
                  sumColum++;
              
              }
              if(sumColum==sizeOfMatrix){
              
                  System.out.printf("All %ds on colum %d\n",matrix[0][i],colum);
                    checkColum=true;            
              }                      
              
          }
          colum++;
          sumColum=0;
         }
         
         if( checkColum==false){
         
             System.out.println("No same numbers on colum ");
         
         }
         
         
          //check row
         for(int i=0;i<sizeOfMatrix;i++){
          for(int j=0;j<sizeOfMatrix;j++){
              if(matrix[i][0] == matrix[i][j]){
              
                  sumRow++;
              
              }
              if(sumRow==sizeOfMatrix){
              
                  System.out.printf("All %ds on row %d\n",matrix[i][0],i);
                    checkRow=true;            
              }                      
              
          }
         // row++;
           sumRow=0;
         }
         
         if( checkRow==false){
         
             System.out.println("No same numbers on Row");
         
         }
         
         //check  diagonal
         
          for(int i=0;i<sizeOfMatrix;i++){         
              if(matrix[i][i] == matrix[0][0]){
         
                    sumDia++;
              }                      
              
          }
         if(sumDia==sizeOfMatrix)  {
            
                 System.out.printf("All %ds on the digonal\n",matrix[0][0]);
                        
            } else{
            
                System.out.println("No same numbers on the diagonal");
            
            }
         
         
         //check  super-diagonal
         
          for(int i=0;i<sizeOfMatrix-1;i++){         
              if(matrix[i][i+1] == matrix[0][1]){
         
                    sumSDia++;
              }                      
              
          }
         if(sumDia==sizeOfMatrix-1)  {
            
                 System.out.printf("All %ds on the superdigonal\n",matrix[0][1]);
                        
            } else{
            
                System.out.println("No same numbers on the superdiagonal");
            
            }
         
         
          //check  sub-diagonal
         
          for(int i=0;i<sizeOfMatrix-1;i++){         
              if(matrix[i+1][i] == matrix[1][0]){
         
                    sumSuDia++;
              }                      
              
          }
         if(sumDia==sizeOfMatrix-1)  {
            
                 System.out.printf("All %ds on the subdigonal\n",matrix[1][0]);
                        
            } else{
            
                System.out.println("No same numbers on the subdiagonal");
            
            }
     
         
          
         }else{
          
             System.out.println("Enter the wrong number");
         
         }
                  
        
    }
    
}
