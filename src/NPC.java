
import java.util.ArrayList;

public abstract class NPC {

    ArrayList<Item> inventario;
    private String ciudadNpc;


    //constructor
    public NPC(String ciudadNpc){
        this.ciudadNpc = ciudadNpc;
        this.inventario = new ArrayList<>();
    }


    abstract double aplicarImpuesto(double precio);

    public void agregarItem(Item item) { //ARREGLAR
        inventario.add(item);
    }

    public Item venderItem(Item item) {
        inventario.remove(item);
        return item;
    }



    //metodes propis
    void mostrarInventario() {
        System.out.println("Ciudad: " + this.ciudadNpc);
        System.out.println("Inventario:\n");
        for(Item item : inventario) {
            item.toString();
        }
    }
}
