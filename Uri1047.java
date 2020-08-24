import java.util.Scanner; 
public class Uri1047{ 
    public static void main(String args[]){ 
        Scanner teclado = new Scanner(System.in);      
      
        int a,b,c,d,h,m;
              
        a = teclado.nextInt();
        b = teclado.nextInt();
        c = teclado.nextInt();
        d = teclado.nextInt();
        h = (( c * 60 ) + d) - (( a * 60 ) + b);

        if (( h <= 0 )){
            h = h + 1440;
        }
        int h1 = h / 60; 
            m  = h % 60; 
        
        System.out.println( "O JOGO DUROU "+ h1 +" HORA(S) E "+ m +" MINUTO(S)" );
    }
}