import java.util.Scanner; 
public class Uri1065{ 
    public static void main(String args[]){ 
        Scanner teclado = new Scanner(System.in);      
        int c;
        int p=0;
        for ( int co = 1 ; co <=5 ; co++ ){
            c = teclado.nextInt();
            if (c %2 == 0){
                p++;
            }
        }
        System.out.println(p + " valores pares");
    }
}