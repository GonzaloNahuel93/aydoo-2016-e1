package ar.edu.untref.aydoo;

public abstract class ElementoDeLinea extends Elemento {

    private String contenido;

    public ElementoDeLinea(String contenido) {
        this.contenido = contenido;
    }

    public String getContenido() {
        return contenido;
    }

}