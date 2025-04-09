import java.util.Scanner;

public class wordexample {
  String strdata;

  wordexample(String s){ 
    this.strdata = s; 
  }

  public void countWords() {
    String[] words = strdata.split("\\s+");
    int cnt = 0;
    for (String word : words) {
      if (!word.isEmpty() && checkVowel(word.charAt(0)) &&
          checkVowel(word.charAt(word.length() - 1))) {
        cnt++;
      }
    }
    System.out.println("Numbers starting and ending with vowels: " + cnt);
  }

  public void placeWords() {
    String[] words = strdata.split("\\s+");
    StringBuilder vowelWords = new StringBuilder();
    StringBuilder otherWords = new StringBuilder();
    for (String word : words) {
      if (!word.isEmpty() && checkVowel(word.charAt(0)) && checkVowel(word.charAt(word.length() - 1))) {
        vowelWords.append(word + " ");
      } 
      else{
        otherWords.append(word + " ");
      }
    }
    System.out.println("New Sentence is: " + vowelWords.toString() + otherWords.toString());
  }

  public boolean checkVowel(char c) {
    return "AEIOUaeiou".indexOf(c) != -1;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a String: ");
    String s = sc.nextLine();
    if (s.endsWith(".") || s.endsWith("?") || s.endsWith("!")) {
      wordexample obj = new wordexample(s);
      obj.countWords();
      obj.placeWords();
    }
    else {
      System.out.println("Invalid String.");
    }
    sc.close();
  }
}