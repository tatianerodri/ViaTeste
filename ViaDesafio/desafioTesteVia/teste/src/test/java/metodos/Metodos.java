package metodos;

import static org.junit.Assert.assertEquals;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;



public class Metodos extends Browser {
			
	/**
	 * Metodo submit
	 * 
	 * @author Tatiane Rodrigues
	 * @param elemento
	 */
	public void submit(By elemento) {
		try {
			driver.findElement(elemento).submit();
		} catch (Exception e) {
			System.err.println("----------erro enter--------------" + e.getMessage());
			System.err.println("----------causa--------" + e.getCause());
		}
	}

	/**
	 * Metodo para clicar
	 * 
	 * @author Tatiane Rodrigues
	 * @param elemento
	 */
	public void clicar(By elemento) {
		try {
			driver.findElement(elemento).click();
		} catch (Exception e) {
			System.err.println("----------erro ao clicar--------------" + e.getMessage());
			System.err.println("----------causa--------" + e.getCause());
		}
	}

	/**
	 * Metodo para preencher texto
	 * 
	 * @author Tatiane Rodrigues
	 * @param texto
	 * @param elemento
	 */
	public void preencher(String texto, By elemento) {
		try {
			driver.findElement(elemento).sendKeys(texto);
		} catch (Exception e) {
			System.err.println("----------erro ao preencher--------------" + e.getMessage());
			System.err.println("----------causa--------" + e.getCause());
		}
	}

	/**
	 * Metodo para fechar
	 * 
	 * @author Tatiane Rodrigues
	 */

	public void fechar() {
		try {
			driver.quit();
		} catch (Exception e) {
			System.err.println("----------erro ao fechar--------------" + e.getMessage());
			System.err.println("----------causa--------" + e.getCause());
		}
	}

	/**
	 * 
	 * @author Tatiane Rodrigues
	 * @param tempo
	 * @throws InterruptedException
	 */
	public void pausar(int tempo) throws InterruptedException {
		try {
			Thread.sleep(tempo);
		} catch (Exception e) {
			System.err.println("----------erro ao pausar--------------" + e.getMessage());
			System.err.println("----------causa--------" + e.getCause());
		}
	}

	/**
	 * Metodo para validar
	 *
	 * @author Tatiane Rodrigues
	 * @param texto
	 * @param elemento
	 */
	public void validarTexto(By elemento, String texto) {
		try {
			String textoCapturado = driver.findElement(elemento).getText();
			assertEquals(texto, textoCapturado);
		} catch (Exception e) {
			System.err.println("----------erro ao validar --------------" + e.getMessage());
			System.err.println("----------causa--------" + e.getCause());
		}
	}
	/**
	 * Metodo para tirar screenshot da tela
	 * 
	 * @author escrever o seu nome aqui
	 * @param nome
	 */
	public void screenShot(String nome) {
		try {
			TakesScreenshot scrShot = ((TakesScreenshot)driver);
			File scrFile = scrShot.getScreenshotAs(OutputType.FILE);
			File destFile = new File("./Evidencias/" + nome + ".png");
			FileUtils.copyFile(scrFile, destFile);
		} catch (Exception e) {
			System.out.println("----- error no screenShot -----"  + e.getMessage());
		}

	}

	
}


