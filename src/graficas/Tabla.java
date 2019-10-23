package graficas;

/**
 *
 * @author Esteven Javier Mc
 */
public class Tabla {

    private int cantNom = 0;
    private final String[][] tabla = new String[9999][2];
    
    public int getCantNom() {
        return this.cantNom;
    }
    
    public String[][] getTabla() {
        return this.tabla;
    }

    public void push(String nom) {
        for (int i = 0; i < this.cantNom; i++) {
            if (tabla[i][0].equalsIgnoreCase(nom)) {
                this.tabla[i][1] = Integer.toString(Integer.parseInt(this.tabla[i][1]) + 1);
                return;
            }
        }
        this.tabla[this.cantNom][0] = nom;
        this.tabla[this.cantNom][1] = Integer.toString(1);
        this.cantNom++;
    }

    public void imprimir() {
        for (int i = 0; i < this.cantNom; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(this.tabla[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
