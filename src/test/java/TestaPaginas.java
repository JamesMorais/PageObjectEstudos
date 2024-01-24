import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TestaPaginas {
    private WebDriver driver;

    private static final String baseUrl = "https://automacao.testerglobal.com/";
    Home homePage;
    @Test
    @DisplayName("Quando pesquisa pesquisar produto por nome, então deve ser mostrada página do produto")
    public void pesquisaProdutoPorNome(){
        //Entrar no site de teste
        driver.get(baseUrl);
        //Instanciar o Page object
        homePage = new Home(driver);
        // Realizar a busca por um produto
        String nomeProduto = "Camera";
        homePage.inserirProdutoCampoPesquisa(nomeProduto);

        // Clicar no botao de busca
        homePage.clicarBotaoPesquisar();

        String tituloPaginaEsperada = "Camera \\u2013 Praticar Automa\\u00E7\\u00E3o CTG \\u2013 ESTUDOS";
        String tituloPaginaEncontrada = driver.getTitle();
        assertEquals(tituloPaginaEsperada, tituloPaginaEncontrada);
    }
    @Test
    @DisplayName("Quando clicar no botão pesquisar sem inserir nada então devo ver todos os produtos")
    public void pesquisarCampoVazio(){
        driver.get(baseUrl);
        homePage = new Home(driver);
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
        driver.quit();
    }

}
