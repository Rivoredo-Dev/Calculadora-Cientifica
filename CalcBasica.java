/**
 * Classe da calculadora basica que executa as operacoes basicas.
 * 
 * @author João Batistella da Costa, Guilherme Pereira de Rivoredo, Pedro Henrique Freire Pereira, Rafael Barrros Infantini
 * @version 12/03/2026
 */

public class CalcBasica {
    
    private double operando1;
    private double operando2;
    private double resultado;
    


    public CalcBasica(double op1, double op2) {//construtor
        this.operando1 = op1;
        this.operando2 = op2;
    }


    public void somar() {
        this.resultado = this.operando1 + this.operando2;
    }


    public void subtrair() {
        this.resultado = this.operando1 - this.operando2;
    }


    public void multiplicar() {
        this.resultado = this.operando1 * this.operando2;
    }


    public void dividir() {
        if(this.operando2 != 0) {
            this.resultado = this.operando1 / this.operando2;
        } else {
            System.out.println("Nao e possivel divirir por zero!!");
            return;
        }
    }


    public double getResultado() {
        return this.resultado;
    }
}
