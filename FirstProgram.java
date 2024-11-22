import java.util.*;



public class FirstProgram {

    public static void main(String[] args) {


        System.out.println("Hello World");

        int[] arr = {1, 2, 3, 4, 5};
        int[] arr3 = new int[arr.length + 7];
        System.out.println(arr3.length);
        arr3[0] = 8;
        arr3[3] = 7;
        arr3[9] = 51;
        System.out.println(Arrays.toString(arr3));
        Arrays.sort(arr3);
        // for(int i = 0; i < arr.length; i++){}
        for (int num : arr3) {
            System.out.print("," + num);
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter any word: ");
        String word = sc.next();
        System.out.println("You entered this word: " + word);
        System.out.print("Please, enter any integer number: ");
        int i = sc.nextInt();
        System.out.println("You entered this integer number: " + i);

    }
}