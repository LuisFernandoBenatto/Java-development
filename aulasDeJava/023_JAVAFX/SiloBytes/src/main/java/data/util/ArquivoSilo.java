package data.util;

import data.modelo.Armazenagem;
import data.modelo.Produtores;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class ArquivoSilo {
    public static void inserir(Armazenagem silo){
        try {
            ArrayList<Armazenagem> atual = listar();
            atual.add(silo);
            FileOutputStream fos = new FileOutputStream(Info.ARQUIVO_SILO);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(atual);
            oos.close();
        } catch (Exception e) {
            System.out.println("Erro ao inserir silo.");
        }
    } 
    public static ArrayList<Armazenagem> listar() {
        ArrayList<Armazenagem> lista = new ArrayList();
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(Info.ARQUIVO_SILO);
            ObjectInputStream ois = new ObjectInputStream(fis);
            lista = (ArrayList<Armazenagem>) ois.readObject();
            ois.close();
            return lista;
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado!");
        } catch (EOFException e) {  // arquivo vazio
            return lista;
        } catch (IOException | ClassNotFoundException e) {

        } finally {
            try {
                fis.close();
            } catch (IOException ex) {
                System.out.println("\nErro ao carregar silos.!");
            }
        }
        return lista;
    }
    public static boolean excluir(long numeroVenda, Armazenagem silo){
        ArrayList<Armazenagem> lista = ArquivoSilo.listar();
        for(Armazenagem a : lista){
            if(a.getNumeroDaVenda() == numeroVenda){
                ArrayList<Produtores> listaP = ArquivoProdutor.listar();
                for(Produtores p : listaP){   
                    if(p.getCPF().equals(a.getCPF_Produtor())){
                        if(p.getDivida() >= a.getValorTotal()){
                            p.setDividaMenor(a.getValorTotal());
                            ArquivoProdutor.alterar(a.getCPF_Produtor(), p);
                        } else{
                            p.setDivida(0);
                            ArquivoProdutor.alterar(a.getCPF_Produtor(), p);
                        }
                    }
                }
                lista.remove(a);
                try {
                    FileOutputStream fos = new FileOutputStream(Info.ARQUIVO_SILO);
                    ObjectOutputStream oos = new ObjectOutputStream(fos);
                    oos.writeObject(lista);
                    oos.close();
                    return true;
                } catch (IOException ex) {
                    System.out.println("Erro ao excluir silo!");
                    return false;
                }
            }
        }
        return false;
    }
    public static void alterar(long numeroVenda, Armazenagem novoSilo, LocalDate dataSaida){
        ArrayList<Armazenagem> lista = ArquivoSilo.listar();
        for(Armazenagem a : lista){ 
            if(a.getNumeroDaVenda() == numeroVenda){  
                a.setGrao(novoSilo.getGrao());
                a.setQuantidade(novoSilo.getQuantidade());
                a.setDataSaida(dataSaida);
                long quatidadeDeDias = ChronoUnit.DAYS.between(a.getDataEntrada(), a.getDataSaida());
                if(a.getGrao().equals("Cevada") || a.getGrao().equals("cevada") || a.getGrao().equals("CEVADA")){
                    a.setValorTotal(a.getQuantidade() * quatidadeDeDias * Armazenagem.toneladaCevada);
                } else if(a.getGrao().equals("Milho") || a.getGrao().equals("milho") ||  a.getGrao().equals("MILHO")){
                    a.setValorTotal(a.getQuantidade() * quatidadeDeDias * Armazenagem.toneladaMilho);
                } else if(a.getGrao().equals("Trigo") || a.getGrao().equals("trigo") ||  a.getGrao().equals("TRIGO")){
                    a.setValorTotal(a.getQuantidade() * quatidadeDeDias * Armazenagem.toneladaTrigo);
                } else if(a.getGrao().equals("Soja") || a.getGrao().equals("soja") ||  a.getGrao().equals("SOJA")){
                    a.setValorTotal(a.getQuantidade() * quatidadeDeDias * Armazenagem.toneladaSoja);
                } else if(a.getGrao().equals("Cafe") || a.getGrao().equals("cafe") ||  a.getGrao().equals("CAFE") || a.getGrao().equals("Café")){
                    a.setValorTotal(a.getQuantidade() * quatidadeDeDias * Armazenagem.toneladaCafe);
                }
                
                ArrayList<Produtores> listaP = ArquivoProdutor.listar();
                for(Produtores p : listaP){   
                    if(p.getCPF().equals(a.getCPF_Produtor())){
                        p.setDivida(a.getValorTotal());
                        ArquivoProdutor.alterar(a.getCPF_Produtor(), p);
                    }
                }
                try {
                    FileOutputStream fos = new FileOutputStream(Info.ARQUIVO_SILO);
                    ObjectOutputStream oos = new ObjectOutputStream(fos);
                    oos.writeObject(lista);
                    oos.close();
                } catch (IOException ex) {
                    System.out.println("Erro ao alterar armazanagem!");
                }
            }
        }
    }
}
