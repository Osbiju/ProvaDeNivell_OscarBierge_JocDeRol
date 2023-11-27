public class Mercader extends NPC{

    //constructor
    public Mercader(String ciudad){
        super(ciudad);

    }

    //mercader no tiene desgaste, trata bien las cosas.
    //metodes generals
    public double aplicarImpuesto(double precioItem){
        return precioItem * 0.04;
    }
    public void agregarItem(Item item) {
        super.agregarItem(item);
    }
    //metodes propis
}
