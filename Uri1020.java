import java.util.Scanner; 
public class Uri1020{ 
    public static void main(String args[]){ 
        Scanner teclado = new Scanner(System.in); 
  
        int total = teclado.nextInt(); 
 
        int anos, meses, dias; 
        int resto; 

        anos  = total / 365; 
        resto = total % 365; 
 
        meses = resto / 30; 
        dias  = resto % 30; 
 
        System.out.println(anos  + " ano(s)"); 
        System.out.println(meses + " mes(es)"); 
        System.out.println(dias  + " dia(s)"); 
    } 
} 