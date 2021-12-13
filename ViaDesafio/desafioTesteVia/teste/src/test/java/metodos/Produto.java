package metodos;

import org.openqa.selenium.By;

import Elementos.Elementos;

public class Produto {

	Metodos metodo = new Metodos();
	Elementos el = new Elementos();

	public void incluirProdutoCarrinho(By elemento) {
		metodo.clicar(elemento);

	}

	public void validarCarrinho(By elemento, String texto) {
		metodo.validarTexto(elemento, texto);
	}

}
