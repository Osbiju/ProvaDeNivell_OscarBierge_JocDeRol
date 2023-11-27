public class Ladron extends NPC{

    public Ladron(String ciudad){
        super(ciudad);
    }

    //ladron no aplica impuestos, pero al ser metodo asbtracto de NPC, me obliga a aplicarlo
    @Override
    double aplicarImpuesto(double precioItem) {
        return precioItem;
    }


    //metodes generals

    public void agregarItem(Item item) {
        item.setPorcentajeDesgasteItem(item.getPorcentajeDesgasteItem() + 0.25);
        super.agregarItem(item);
    }

    //metodes propis
}

