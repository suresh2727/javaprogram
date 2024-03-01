public class linearsearch {
    // Method to perform linear search
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i; // Return the index if the key is found
            }
        }
        return -1; // Return -1 if the key is not found
    }

    public static void main(String[] args) {

        int[] arr = { 4, 2, 7, 1, 9, 5, 3 };
        int key = 3;

        int index = linearSearch(arr, key);

        if (index != -1) {
            System.out.println("Element " + key + " found at position " + index);
        } else {
            System.out.println("Element " + key + " not found in the array");
        }
    }
}