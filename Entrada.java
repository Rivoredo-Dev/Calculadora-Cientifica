/**
 * Classe que gerencia a entrada do teclado.
 * 
 * @author João Batistella da Costa, Guilherme Pereira de Rivoredo, Pedro Henrique Freire Pereira, Rafael Barrros Infantini
 * @version 12/03/2026
 */

import java.util.Scanner;

public class Entrada{
    public static String teclado(String mensagem){
        // Cria um objeto da classe Scanner, para leitura pelo teclado
        Scanner sc = new Scanner(System.in);

        // Mostra msg na console
        System.out.print(mensagem);
        
        // Faz a leitura pelo teclado
        String s = sc.nextLine();
        
        // Fecha dispositivo de entrada
        // sc.close();
        
        // Retorna a string lida
        return s;
    }
}
