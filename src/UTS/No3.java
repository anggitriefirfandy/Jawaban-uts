/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS;
import java.util.Scanner;

/**
 *
 * @author anggit rief irfandy
 */
public class No3 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args){
    int i, j, m, n;
    int matriks[][] = new int[10][10]; 
    int transpose[][] = new int[10][10];
    Scanner scan = new Scanner(System.in);
    System.out.print("Masukkan jumlah baris matriks A: ");
    m = scan.nextInt();
    System.out.print("Masukkan jumlah kolom matriks A: ");
    n = scan.nextInt();
    System.out.println("Masukkan elemen matriks A: ");
    for(i = 0; i < m; i++){
      for(j = 0; j< n; j++){
        matriks[i][j] = scan.nextInt();
        
      }
    }
    for(i = 0; i < m; i++){
      for(j = 0; j< n; j++){
        transpose[j][i] = matriks[i][j];
      }
    }
    System.out.println("Hasil transpose matriks: ");
    for(i = 0; i < n; i++){
      for(j = 0; j< m; j++){
        System.out.print(transpose[i][j] + "\t");
      }
      System.out.println();
    }
     System.out.print("Masukkan jumlah baris matriks B: ");
    m = scan.nextInt();
    System.out.print("Masukkan jumlah kolom matriks B: ");
    n = scan.nextInt();
    System.out.println("Masukkan elemen matriks B: ");
    for(i = 0; i < m; i++){
      for(j = 0; j< n; j++){
        matriks[i][j] = scan.nextInt();
      }
    }
    for(i = 0; i < m; i++){
      for(j = 0; j< n; j++){
        transpose[j][i] = matriks[i][j];
      }
    }
    System.out.println("Hasil transpose matriks: ");
    for(i = 0; i < n; i++){
      for(j = 0; j< m; j++){
        System.out.print(transpose[i][j] + "\t");
      }
      System.out.println();
     
      
      
     
    }
  }
}

