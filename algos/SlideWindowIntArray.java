package algos;

public class SlideWindowIntArray {

  public static int slide(int[] array, int k) {
    int length = array.length;

    int currentWindow = 0;

    // we need to determine first window sum
    for (int i = 0; i < k; i++)
      currentWindow += array[i];

    int maxWindow = currentWindow;

    // if sum of next window > previous then update maxWindow var and so on
    for (int i = k; i < length; i++) {
      currentWindow += array[i] - array[i - k];
      if (currentWindow > maxWindow) {
        maxWindow = currentWindow;
      }
    }

    return maxWindow;
  }
}