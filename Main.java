import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        // Scanner in = new Scanner(System.in);
        Scanner in = new Scanner(new File("input.dat"));
        int test=in.nextInt();in.nextLine();while(test-->0)solve(in);//4 test cases/comment out if no need

    }
    public static void solve(Scanner in){
        System.out.println(in.nextLine());
    }
}
