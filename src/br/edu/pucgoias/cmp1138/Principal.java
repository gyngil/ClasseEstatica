package br.edu.pucgoias.cmp1138;

/**
 * Classe para inicializar a execução de classes com conteúdo estatico e nao estatico
 */
public class Principal {

    public static void main(String args[]){
        System.out.println("qtde carros: " + Carro.qtde);

        Carro carro = new Carro();
        System.out.println("qtde carros: " + Carro.qtde);

        carro = new Carro();
        System.out.println("qtde carros: " + Carro.qtde);

        carro = new Carro();
        System.out.println("qtde carros: " + Carro.qtde);

        //metodo estatico
        Carro.ativarAlarme();;
        //metodo nao estatico
        carro.desativarAlarme();
    }
}
