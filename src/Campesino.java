
public class Campesino extends NPC{

    //atributs
    private String ciudad;
    private int numItems =0;
    private final int maxItems = 5;


    //constructor
    public Campesino(String ciudad){
        super(ciudad);
    }


    //metodes generals
    public double aplicarImpuesto(double precioItem){
        return precioItem + 2;
    }

    public void agregarItem(Item item) {
        if (numItems < maxItems) {
            item.setPorcentajeDesgasteItem(item.getPorcentajeDesgasteItem() + 0.15);
            super.agregarItem(item);
        } else {
            System.out.println("No se pueden agregar más ítems, inventario lleno");
        }

    }

    //metodes propis

}
