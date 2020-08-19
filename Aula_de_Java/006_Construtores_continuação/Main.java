package construtores_continuação;

public class Main {

    public static void main(String[] args) {
        System.out.println(">>>Classe paciente<<<");
        Paciente paciente = new Paciente();
        paciente.nome = "Rigby";
        paciente.idade = 18;
        System.out.println("Nome do paciente: " + paciente.nome
                + ".\nIdade do paciente: " + paciente.idade + " anos.");

        System.out.println("\n\n>>>Classe consulta<<<");
        Consulta consulta = new Consulta();
        consulta.numero = 123;
        consulta.paciente.nome = "Mordekay";
        consulta.paciente.idade = 20;

        System.out.println(
                "Numero do pacinete: " + consulta.numero
                + "\nNome do paciente: " + consulta.paciente.nome
                + "\nIdade do paciente: " + consulta.paciente.idade
        );

        System.out.println("\n\n>>>Vetor de Pacintes<<<");
        Paciente listaPacientes[] = new Paciente[5];
        for (int i = 0; i < listaPacientes.length; i++) {
            listaPacientes[i] = new Paciente();
            listaPacientes[i].nome = "Mordekay";
            listaPacientes[i].idade = 60;
            System.out.println("Nome do paciente: " + listaPacientes[i].nome
                    + "\nIdade do paciente: " + listaPacientes[i].idade
                    + "\n");
        }
    }
}
