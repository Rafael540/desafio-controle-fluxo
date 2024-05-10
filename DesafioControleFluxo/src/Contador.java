import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = scanner.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = scanner.nextInt();

        try {
			//chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);
            
		    }catch (ParametrosInvalidosException e) {
                System.err.println("O segundo parâmetro deve ser maior que o primeiro");
        
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            
            e.printStackTrace();}
        
        }
         

        static void contar(int parametroUm, int parametroDois )throws ParametrosInvalidosException{
            if(parametroUm > parametroDois)
                throw new ParametrosInvalidosException();
          
         
           
            int indice = 0;
            int contagem = parametroDois - parametroUm;
            for(indice = 1; indice <=contagem; indice ++){
                System.out.println("Imprimindo o número "+ indice);
            
        }

        }
    }




