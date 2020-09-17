package data.listadepacientes;
import java.time.LocalDate;
import java.time.Month;

import java.util.ArrayList;

public class Agenda {
    public static void main(String[] args) {
        ArrayList<Consulta> lista = new ArrayList();
        
        LocalDate dataAtendimento = LocalDate.of(2020, Month.DECEMBER, 5);
        Paciente paciente_1 = new Paciente();
        paciente_1.setNome("Bart");
        paciente_1.setCodigo(99);
        
        Consulta consulta_1 = new Consulta();
        consulta_1.setPaciente(paciente_1);
        consulta_1.setData(dataAtendimento);
        
        lista.add(consulta_1);
        //----------------------------------------------------------------------
        LocalDate dataAtendimento_2 = LocalDate.of(2020, Month.JULY, 16);
        Paciente paciente_2 = new Paciente();
        paciente_2.setNome("Lisa");
        paciente_2.setCodigo(98);
        
        Consulta consulta_2 = new Consulta();
        consulta_2.setPaciente(paciente_2);
        consulta_2.setData(dataAtendimento_2);
        
        lista.add(consulta_2);
        //----------------------------------------------------------------------
        LocalDate dataAtendimento_3 = LocalDate.of(2020, Month.JANUARY, 20);
        Paciente paciente_3 = new Paciente();
        paciente_3.setNome("Maggie");
        paciente_3.setCodigo(97);
        
        Consulta consulta_3 = new Consulta();
        consulta_3.setPaciente(paciente_3);
        consulta_3.setData(dataAtendimento_3);
        
        lista.add(consulta_3);       
        //----------------------------------------------------------------------
        LocalDate dataAtendimento_4 = LocalDate.of(1987, Month.MARCH, 20);
        Paciente paciente_4 = new Paciente();
        paciente_4.setNome("Homer Simpson");
        paciente_4.setCodigo(96);
        
        Consulta consulta_4 = new Consulta();
        consulta_4.setPaciente(paciente_4);
        consulta_4.setData(dataAtendimento_4);
        
        lista.add(0, consulta_4);          
        //----------------------------------------------------------------------
        for(Consulta x : lista) {
            System.out.println(
            "Pacinete: " + x.getPaciente().getNome() +
            " - " + "Código Paciente: " + 
            x.getPaciente().getCodigo() + " - " +
            "Data do atendimento: " + x.getData()
            );
        }
        //----------------------------------------------------------------------
        System.out.println("###############################################");
        //----------------------------------------------------------------------
        LocalDate data = LocalDate.of(2020, Month.NOVEMBER, 30);
        Paciente newPaciente= new Paciente();
        newPaciente.setNome("Flanders");
        newPaciente.setCodigo(100);
        
        Consulta newConsulta = new Consulta();
        newConsulta.setPaciente(newPaciente);
        newConsulta.setData(data);
        
        lista.set(0, newConsulta);
        System.out.println("---------------Update Lista---------------");
        for(Consulta x : lista) {
            System.out.println(
            "Pacinete: " + x.getPaciente().getNome() +
            " - " + "Código Paciente: " + 
            x.getPaciente().getCodigo() + " - " +
            "Data do atendimento: " + x.getData()
            );
        }
        //----------------------------------------------------------------------
        System.out.println("###############################################");
        //----------------------------------------------------------------------
        lista.remove(2);
        System.out.println("---------------Remove Lista---------------");
        for(Consulta x : lista) {
            System.out.println(
            "Pacinete: " + x.getPaciente().getNome() +
            " - " + "Código Paciente: " + 
            x.getPaciente().getCodigo() + " - " +
            "Data do atendimento: " + x.getData()
            );
        }
        //----------------------------------------------------------------------
        System.out.println("###############################################");
        //----------------------------------------------------------------------
        lista.clear();
        System.out.println("----------------Clear Lista----------------");
        for(Consulta x : lista) {            
            System.out.println(
            "Pacinete: " + x.getPaciente().getNome() +
            " - " + "Código Paciente: " + 
            x.getPaciente().getCodigo() + " - " +
            "Data do atendimento: " + x.getData()
            );
        }
        //----------------------------------------------------------------------
    }
    
}
