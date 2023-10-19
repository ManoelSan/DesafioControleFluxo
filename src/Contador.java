import java.util.Scanner;

// Defini a exceção personalizada
class ParametrosInvalidosException extends Exception 
{
    public ParametrosInvalidosException(String message) 
    {
        super(message);
    }
}

public class Contador 
{
    public static void main(String[] args) 
    {
        try (Scanner terminal = new Scanner(System.in)) 
        {
            System.out.println("Digite o primeiro número");

            int parametroUm = terminal.nextInt();

            System.out.println("Digite o segundo número");
            
            int parametroDois = terminal.nextInt();

            try 
            {
                // Chamando o método contendo a lógica de contagem
                contar(parametroUm, parametroDois);
            } 
            catch (ParametrosInvalidosException exception) 
            {
                //Evoca amensagem de tratamento de erro caso o segundo numero seja menor
                System.out.println(exception.getMessage());
            }
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException
    {
     
        // tratamento para verificar se o segundo parametro é maior
        if (parametroUm >= parametroDois) 
        {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = parametroDois - parametroUm + 1;

        // loop for para imprimir encadeamento de numeros com base na variável contagem
        for (int i = 1; i <= contagem; i++) 
        {
            System.out.println("Imprinindo o número " + i);
        }
    }
}