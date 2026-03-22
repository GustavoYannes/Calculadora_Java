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

        /**
         * Recebe a String operador e retorna o tipo de operação correspondente, 
         * ou "Operação inválida" se o operador não for reconhecido.
         * @return
         */
    public String tipoOperacao(){
        return switch (operador) {
            case "+" -> "Soma";
            case "-" -> "Subtração";
            case "*" -> "Multiplicação";
            case "/" -> "Divisão";
            default -> "Operação inválida";
        };
    }

    /**
     * Recebe o tipo de operação do metodo tipoOperacao e chama o método correspondente
     *  para realizar a operação, retonando o resultado da operação ou 0 se a operação for inválida.
     * @return
     */
    public double chamarOperacao (){
            return resultado = switch (tipoOperacao()) {
            case "Soma" -> somar();
            case "Subtração" -> subtrair();
            case "Multiplicação" -> multiplicar();
            case "Divisão" -> dividir();
            default -> 0d;
        };
    }

    /**
     * Separa a string equacão em partes, chama o metodo converterValor,
     * depois atribui os valores e operador as variaveis da classe.
     * @param equacao
     * @return
     */
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


    /**
     * É chamado pelo metodo separarString, recebendo um valor em String 
     * e converte para double, depois retorna o valor convertido.
     * @param valor
     * @return
     */
    public double converterValor(String valor) {
        return Double.parseDouble(valor);
    }

    /**
     * Recebe os valores das variaveis da classe e realiza a operação de soma, depois retorna o resultado.
     * @return
     */
   public double somar(){
        resultado = valor1 + valor2;
        return resultado;   
   }

   /**
    * Recebe os valores das variaveis da classe e realiza a operação de subtração, depois retorna o resultado.
    * @return
    */
    public double subtrair(){
        resultado = valor1 - valor2;
        return resultado;
    }

    /**
     * Recebe os valores das variaveis da classe e realiza a operação de multiplicação, depois retorna o resultado.
     * @return
     */
    public double multiplicar(){
        resultado = valor1 * valor2;
        return resultado;
    }   

    /**
     * Recebe os valores das variaveis da classe e realiza a operação de divisão, depois retorna o resultado.
     * Se o valor2 for igual a zero, lança uma exceção IllegalArgumentException com a mensagem "Divisão por zero não é permitida."
     * @return
     */
    public double dividir(){
        if(valor2 == 0){
            throw new IllegalArgumentException("Divisão por zero não é permitida.");
        }
        resultado = valor1 / valor2;
        return resultado;
    }
}
