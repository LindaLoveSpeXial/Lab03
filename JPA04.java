import java.util.Scanner;
public class JPA04 {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        double c=0;
        int f=0;
        while(true){
            System.out.print("Please enter meal dollars or enter -1 to stop:");
            double b=a.nextInt();
            c+=b;
            f+=1;
            if(b==-1){
                break;
            }
        }
        c+=1;
        System.out.println("餐點總費用:"+c);
        f-=1;
        double d=c/f;
        System.out.printf(f+" 道餐點平均費用為: %.2f",d);
    a.close();
    }
}
