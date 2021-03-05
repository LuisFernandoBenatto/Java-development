package data.util;

import data.modelo.Aluguel;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ArquivoAluguel {
    public static void inserir(Aluguel aluguel){
        try {
            ArrayList<Aluguel> atual = listar();
            atual.add(aluguel);
            FileOutputStream fos = new FileOutputStream(Info.ARQUIVO_ALUGUEL);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(atual);
            oos.close();
        } catch (Exception e) {
            System.out.println("Erro ao inserir aluguel.");
        }
    }
    public static ArrayList<Aluguel> listar(){
        ArrayList<Aluguel> lista = new ArrayList();
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(Info.ARQUIVO_ALUGUEL);
            ObjectInputStream ois = new ObjectInputStream(fis);
            lista = (ArrayList<Aluguel>) ois.readObject();
            ois.close();
            return lista;
        } catch (EOFException e){
            return lista;
        } catch (Exception e) {
            System.out.println("Erro ao carregar alugueis." + e.getClass());
        }
        return lista;
    }
}
