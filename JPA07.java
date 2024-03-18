import java.util.Scanner;
public class JPA07 {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        while(true){
            System.out.println("Input:");
            int m=a.nextInt();
            int n=a.nextInt();
            int max=1;
            if(m==999){
                break;
            }
            for (int i = 2; i <= m; i++) {
                if (m % i == 0 && n % i == 0) {
                    max = i;
                }
            }
        System.out.println(max);
        }    
    a.close();                            
    }
}
