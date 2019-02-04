import java.util.ArrayList;

public class Classwork {
  public static ArrayList<String> makeAllWords(int k) {
    ArrayList<String> data = new ArrayList<String>();
    wordsH(k, "", data);
    return data;
  }

  public static void wordsH(int k, String word, ArrayList<String> data) {
    if (k == 0) {
      data.add(word);
    } else {
      wordsH(k - 1, word + "a", data);
      wordsH(k - 1, word + "b", data);
      wordsH(k - 1, word + "c", data);
    }
  }

  public static void main(String[] args) {
    System.out.println(makeAllWords(2));
  }
}
