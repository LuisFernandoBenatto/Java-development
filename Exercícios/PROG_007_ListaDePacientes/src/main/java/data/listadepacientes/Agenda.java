package data.listadepacientes;
import java.time.LocalDate;
import java.time.Month;

public class Agenda {
    public static void main(String[] args) {
     Consulta consultas[] = new Consulta[10];
        Paciente p = new Paciente(1, "Bob Esponja");

        LocalDate d = LocalDate.now();
        Consulta c = new Consulta(d, p);

        consultas[0] = c;

        Consulta c2 = new Consulta(LocalDate.of(2020, Month.OCTOBER, 10),
                new Paciente(2, "Patrick"));

        consultas[1] = c2;

        for (int i = 0; i < 10; i++) {
            if (consultas[i] != null) {
                System.out.println(consultas[i].getData());
                System.out.println(consultas[i].getPaciente().getNome());
            }
        }   
    }
    
}
