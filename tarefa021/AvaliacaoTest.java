package alfa.br.com.gilmario.modelo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AvaliacaoTest {

    Avaliacao avaliacao = new Avaliacao();

    @Test
    public void testAprovado() {
        try {
            String resultado = avaliacao.avalia(8.0, 7.6, 10, 64);
            assertEquals("Aprovado.", resultado);
        } catch (ValoresInvalidosException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testReprovadoPorFalta() {
        try {
            String resultado = avaliacao.avalia(8.0, 7.6, 24, 64);
            assertEquals("Reprovado por Falta.", resultado);
        } catch (ValoresInvalidosException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testReprovadoPorMedia() {
        try {
            String resultado = avaliacao.avalia(2.2, 3.0, 8, 64);
            assertEquals("Reprovado por Média.", resultado);
        } catch (ValoresInvalidosException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testRecuperacao() {
        try {
            String resultado = avaliacao.avalia(4.0, 5.0, 8, 64);
            assertEquals("Prova Extra.", resultado);
        } catch (ValoresInvalidosException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testValorInvalido() {
        assertThrows(ValoresInvalidosException.class, () -> {
            avaliacao.avalia(8.0, -7.6, 10, 64);
        });
    }
}
