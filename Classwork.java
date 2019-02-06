import java.util.ArrayList;

public class Classwork {
  public static ArrayList<String> makeAllWords(int k, int maxLetter) {
    ArrayList<String> data = new ArrayList<String>();
    wordsH(k, "", data, maxLetter);
    return data;
  }

  public static void wordsH(int k, String word, ArrayList<String> data, int maxLetter) {
    if (k == 0) {
      data.add(word);
    } else {
      for (int i = 0; i < maxLetter; i++) {
        int newL = 'a' + i;
        char newLetter = (char)newL;
        wordsH(k - 1, word + newLetter, data, maxLetter);
      }
      //wordsH(k - 1, word + "a", data);
      //wordsH(k - 1, word + "b", data);
      //wordsH(k - 1, word + "c", data);
    }
  }

  public static void main(String[] args) {
    System.out.println(makeAllWords(1, 26));
    System.out.println(makeAllWords(2, 3));
  }
}
