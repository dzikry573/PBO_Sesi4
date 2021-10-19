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
public class tugaspbo4_ {
    public static String charLib = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789~!@#$%^&*()_-+={}[]|:;’<>,.?/ ";
  public static String[] LETTER_TABLE = charLib.split("");

  public static void main(String[] args) {
    String password;
    String generatedPassword;
    Scanner input = new Scanner(System.in);

    System.out.print("Masukan Password : ");

    password = input.next();
    generatedPassword = generatePassword(password);

    System.out.println(generatedPassword);
  }

  public static String generatePassword(String password) {
    String newPassword = "";

    for ( int i = 0; i < password.length(); i++) {
      Character charLetter = password.charAt(i);
      Character lowerCaseE = 'e';
      Character upperCaseE = 'E';

      int charCode = (int) charLetter;
      char newChar = (char) (charCode + 1);

      if (Character.isUpperCase(charLetter)) {
        newPassword += newChar + "" + Character.toLowerCase(newChar);
      } else if (charLetter.equals(lowerCaseE) || (charLetter.equals(upperCaseE))) {
        newPassword += '3';
      } else {
        newPassword += Character.toUpperCase(newChar);
      } 
    }

    return newPassword;
  }
}



