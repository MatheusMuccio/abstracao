import java.util.Scanner;

public class Principal {
    
    public static void main(String [] args){

        Indexacao indice = new Indexacao();
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite C; Python ou Java");
        System.out.println(indice.abstrairTexto(leitura.next()));

    }
}
