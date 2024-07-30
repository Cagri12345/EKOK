package Basic;
import java.util.Scanner;
public class EKOK {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1 , n2;

        System.out.println("n1 sayısını girin: ");
        n1 = input.nextInt();

        System.out.println("n2 sayısını girin: ");
        n2 = input.nextInt();

        for(int i = 1 ; i <= (n1 * n2) ; i++){
            if(i % n1 == 0 && i % n2 == 0){
                System.out.println("Ekok: " + i);
                break;
            }
        }
    }
}
