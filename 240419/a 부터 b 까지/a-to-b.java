import java.util.*;
public class Main {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int a = sc.nextInt();
     int b = sc.nextInt();

     for(int i = a; i <= b; i++){
        System.out.print(a + " ");
        if(i % 2 == 0) a += 3;
        else if(i % 2 != 0) a *= 2;
        if(a > b) break;
     }
    }
}