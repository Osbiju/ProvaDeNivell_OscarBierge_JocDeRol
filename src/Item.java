public class Item {

    //atributs
    private String nomItem;
    private String tipoItem;
    private double precioItem;
    private double porcentajeDesgasteItem;

    //constructor
    public Item(String nomItem, String tipoItem, double precioItem) {
        this.nomItem = nomItem;
        this.tipoItem = tipoItem;
        this.precioItem = precioItem;

    }


    public String getNomItem() {
        return this.nomItem;
    }

    public String getTipoItem() {
        return this.tipoItem;
    }

    public double getPrecioItem() {
        return this.precioItem;
    }

    public double getPorcentajeDesgasteItem() {
        return this.porcentajeDesgasteItem;
    }



    public void setNomItem(String nomItem) {
        this.nomItem = nomItem;
    }

    public void setTipoItem(String tipoItem) {
        this.tipoItem = tipoItem;
    }

    public void setPrecioItem(double precioItem) {
        this.precioItem = precioItem;
    }

    public void setPorcentajeDesgasteItem(double porcentajeDesgasteItem) {
        this.porcentajeDesgasteItem = porcentajeDesgasteItem;
    }


    //mostrar info
    public String toString(){
        return "Nombre : " + this.nomItem
                + "\nTipo: " + this.tipoItem
                + "\nPrecio: " + this.precioItem + " Pesetas"
                + "\nDesgaste: " + this.porcentajeDesgasteItem + " %";
    }

}



