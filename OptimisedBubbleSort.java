import java.util.*;

class OptimisedBubbleSort {
  void bubbleSort(int array[]) {
    int size = array.length;

    for (int i = 0; i < size - 1; i++) {
 
      boolean swapped = true;
      for (int j = 0; j < size - i - 1; j++) {

        if (array[j] > array[j + 1]) {
          
          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
          
          swapped = false;
        }
      }
      
      if (swapped == true)
        break;
    }
  }

  public static void main(String args[]) {
    int[] data = { -2, 45, 0, 11, -9 };
    OptimisedBubbleSort bs = new OptimisedBubbleSort();
    bs.bubbleSort(data);
    System.out.println("Sorted Array in Ascending Order:");
    System.out.println(Arrays.toString(data));
  }
}