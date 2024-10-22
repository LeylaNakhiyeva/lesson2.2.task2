import java.util.Scanner;

public class Main {
    public static void main(String[] args) {                       //ders2.test3
        Scanner sc= new Scanner(System.in);
        System.out.print("ilk eded: ");
        int a= sc.nextInt();
        System.out.print("ikinci eded: ");
        int b= sc.nextInt();
        System.out.print("operator: ");
        char c=sc.next().charAt(0);
      switch (c){
          case '*': System.out.println("a*b="+a*b); break;
          case '/' : if(b!=0) System.out.println("a/b="+(a/b)); else System.err.println("Bu emeliyyat dogru deyil!");; break;
          case '-' : System.out.println("a-b="+(a-b)); break;
          case '+' : System.out.println("a+b="+(a+b));break;
          default : System.err.println("simvol yanlisdir");
     };
        //System.out.println(s);
}}