/**
 * Classe que contem a inicializaçao das calculadoras.
 * 
 * @author João Batistella da Costa, Guilherme Pereira de Rivoredo, Pedro Henrique Freire Pereira, Rafael Barrros Infantini
 * @version 12/03/2026
 */

public class AppCalc {
    public static void main(String[] args) {

        //Declaração das variáveis
        String operando1;
        String operador;
        String operando2 = ""; //evitar erro de inicializaçao na linha 56
        boolean Cientifica = false;

        if (args.length == 3) { //entrada pela linha de comando
            operando1 = args[0];
            operador = args[1];
            operando2 = args[2];
        } else if (args.length == 2) { //entrada pela linha de comando
            operando1 = args[0];
            operador = args[1];
            Cientifica = true;
        } 
        else {   //entrada pelo teclado
            operando1 = (Entrada.teclado("Digite o operando1: "));
            String aux = Entrada.teclado("Digite o operador: "); 
            operador = aux;

            if ((Utils.validarOperador(operador))){//verifica se é operador da calculadora cientifica
                Cientifica = true;
            } else{
                operando2 = (Entrada.teclado("Digite o operando2: "));//caso nao seja cientifico, pede a entrada do operando 2
            }
        }

        if(Utils.validarOperando(operando1)){//verifica se o operando1 é numerico
            double op1 = Double.parseDouble(operando1);
            char opr = operador.charAt(0);
            //Executa a conta dependendo do tipo cientifico ou basico
            CalcCientifica calcCien = new CalcCientifica(op1);
            if (Cientifica) {
                

                switch(opr) {//s para seno, ! para fatorial e i para inverso
                    case 's': calcCien.seno(); break;
                    case '!': calcCien.fatorial(); break;
                    case 'i': calcCien.inverso(); break;
                    default: 
                        System.out.println("Operador invalido!"); 
                        return;
                }
                System.out.println("Resultado: " + calcCien.getResultado());

            } else {
                if(Utils.validarOperando(operando2)){//verifica se o operando2 é numerico
                    double op2 = Double.parseDouble(operando2);
                    calcCien.calcularBasico(opr,op2);
                    System.out.println("Resultado: " + calcCien.getResultado());
                }
                else{
                    System.out.print("operando invalido!");
                }
            }
        }
        else{
            System.out.print("operando invalido!");
        }
    }   
}

