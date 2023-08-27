import java.util.Scanner;
public class power {

    static int poww(int a, int b){
        if (b==0)
            return 1;
        else {
            b--;
            return a*poww(a,b);
        }
    }

    public static void main(String[] args) {
        System.out.println("Taban: ");
        Scanner take = new Scanner(System.in);
        int t = take.nextInt();
        System.out.println("Üs: ");
        int u = take.nextInt();
        System.out.println(poww(t,u));
    }
}
