import java.util.Scanner;

public class LeadersInArray {
    public static void leadersInArray(int array[],int size) {
        int leader=array[size-1];
        System.out.print(leader+" ");
        for(int i = size - 2; i >= 0; i--) {
            if(array[i]>leader) {
                leader = array[i];
                System.out.print(leader+" ");
            }
        }
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for(int i=0;i<n;i++) {
            array[i] = scanner.nextInt();
        }
        leadersInArray(array,n);
    }
}
