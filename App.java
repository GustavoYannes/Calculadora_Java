package Calculadora_Java;

public class App {

    public static void main(String[] args) {
       IO.println("Calcadora Java");
       String equacao = IO.readln("Digite a expressão (ex: valor operador valor): ");
         Calculadora calculadora = new Calculadora(equacao);
         String resultado = calculadora.resultado + "";
            IO.println("Resultado: " + resultado);
        
    }
    
}
