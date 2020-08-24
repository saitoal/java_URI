import java.util.Scanner; 
public class Uri1067{ 
    public static void main(String args[]){ 
        Scanner teclado = new Scanner(System.in);      
        int c;
        c = teclado.nextInt();
        for ( int co = 1; co <= c; co = co+2 )
        System.out.println(+co );
    }
}