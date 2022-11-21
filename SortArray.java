public class SortArray {
    public static void main(String[] args) {

        int [] intArray = {52,46,37,64,10,82,73,91,28,7};
        int temp = 0;

        System.out.println("Original array: ");
        for (int i = 0; i <intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }

        for (int i = 0; i <intArray.length; i++) {
            for (int j = i+1; j <intArray.length; j++) {
                if(intArray[i] >intArray[j]) {      //swap elements if not in order
                    temp = intArray[i];
                    intArray[i] = intArray[j];
                    intArray[j] = temp;
                }
            }
        }

        System.out.println("\nArray sorted in ascending order: ");
        for (int i = 0; i <intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
    }
}
