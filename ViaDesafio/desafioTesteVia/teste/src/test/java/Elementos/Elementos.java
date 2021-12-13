package Elementos;

import org.openqa.selenium.By;

public class Elementos {

	By ingridRunningjacket = By.xpath("//*[@href='http://lojaebac.ebaconline.art.br/product/ingrid-running-jacket/']");
	By tamanhoSize = By.xpath("//*[@class='variable-item button-variable-item button-variable-item-XS']");
	By corOrange = By.xpath("//*[@class='variable-item button-variable-item button-variable-item-Orange']");
	By comprar = By.xpath("//*[@class='single_add_to_cart_button button alt']");
	By verProdutoNoCarrinho = By.xpath("//*[@class='button wc-forward']");
	By validarProdutoCarrinho = By.xpath("//*[text()='Total no carrinho']");

	public By getIngridRunningjacket() {
		return ingridRunningjacket;
	}

	public By getTamanhoSize() {
		return tamanhoSize;
	}

	public By getCorOrange() {
		return corOrange;
	}

	public By getComprar() {
		return comprar;
	}

	public By getVerProdutoNoCarrinho() {
		return verProdutoNoCarrinho;
	}

	public By getValidarProdutoCarrinho() {
		return validarProdutoCarrinho;
	}
}
