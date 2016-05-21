package ar.edu.untref.aydoo.Programa.Elementos;

public class Titulo extends Elemento {

    public Titulo(String titulo) {
        super(titulo);
    }

    @Override
    public LineaHTML getTransformado() {

        TituloHTML tituloHTML = new TituloHTML(this.getContenido());
        return tituloHTML;

    }

}