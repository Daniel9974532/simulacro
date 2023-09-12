import javax.swing.JOptionPane;
public class Segundo {

    public static int[] sumaArreglos(int[] arreglo1, int[] arreglo2, int[] arreglo3) {
        int longitud = arreglo1.length;
        int[] resultado = new int[longitud];
        
        for (int i = 0; i < longitud; i++) {
            resultado[i] = arreglo1[i] + arreglo2[i] + arreglo3[i];
        }

        return resultado;
    }
    public static void main(String[] args) {
    	
    	int a,b,c,d,e,f,g,h,j;
    	a=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
    	b=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));
    	c=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tercer numero"));
    	
    	d=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
    	e=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));
    	f=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tercer numero"));
    	
    	g=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
    	h=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));
    	j=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tercer numero"));
        int[] arreglo1 = {a, b, c};
        int[] arreglo2 = {d, e, f};
        int[] arreglo3 = {g, h, j};
       
        int[] resultado = sumaArreglos(arreglo1, arreglo2, arreglo3);
        
        System.out.print("Resultado: ");
        for (int i = 0; i < resultado.length; i++) {
            System.out.print(resultado[i] + " ");
        }
    }
	}