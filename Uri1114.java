import java.util.Scanner; 
public class Uri1114{ 
    public static void main(String args[]){ 
        Scanner teclado = new Scanner(System.in); 

        int N;

        N = teclado.nextInt();
        while (N!=2002){
            System.out.println("Senha Invalida");
            N = teclado.nextInt(); 

        }
        System.out.println("Acesso Permitido");
                
       
    }
}