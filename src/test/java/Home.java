import org.openqa.selenium.By;

public class Home {
    //Preciso criar a classe para cada página
    //tudo o que eu for testar eu preciso criar o campo aqui.
    //No caso se eu for fazer uma busca(terei que por o campo de pesquisa)
    //E para pesquisar terei que usar o botão de pesquisa

    //Utilizaremos Selenium

    // Campo pesquisa
    By campoPesquisa = By.xpath("//input[contains(@placeholder, 'Pesquisar produtos...')]");

    // Botão pesquisa
    By botaoPesquisa = By.xpath("//i[@class='la la-search' and @aria-hidden='true']");

    // Inserir nome de produto que será pesquisado
    public void inserirProdutoCampoPesquisa(){

    }


    // Clicar no botão de pesquisa
    public void clicarBotaoPesquisar(){}
}
