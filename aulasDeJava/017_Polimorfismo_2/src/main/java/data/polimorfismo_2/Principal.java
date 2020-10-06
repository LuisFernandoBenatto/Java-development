package data.polimorfismo_2;

public class Principal {
    public static void main(String[] args) {
        Mamifero cachorro = new Mamifero("Marrom", 15.50, 4, 4);
        Ave pardal = new Ave("Azul-claro", 0.75, 1, 4);
        Peixe peixePalhaco = new Peixe("Laranja", 0.80, 1, 0);
        Reptil cobra = new Reptil("Preta", 2.900, 3, 0);
        System.out.println("-----------------------------------------------");
        Mamifero elefante = new Mamifero();
        elefante.setCorPelo("Cinza");
        elefante.setIdade(10);
        elefante.setMembros(4);
        elefante.setPeso(1_000.00);
        System.out.println(elefante.toString());
        elefante.locomover();
        elefante.alimentar();
        elefante.emitirSom();   
        System.out.println("-----------------------------------------------");
        System.out.println(pardal.toString());
        pardal.locomover();
        pardal.alimentar();
        pardal.emitirSom();
        pardal.fazerNinho();
        System.out.println("-----------------------------------------------");
        System.out.println(peixePalhaco.toString());
        peixePalhaco.alimentar();
        peixePalhaco.emitirSom();
        peixePalhaco.locomover();
        peixePalhaco.soltarBolhas();
        System.out.println("-----------------------------------------------");
        System.out.println(cobra.toString());
        cobra.alimentar();
        cobra.emitirSom();
        cobra.locomover();
        System.out.println("-----------------------------------------------");
    }
}
