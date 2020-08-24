import java.util.Scanner; 
public class Uri1064{ 
    public static void main(String args[]){ 
        Scanner teclado = new Scanner(System.in);      
        int c = 0;
        float a = 0, m;
        for (int i = 0 ; i < 6; i =i+1){
            float n = teclado.nextFloat();
            if ( n > 0) {
                c = c + 1;
                a = a + n;
            }
        }
        System.out.println(c + " valores positivos");
                m = a / c;
        System.out.printf( "%.1f\n", m );
    }
}