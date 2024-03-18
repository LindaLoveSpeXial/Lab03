import java.util.Scanner;
public class JPA06 {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        
        while(true){
            System.out.println("Input:");
            int m=a.nextInt();
            int n=a.nextInt();
            if(m==999){
                break;
            }
        double h=Math.pow(m,n);
        System.out.printf("%.0f\n",h);
        } 
    a.close();                            
    }
}
