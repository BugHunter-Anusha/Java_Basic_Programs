package Java_Basic_Programs;
import java.util.Scanner;

//Question : Find the missing Number from the sequence provided (1 to n). The sequence will always differ by one, starts with 1 and the input sequence should be consecutive except the missing number. 
//Sample Input : [1,2,4,5,6], [1,2,3,4,5,6,8,9,10,11,12]
public class FindMissingNumber {

    public int findMissingNumber(int[] nums) {
        int n = nums.length + 1;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : nums) actualSum += num;
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FindMissingNumber finder = new FindMissingNumber();

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] nums = new int[size];
        System.out.println("Enter " + size + " numbers with one missing number to identify:");
        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextInt();
        }

        int missingNumber = finder.findMissingNumber(nums);
        System.out.println("The missing number is: " + missingNumber);

        scanner.close();
    }
}
