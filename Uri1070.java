import java.util.Scanner; 
public class Uri1070{ 
    public static void main(String args[]){ 
        Scanner teclado = new Scanner(System.in);      
        int c;
        c = teclado.nextInt();
        if(c %2 ==0){
            c= c + 1;
        }
        for ( int co = 1; co <= 6; co = co + 1 ){
        System.out.println(c);
        c = c + 2;
        }
    }
}