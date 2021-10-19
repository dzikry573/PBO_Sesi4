/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspbo4;

import java.util.Scanner;
/**
 *
 * @author Dzikri
 */
public class TugasPBO4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String kalimat = "";
    String reversedKalimat = "";
    Scanner input = new Scanner(System.in);

    System.out.print("Masukan Kalimat : ");

    kalimat = input.nextLine();
    reversedKalimat = reverse(kalimat);

    if (kalimat.toLowerCase().equals(reversedKalimat.toLowerCase())) {
      System.out.println("Palindrome");
    } else {
      System.out.println("Bukan Palindrome");
    }
  }

    }
    


