package data.util;

import data.modelo.Usuarios;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Arquivo {
    public static void inserir(Usuarios usuario) {
        try {
            ArrayList<Usuarios> atual = listar();
            atual.add(usuario);
            FileOutputStream fos = 
                                new FileOutputStream(Info.ARQUIVO_USUARIO);
            try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                oos.writeObject(atual);
                oos.close();
            }          
        } catch (IOException ex) {
            System.out.println("Erro ao inserir o usuário!" + ex);
        }
    }
    
    public static ArrayList<Usuarios> listar() {
        ArrayList<Usuarios> lista = new ArrayList();
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(Info.ARQUIVO_USUARIO);
                try (ObjectInputStream ois = new ObjectInputStream(fis)) {
                    lista = (ArrayList<Usuarios>) ois.readObject();
                    ois.close();
                }
            return lista;
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado!");
        } catch (EOFException e) {  // arquivo vazio
            return lista;
        } catch (IOException | ClassNotFoundException e) {

        } /*finally {
            try {
                fis.close();
            } catch (IOException ex) {
                System.out.println("Erro ao ler arquivo!");
            }
        }*/
        return lista;
    }
}
