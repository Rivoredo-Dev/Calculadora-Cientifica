/**
 * Classe da calculadora cientifica que executa as operacoes cientificas.
 * 
 * @author João Batistella da Costa, Guilherme Pereira de Rivoredo, Pedro Henrique Freire Pereira, Rafael Barrros Infantini
 * @version 12/03/2026
 */

import java.lang.Math;

public class CalcCientifica{
    private double operando1;
    private double resultado;

    public CalcCientifica(double op1) {//construtor
        this.operando1 = op1;
    }

    public void seno() {//op de seno, que tambem muda o valor pra radiano
        this.resultado = Math.sin((Math.toRadians(this.operando1)));

        if (Math.abs(this.resultado) < 0.0000000001) {//devido imprecisao do java, arredonda valores proximos de zero
            this.resultado = 0.0;
        }
    }

    public void fatorial() //op para fatorial
    {
        if(operando1 < 0){
            System.out.print("não existe fatorial negativo");
        }

        else{
            resultado = 1;
            for (int i = 2; i <= this.operando1; i++){
                this.resultado *= i;
            }
        }
    }

    public void inverso()//op para inverso
    {
        this.resultado = 1.0/this.operando1;
    }

    public double getResultado() {//get retorna o resultado
        return this.resultado;
    }

    public void calcularBasico(char operador, double operando2) {
        CalcBasica minhaCalc = new CalcBasica(this.operando1, operando2);

        switch (operador) {
            case '+': minhaCalc.somar(); break;
            case '-': minhaCalc.subtrair(); break;
            case 'x': minhaCalc.multiplicar(); break;
            case '/': minhaCalc.dividir(); break;
            default:
                System.out.println("Operador invalido!");
                return;
        }
        
        this.resultado = minhaCalc.getResultado();
    }
}