import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.adapter.*;

class VeiculoTest {

    @Test
    void deveRetornarVelocidadeKm() {
        Veiculo veiculo = new Veiculo();
        veiculo.setVelocidade(72.0f);

        assertEquals(72.0f, veiculo.getVelocidade());
    }

    @Test
    void deveRetornarVelocidadeMs() {
        Veiculo veiculo = new Veiculo();
        veiculo.setVelocidade(72.0f);

        assertEquals(20.0f, veiculo.getVelocidadeMs());
    }

}