import java.util.*;

class add{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        char c = sc.next();

        if(c=='+')System.out.println(add(a,b,c));
        else if(c=='-')System.out.println(sub(a,b,c));

    }

    public static int add(int a, int b, int c){
        return a+b;
    }

    public static int sub(int a, int b, int c){
        return a-b;
    }
}