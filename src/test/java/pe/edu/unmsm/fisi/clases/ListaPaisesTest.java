package pe.edu.unmsm.fisi.clases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created on 12/08/2018.
 *
 * @author Cesardl
 */
class ListaPaisesTest {

    @Test
    void loadListaPaisesTest() {
        ListaPaises listaPaises = new ListaPaises();
        assertNotEquals(0, listaPaises.size());
    }
}
