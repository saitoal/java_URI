import java.util.Scanner;
public class Uri1003{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        int a,b,x;
              
        a = teclado.nextInt();
        b = teclado.nextInt();

         x = a + b;
            System.out.println("SOMA = " +x);
    }
}