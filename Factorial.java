import java.io.*;
import java.util.Scanner;
public class Factorial {
    public static void main(String args[])
    {
    int n,f=1,i;
    Scanner s=new Scanner(System.in);
    n=s.nextInt();
    for(i=1;i<=n;i++)
    f=f*i;
    System.out.println(f);
}
}
