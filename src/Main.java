import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int number1,number2 , result=1;

        Scanner input=new Scanner(System.in);
        System.out.print("Üssü alınacak sayıyı girin :");
        number1=input.nextInt();

        System.out.print("Üs olacak sayıyı girin :");
        number2=input.nextInt();

        for(int i=1 ; i<=number2;i++){
            result*=number1;
        }
        System.out.print("Sonuç : "+result);


    }
}