import java.util.Scanner;
public class JPA05 {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        for(int i=1;i<=3;i++){
            System.out.print("Please input one value:");
            int b=a.nextInt();
            int c=1;
            if(b>=1&&b<=10){
                for(int n=1;n<=b;n++){
                    c*=n;    
                }
            System.out.println(c);    
            }else{
                System.out.println("Error,the value is out of range.");
            }
      
        }
    a.close();  
    }
}
