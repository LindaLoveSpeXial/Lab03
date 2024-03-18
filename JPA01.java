import java.util.Scanner;
public class JPA01 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Input:");
        int b = a.nextInt();
        int c=0;
        for(int i=1;i<=b;i++){
            c+=i;    
        }
        System.out.printf("1 + ... + "+b+" = "+c);
    a.close();
    }
}
