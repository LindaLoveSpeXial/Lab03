
public class JPA02 {
    public static void main(String[] args) {
        int b=0;
        for(int i=1;i<=3;i++){
            b+=7;
            for(int j=1;j<=2;j++){
                b+=1;
            }
        }
        System.out.printf("count="+b);
    }
}
