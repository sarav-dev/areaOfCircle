import java.util.*;

public class areaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        System.out.println((int)Math.ceil(Math.PI * R * R));
    } 
}
