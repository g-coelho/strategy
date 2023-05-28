import org.example.Operador;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OperadorTest {
    @Test
    public void deveConverterDecimalBinario(){
        Operador operador = new Operador();
        operador.converterBinario(10);
        assertEquals(1010, operador.getValor());
    }

    @Test
    public void deveConverterDecimalOctal(){
        Operador operador = new Operador();
        operador.converterHexadecimal(10);
        assertEquals(12, operador.getValor());
    }

    @Test
    public void deveConverterDecimalTernario(){
        Operador operador = new Operador();
        operador.converterTernario(10);
        assertEquals(101, operador.getValor());
    }

    @Test
    public void deveConverterDecimalQuaternario(){
        Operador operador = new Operador();
        operador.converterQuaternario(10);
        assertEquals(22, operador.getValor());
    }


}
