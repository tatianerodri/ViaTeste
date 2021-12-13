package steps;

import Elementos.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Carrinho;
import metodos.HomePage;
import metodos.Metodos;
import metodos.Produto;

public class ValidarCarrinho {
	Metodos metodo = new Metodos();
	Elementos el = new Elementos();
	HomePage home = new HomePage();
	Produto produto = new Produto();
	Carrinho carrinho = new Carrinho();

	@Given("que eu esteja no site {string}")
	public void que_eu_esteja_no_site(String site) {
		metodo.abrirNavegador(site);
	}

	@Given("escolher produto")
	public void escolher_produto() {
		home.produto(el.getIngridRunningjacket());
	}

	@Given("adicionar no carrinho")
	public void adicionar_no_carrinho() throws InterruptedException {
		produto.incluirProdutoCarrinho(el.getTamanhoSize());
		produto.incluirProdutoCarrinho(el.getCorOrange());
		produto.incluirProdutoCarrinho(el.getComprar());
		Thread.sleep(3000);
	}

	@When("adicionar mais  produto no carrinho")
	public void adicionar_mais_produto_no_carrinho() throws InterruptedException {
		produto.incluirProdutoCarrinho(el.getComprar());
		Thread.sleep(3000);
	}

	@Then("valido produtos no carrinho")
	public void valido_produtos_no_carrinho() {
		carrinho.verCarrinho(el.getVerProdutoNoCarrinho());
		produto.validarCarrinho(el.getValidarProdutoCarrinho(), "Total no carrinho");
		metodo.screenShot("produto carrinho");

	}

}
