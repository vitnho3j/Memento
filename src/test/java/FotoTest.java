import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FotoTest {

    @Test
    public void deveArmazenarEstados(){
        Foto foto = new Foto();
        foto.setEstado(EdicaoFotoEstadoInicial.getInstance());
        foto.setEstado(EdicaoFotoBrilho.getInstance());
        assertEquals(2, foto.getEstados().size());
    }

    @Test
    public void deveRetornarEstadoInicial(){
        Foto foto = new Foto();
        foto.setEstado(EdicaoFotoEstadoInicial.getInstance());
        foto.setEstado(EdicaoFotoContraste.getInstance());
        foto.restauraEstado(0);
        assertEquals(EdicaoFotoEstadoInicial.getInstance(), foto.getEstado());
    }

    @Test
    public void deveRetornarEstadoAnterior(){
        Foto foto = new Foto();
        foto.setEstado(EdicaoFotoEstadoInicial.getInstance());
        foto.setEstado(EdicaoFotoBrilho.getInstance());
        foto.setEstado(EdicaoFotoContraste.getInstance());
        foto.setEstado((EdicaoFotoEfeito.getInstance()));
        foto.restauraEstado(2);
        assertEquals(EdicaoFotoContraste.getInstance(), foto.getEstado());
    }

}
