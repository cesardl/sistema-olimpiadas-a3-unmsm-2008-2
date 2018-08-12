package Clases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Vector;

public class ListaPaises implements Serializable{

    ArrayList<Pais> listaPaises;

    public ListaPaises() {
        listaPaises = new ArrayList<Pais>();
        String dir = System.getProperty("user.dir");
        File fPais = new File(dir + "//src//Extras//paises.obj");
        try {
            FileInputStream fisPais = new FileInputStream(fPais);
            ObjectInputStream oisPais = new ObjectInputStream(fisPais);
            Vector vPais = (Vector) oisPais.readObject();
            oisPais.close();
            for (int i = 0; i < vPais.size(); i++) {
                listaPaises.add(new Pais((String) vPais.get(i)));
            }
        } catch (IOException ioe) {
        } catch (ClassNotFoundException cnfe) {
        }
    }

    public Pais getPais(int pos) {
        return listaPaises.get(pos);
    }

    public int tamaño() {
        return listaPaises.size();
    }
}
