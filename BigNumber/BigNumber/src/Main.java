import java.math.*;
import java.util.*;

public class Main {
    public static void main(String[] args)  {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        BigInteger n = sc.nextBigInteger();
        sc.close();
        System.out.println(n.isProbablePrime(10) ? ("prime") : ("not prime"));
    }
}
