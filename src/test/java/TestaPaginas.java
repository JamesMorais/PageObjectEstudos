import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TestaPaginas {
    private WebDriver driver;

    private static final String baseUrl = "https://automacao.testerglobal.com/";
    @Test
    @DisplayName("Quando clicar no botão pesquisar sem inserir nada então devo ver todos os produtos")
    public void pesquisarCampoVazio(){
        //Entrar na Pagina de testes

        // Não inseriu nada no campo pesquisa

        //Cliquei no botão pesquisar


    }
    //O setup são coisas que eu preciso para preparar os meus testes
    //é a base, então vem antes
    // E eu tenho que usar uma anotação
    @BeforeAll
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10));
    }

    //Coisas que eu preciso fazer depois que eu executo os meus testes
    //Precisa por uma anotação também
    @AfterAll
    public void tearDown(){
        driver.close();
    }

}
