import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int n = a.nextInt();
        int arr[] = new int[n];
        int sum = 0;
        for(int i = 0; i < n; i++){
            arr[i] = a.nextInt();
            sum = sum + arr[i];
            arr[i] = sum;
        }
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
