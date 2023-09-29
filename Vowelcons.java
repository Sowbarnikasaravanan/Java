//To find the number of vowels and consonants in a sentence
import java.io.*;
import java.util.*;
class Vowelandconsonant {
  public static void main(String[] args) {
    String sent;
    int vowels = 0, consonants = 0, digits = 0, spaces = 0;
    Scanner sc=new Scanner(System.in);
    System.out.println("The sentence to count:");
    sent=sc.nextLine();
    sent =sent.toLowerCase();
    for (int i = 0; i < line.length(); ++i) {
      char ch = sent.charAt(i);
      if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
        vowels++;
      }
      else if ((ch >= 'a' && ch <= 'z')) {
        consonants++;
      }
      else if (ch >= '0' && ch <= '9') {
        digits++;
      }
      else if (ch == ' ') {
        spaces++;
      }
    }

    System.out.println("Vowels: " + vowels);
    System.out.println("Consonants: " + consonants);
    System.out.println("Digits: " + digits);
    System.out.println("White spaces: " + spaces);
  }
}
