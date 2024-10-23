public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        
        reverseArray(array);
        
        // Print the reversed array
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static void reverseArray(int[] array) {
        int left = 0;
        int right = array.length - 1;
        
        while (left < right) {
            // Swap elements
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            
            // Move towards the middle
            left++;
            right--;
        }
    }
}