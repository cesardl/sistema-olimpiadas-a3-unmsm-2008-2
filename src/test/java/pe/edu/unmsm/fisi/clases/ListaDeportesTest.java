package pe.edu.unmsm.fisi.clases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created on 12/08/2018.
 *
 * @author Cesardl
 */
class ListaDeportesTest {

    @Test
    void loadListaDeportesTest() {
        ListaDeportes listaDeportes = new ListaDeportes();
        assertNotEquals(0, listaDeportes.size());
    }
}
