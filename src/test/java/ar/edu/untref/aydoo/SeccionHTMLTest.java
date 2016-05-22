package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class SeccionHTMLTest {

	@Test
	public void queSeColoquenCorrectamenteVariosComponentesSimplesAUnaSeccion(){

		TituloHTML tituloHTML = new TituloHTML("Analisis y Diseno Orientado a Objetos");
		SubtituloHTML subtituloHTML = new SubtituloHTML("Trabajo Practico Numero 1");
		ImagenHTML imagenHTML = new ImagenHTML("Imagen.png");
		SeccionHTML seccionHTML = new SeccionHTML();

		seccionHTML.agregarLinea(tituloHTML);
		seccionHTML.agregarLinea(subtituloHTML);
		seccionHTML.agregarLinea(imagenHTML);
		String contenidoDeLaSeccionHTML = seccionHTML.getContenido();

		Assert.assertEquals(("<section>\n" +
                             " <h1>Analisis y Diseno Orientado a Objetos</h1>\n" +
                             " <h2>Trabajo Practico Numero 1</h2>\n" +
                             " <img src=\"Imagen.png\"/>\n" +
                             "</section>"), contenidoDeLaSeccionHTML);

	}
	
}