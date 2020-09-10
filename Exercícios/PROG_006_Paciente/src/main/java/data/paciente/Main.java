package data.paciente;

import java.time.LocalDate;
import java.time.Month;
import java.time.DateTimeException;

public class Main {

    public static void main(String[] args) {
        String[] nomesPacientes = new String[]{
            "Maria", "João", "Ana", "Joaquin",
            "José", "Julia", "Bia", "Pedro",
            "Paulo", "Eduarda"
        };
        
        Consulta consultas[] = new Consulta[10];
        int ponteiro = -1;
        
        for (int i = 0; i < consultas.length; i++) {
            LocalDate dataDaConsulta = LocalDate.of(2020,
                                                    Month.MARCH, 
                                                    10);
            ponteiro = marcandoConsulta(consultas,
                    nomesPacientes[i],
                    dataDaConsulta,
                    ponteiro
            );
        }
        System.out.println("--------------------------------------------------"
                + "-------------------------------");
        for (int i = 0; i <= ponteiro; i++) {
            System.out.println(i + " - " +"Nome do Paciente: " +
                    consultas[i].getPaciente().getNome());
            System.out.println("------");
            System.out.println("Código do Paciente: " +
                    consultas[i].getPaciente().getCodigo());
            System.out.println("------");
            System.out.println("Data da Consulta: " +
                    consultas[i].getDataDaConsulta());
            System.out.println("*******************************************");
        } 
        System.out.println("--------------------------------------------------"
                + "-------------------------------");
    }   
    public static int marcandoConsulta(
            Consulta vetorDeConsultas[],
            String nomeDosPacientes,
            LocalDate data,
            int ponteiro
    ) {
        if(ponteiro  >= vetorDeConsultas.length) {
            System.out.println("Número máximo e pacientes atingido ");
        } else {
            ponteiro++;
        }      
        
        Paciente pacientes = new Paciente();
        pacientes.setNome(nomeDosPacientes);
        pacientes.setCodigo(ponteiro + 1);
        
        Consulta novaConsulta = new Consulta();
        novaConsulta.setPaciente(pacientes);
        novaConsulta.setDataDaConsulta(data);
        
        vetorDeConsultas[ponteiro] = novaConsulta;
        
        return ponteiro;
    }
}
