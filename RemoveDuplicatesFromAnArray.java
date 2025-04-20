package Java_Basic_Programs;
import java.util.*;

//Question : Take an array input from user and remove all the duplicates from that array and print the unique numbers array
//Sample input 2,2,4,6,8
//Sample output 2,4,6,8
public class RemoveDuplicatesFromAnArray {
    public int[] removeDuplicates(int[] userInput){
        Set<Integer> uniqueArray = new HashSet<>();
        for (int element:userInput){
            uniqueArray.add(element);
        }
        int[] duplicateRemovedArray = new int[uniqueArray.size()];
        int index =0;
        for (int num: uniqueArray) {
            duplicateRemovedArray[index++]=num;
        }
        return duplicateRemovedArray;
    }

    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        System.out.println("Please enter the size of the array");
        int size = scannerObject.nextInt();
        int [] userInputArray = new int[size];
        System.out.println("Now, Please enter array elements seperated by space or enter");
        for (int i=0;i<size; i++){
            userInputArray[i]=scannerObject.nextInt();
        }
        RemoveDuplicatesFromAnArray removeDuplicate = new RemoveDuplicatesFromAnArray();
        int[] resultArray = removeDuplicate.removeDuplicates(userInputArray);
        System.out.println("The Array without duplicates : ");
        for (int num: resultArray) {
            System.out.println(num + " ");
        }
        scannerObject.close();
    }
}