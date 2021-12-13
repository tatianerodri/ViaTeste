package metodos;

import org.openqa.selenium.By;

public class Carrinho {
	Metodos metodo = new Metodos();

	public void verCarrinho(By elemento) {
		metodo.clicar(elemento);
	}
}
