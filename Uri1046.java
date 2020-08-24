import java.util.Scanner; 
public class Uri1046{ 
    public static void main(String args[]){ 
        Scanner teclado = new Scanner(System.in);      
      
        int a,b,h;
              
        a = teclado.nextInt();
        b = teclado.nextInt();

        h = b - a;

        if (( h <= 0 )){
            h = h + 24;
        }
    System.out.println("O JOGO DUROU "+ h +" HORA(S)");
    }
}