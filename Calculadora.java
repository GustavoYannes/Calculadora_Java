package Calculadora_Java;

public class Calculadora {
    public double valor1;
    public double valor2;
    public String operador;
    public double resultado;

    public Calculadora(String equacao) {
        separarString(equacao);
        tipoOperacao();
        chamarOperacao();
        }

    public String tipoOperacao(){
        return switch (operador) {
            case "+" -> "Soma";
            case "-" -> "Subtração";
            case "*" -> "Multiplicação";
            case "/" -> "Divisão";
            default -> "Operação inválida";
        };
    }

    public double chamarOperacao (){
            return resultado = switch (tipoOperacao()) {
            case "Soma" -> somar();
            case "Subtração" -> subtrair();
            case "Multiplicação" -> multiplicar();
            case "Divisão" -> dividir();
            default -> 0d;
        };
    }

    public String separarString(String equacao) {
        String[] partes = equacao.split(" ");
        String valor1 = partes[0];
        this.valor1 = converterValor(valor1);
        String operador = partes[1];
        String valor2 = partes[2];
        this.valor2 = converterValor(valor2);
        this.operador = operador;
        return valor1 + " " + operador + " " + valor2;
    }


    public double converterValor(String valor) {
        return Double.parseDouble(valor);
    }

   public double somar(){
        resultado = valor1 + valor2;
        return resultado;   
   }

    public double subtrair(){
        resultado = valor1 - valor2;
        return resultado;
    }

    public double multiplicar(){
        resultado = valor1 * valor2;
        return resultado;
    }   

    public double dividir(){
        if(valor2 == 0){
            return 0;
        }
        resultado = valor1 / valor2;
        return resultado;
    }
}
