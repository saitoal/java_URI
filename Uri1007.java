import java.util.Scanner;
public class Uri1007{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        int a,b,c,d,DIFERENCA;
              
        a = teclado.nextInt();
        b = teclado.nextInt();
        c = teclado.nextInt();
        d = teclado.nextInt();

         DIFERENCA = (a * b - c * d);
            System.out.println("O JOGO DUROU 24 HORA(S)");
    }
}