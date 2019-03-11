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

  /*Modify the array such that:
  *1. Only the indices from start to end inclusive are considered in range
  *2. A random index from start to end inclusive is chosen, the corresponding
  *   element is designated the pivot element.
  *3. all elements in range that are smaller than the pivot element are placed before the pivot element.
  *4. all elements in range that are larger than the pivot element are placed after the pivot element.
  *@return the index of the final position of the pivot element.
  */
  public static int partition(int[] data, int start, int end) {
    //Picking the pivot
    int pivotIndex = (int)(Math.random() * (end - start)) + start;
    int pivot = data[pivotIndex];
    //Switching pivot to the beginning
    data[pivotIndex] = data[start];
    data[start] = pivot;
    start += 1;

    while (start != end) {
      if (data[start] > pivot) {
        int start = data[start];
        data[start] = data[end];
        data[end] = start;
        start += 1;
      } else {
        start += 1;
      }
    }
    return 0;
  }

  public static void main(String[] args) {
    /*
    System.out.println(makeAllWords(3, 3));
    System.out.println(makeAllWords(4, 3));
    System.out.println(makeAllWords(1, 26));
    System.out.println(makeAllWords(2, 10));
    */

    int[] data = {5, 9, 10, 2, 4, 6, 3};
    System.out.println(partition(data, 4, 6));
  }
}
