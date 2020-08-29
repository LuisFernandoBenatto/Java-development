package com.mycompany.es_formula_1;
/*
Crie uma classe principal que gerencie o cadastro dos carros. Nesta classe, crie
um ponteiro (do tipo inteiro) para gerenciar os espaços disponíveis em um vetor 
com 10 posições.

O Ponteiro deve ser usado para gerenciar os dados cadastrados no vetor. Ou seja,
ao inserir ou remover um carro, o ponteiro deverá ser atualizado.

Faça um algoritmo de busca baseada no atributo “Equipe” onde seja possível 
localizar o índice de um elemento no vetor de Carros e imprima todos os dados 
deste Carro;

Faça um algoritmo que realize a remoção de um elemento no vetor, deslocando os
demais para uma posição anterior, a partir da posição deste vetor.
*/
public class Main {

    public static void main(String[] args) {
        int _ponteiro = -1;
        
        CarroF1 vetorCarro[] = new CarroF1[10];
        
        for (int i = 0; i < vetorCarro.length; i++) {
            vetorCarro[i] = new CarroF1();
        }
        
        CarroF1 carro1 = new CarroF1();
        carro1.cadastrarCarro("Mercedes", "Mercedes 1.6 V6", "Pirelli", "Prata","Hamilton", "Bottas", 650);
        _ponteiro = inserirDado(vetorCarro, carro1, _ponteiro);
        
        CarroF1 carro2 = new CarroF1();
        carro2.cadastrarCarro("BWT", "Mercedes 1.6 V6", "Pirelli", "Rosa", "Perez", "Stroll", 655);
        _ponteiro = inserirDado(vetorCarro, carro2, _ponteiro);
        
        CarroF1 carro3 = new CarroF1();
        carro3.cadastrarCarro("Mclaren", "Renault 1.6 V6", "Pirelli", "Amarelo", "Sainz", "Norris", 650);
        _ponteiro = inserirDado(vetorCarro, carro3, _ponteiro);
        
        CarroF1 carro4 = new CarroF1();
        carro4.cadastrarCarro("Renault", "Renault 1.6 V6", "Pirelli", "Preto", "Ricciardo", "Ocon", 645);
        _ponteiro = inserirDado(vetorCarro, carro4, _ponteiro);
        
        CarroF1 carro5 = new CarroF1();
        carro5.cadastrarCarro("Hass", "Ferrari1.6 V6", "Pirelli", "Branco", "Grosjean", "Magnussen", 660);
        _ponteiro = inserirDado(vetorCarro, carro5, _ponteiro);
        
        CarroF1 carro6 = new CarroF1();
        carro6.cadastrarCarro("Alpha Romeo", "Ferrari1.6 V6", "Pirelli", "Vermelho", "Raikkonen","Giovinazzi", 640);
        _ponteiro = inserirDado(vetorCarro, carro6, _ponteiro);
        
        CarroF1 carro7 = new CarroF1();
        carro7.cadastrarCarro("Alpha Tauri", "Honda 1.6 V6", "Pirelli", "Preto Branco", "Kvyat", "Gasly", 640);
        _ponteiro = inserirDado(vetorCarro, carro7, _ponteiro);
        
        CarroF1 carro8 = new CarroF1();
        carro8.cadastrarCarro("Williams", "Mercedes 1.6 V6", "Pirelli", "Azul Vermelho", "Russel", "Latifi",640);
        _ponteiro = inserirDado(vetorCarro, carro8, _ponteiro);
        
        CarroF1 carro9 = new CarroF1();
        carro9.cadastrarCarro("Red Bull", "Honda 1.6 V6", "Pirelli", "Preto Vermelho", "Verstappen", "Albon", 630);
        _ponteiro = inserirDado(vetorCarro, carro9, _ponteiro);
        
        CarroF1 carro10 = new CarroF1();
        carro10.cadastrarCarro("Ferrari", "Ferrari 1.6 V6", "Pirelli", "Vermelho", "Vettel", "Leclerc", 630);
        _ponteiro = inserirDado(vetorCarro, carro10, _ponteiro);
        
        for(int i = 0; i < vetorCarro.length; i++) {
            System.out.println(vetorCarro[i].imprimir());
        }
        
        int mclaren = buscar("Mclaren", vetorCarro);
        System.out.println(vetorCarro[mclaren].imprimir());
        int redBull = buscar("Red Bull", vetorCarro);
        System.out.println(vetorCarro[redBull].imprimir());
        
        int equipeAlphaRomeo = buscar("Alpha Romeo", vetorCarro);
        
        if(removerElemento("Alpha Romeo", vetorCarro)) {
            System.out.println("\nCarro removido!\n");
        }
        System.out.println(vetorCarro[equipeAlphaRomeo].imprimir());
        
        if(buscar("Alpha Romeo", vetorCarro) == -1 ) {
            System.out.println("Essa equipe de corrida, não existe!!!\n");
        }
    }
    //--------------------------------------------------------------------------
    public static int buscar(String equipe, CarroF1 vetorCarro[]) {
        System.out.println("**** Buscando Carro de Formula 1 ****\n");
        for (int i = 0; i < vetorCarro.length; i++) {
            if(vetorCarro[i]._equipe == equipe) {
                return i;
            }
        }
        return -1;
    }
    //--------------------------------------------------------------------------
    public static boolean removerElemento(String equipe, CarroF1 vetorCarro[]) {
        int index = buscar(equipe, vetorCarro);
        
        if(index == -1) {
            return false;
        }
        
        for (int i = index; i < vetorCarro.length ; i++) {
            if(i <(vetorCarro.length)-1) {
                vetorCarro[i] = vetorCarro[i+1];
            }  
            if(i+1 == vetorCarro.length) {
                vetorCarro[i] = new CarroF1();
            }
        }
        return true;
    }
    //--------------------------------------------------------------------------
    public static int inserirDado(CarroF1 vetorCarro[], CarroF1 carro1, int ponteiro)  { 
        if(ponteiro < vetorCarro.length) {
            ponteiro++;
            vetorCarro[ponteiro] = carro1;
            
            System.out.println("Ponteiro: " + ponteiro);
            System.out.println("**** Inserido com sucesso!!! ****"); 
        } else {
            System.out.println("**** Lista cheia! ****\n\n");
        }
        
        return ponteiro;
    }
    //--------------------------------------------------------------------------
}

