package pe.edu.unmsm.fisi.clases;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.ArrayList;
import java.util.Vector;

public class ListaPaises implements Serializable {

    private static final Logger LOG = LoggerFactory.getLogger(ListaPaises.class);

    ArrayList<Pais> listaPaises;

    public ListaPaises() {
        listaPaises = new ArrayList<>();
        String dir = System.getProperty("user.dir");
        File fPais = new File(dir + "//src//main//resources//Extras//paises.obj");
        try {
            FileInputStream fisPais = new FileInputStream(fPais);
            ObjectInputStream oisPais = new ObjectInputStream(fisPais);
            Vector vPais = (Vector) oisPais.readObject();
            oisPais.close();
            for (Object vPai : vPais) {
                listaPaises.add(new Pais((String) vPai));
            }
        } catch (IOException | ClassNotFoundException ex) {
            LOG.error(ex.getMessage(), ex);
        }
    }

    public Pais getPais(int pos) {
        return listaPaises.get(pos);
    }

    public int tamaño() {
        return listaPaises.size();
    }
}
