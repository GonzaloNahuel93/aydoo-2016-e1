package ar.edu.untref.aydoo;

public class ListaHTML extends BloqueHTML{
    
    public void agregarItem(ItemDeListaHTML item) {
        this.lineas.add(item);       
    }

    @Override
    public String getContenido() {
    	return "<ul>\n" + super.getContenido() + "</ul>";
    }

}