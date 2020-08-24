import java.util.Scanner; 
public class Uri1043{ 
    public static void main(String args[]){ 
        Scanner teclado = new Scanner(System.in); 
  
  float a,b,c;
  float pe,ar;

        a  = teclado.nextFloat(); 
        b  = teclado.nextFloat(); 
        c  = teclado.nextFloat(); 

        pe = a + b + c;
        ar = ((a + b) / 2) * c;

        if (( a + b > c ) && ( a + c > b ) && ( b + c > a )){
               System.out.printf( "Perimetro = %.1f\n", pe);
               }
        
        else {
         System.out.printf( "Area = %.1f\n", ar);
        
         }
    }
}