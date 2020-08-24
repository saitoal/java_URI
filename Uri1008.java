import java.util.Scanner;
public class Uri1008{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        int a;
        int b;
        float c;
        float d;
                     
        a = teclado.nextInt();
        b = teclado.nextInt();
        c = teclado.nextFloat();

         d = b * c;
        
            System.out.println("NUMBER = " +a);
            System.out.printf("SALARY = U$ %.2f\n", d );
    }
}