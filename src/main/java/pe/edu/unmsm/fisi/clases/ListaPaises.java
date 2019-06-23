package pe.edu.unmsm.fisi.clases;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Vector;

public class ListaPaises {

    private static final Logger LOG = LoggerFactory.getLogger(ListaPaises.class);

    private ArrayList<Pais> listaPaises;

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
            LOG.info("Loaded {} sports", listaPaises.size());
        } catch (IOException | ClassNotFoundException ex) {
            LOG.error(ex.getMessage(), ex);
        }
    }

    public Pais getPais(int index) {
        return listaPaises.get(index);
    }

    public int size() {
        return listaPaises.size();
    }
}
