package data.util;

import data.modelo.Produtores;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;

public class ArquivoProdutor {
    public static void inserir(Produtores produtor){
        try {
            ArrayList<Produtores> atual = listar();
            atual.add(produtor);
            FileOutputStream fos = new FileOutputStream(Info.ARQUIVO_PRODUTOR);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(atual);
            oos.close();
        } catch (Exception e) {
            System.out.println("Erro ao inserir produtor.");
        }
    }
    public static ArrayList<Produtores> listar(){
        ArrayList<Produtores> lista = new ArrayList();
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(Info.ARQUIVO_PRODUTOR);
            ObjectInputStream ois = new ObjectInputStream(fis);
            lista = (ArrayList<Produtores>) ois.readObject();
            ois.close();
            return lista;
        } catch (EOFException e){
            return lista;
        } catch (Exception e) {
            System.out.println("Erro ao carregar produtores.");
        }
        return lista;
    }
        public static boolean excluir(String ID, Produtores produtor){
        ArrayList<Produtores> lista = ArquivoProdutor.listar();
        for(Produtores p : lista){
            if(p.getID().equals(ID)){  
                lista.remove(p);
                try {
                    FileOutputStream fos = new FileOutputStream(Info.ARQUIVO_PRODUTOR);
                    ObjectOutputStream oos = new ObjectOutputStream(fos);
                    oos.writeObject(lista);
                    oos.close();
                    return true;
                } catch (IOException ex) {
                    System.out.println("Erro ao excluir produtor!");
                    return false;
                }            
            }
        }
        return false;
    }
    
    public static void alterar(String ID, Produtores novoProdutor){
        ArrayList<Produtores> lista = ArquivoProdutor.listar();
        for(Produtores p : lista){   
            if(p.getID().equals(ID)){  
                p.setNomeProdutor(novoProdutor.getNomeProdutor());
                p.setCPF(novoProdutor.getCPF());
                p.setDataNascimento(novoProdutor.getDataNascimento());
                p.setTelefone(novoProdutor.getTelefone());
                try {
                    FileOutputStream fos = new FileOutputStream(Info.ARQUIVO_PRODUTOR);
                    ObjectOutputStream oos = new ObjectOutputStream(fos);
                    oos.writeObject(lista);
                    oos.close();
                } catch (IOException ex) {
                    System.out.println("Erro ao alterar o produtor!");
                }
            }
        }
    }
}
