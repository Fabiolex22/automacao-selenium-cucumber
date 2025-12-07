package utils;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setup() {
        System.out.println("Iniciando driver...");
        DriverFactory.getDriver(); // garante que o driver inicia no começo do teste
    }

    @After
    public void tearDown() {
        System.out.println("Finalizando driver...");
        DriverFactory.killDriver(); // fecha o navegador de verdade
    }
}
