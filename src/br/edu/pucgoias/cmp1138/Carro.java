package br.edu.pucgoias.cmp1138;

/**
 * Classe de exemplo para explicação dos conceitos dos elementos estaticos e não estaticos
 */
public class Carro {

    public static int qtde=0;

    Carro(){
        qtde++;
        System.out.println("Objeto criado. Qtde de objetos criados: " + qtde);
    }

    public static void ativarAlarme(){
        System.out.println("Alarme ativado!");
    }

    public void desativarAlarme(){
        System.out.println("Alarme desativado!");
    }
}
