/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figura;

import java.io.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Jimmy Milla
 */
public class Figura implements FiguraInterface {

    /**
     * Cuando una clase implementa una interfaz esta obliga a cumplir todos los
     * contratos de la interfaz
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String lista = "";

        double area = 0;
      // tipo de dato nombre_variable = palabra reservada(new) tipo de dato(alcance)

        // instancia de la clase figura
        Figura ofigura = new Figura();

        //  Instanciando la Clase Circulo
        lista = "LISTA DE AREAS DE FIGURAS GEOMETRICAS\n";

        Circulo ocirculo = new Circulo();

        ocirculo.set_Radio(Integer.parseInt(JOptionPane.showInputDialog("Para hallar el area de un circulo por favor ingrese un radio:  ")));

        area = ofigura.CalculoArea(ocirculo);

        lista = lista + " El area del circulo:  " + area + "\n";

// Instancias la Clase Triangulo
        Triangulo oTriangulo = new Triangulo((Integer.parseInt(JOptionPane.showInputDialog("Para hallar el area de un triangulo por favor ingrese una base:  "))), (Integer.parseInt(JOptionPane.showInputDialog("Ahora ingrese una altura:  "))));

        area = ofigura.CalculoArea(oTriangulo);

        lista = lista + " El area del triangulo:  " + area + "\n";

        // Instancias la Clase rectangulo
        Rectangulo oRectangulo = new Rectangulo((Integer.parseInt(JOptionPane.showInputDialog("Para hallar el area de un rectangulo por favor ingrese una base:  "))), (Integer.parseInt(JOptionPane.showInputDialog("Ingrese ingrese una altura:  "))));

        area = ofigura.CalculoArea(oRectangulo);

        lista = lista + " El area del rectangulo:  " + area + "\n";

        lista = lista + "************************\n";
        JOptionPane.showMessageDialog(null, lista);

    }

    // 
    public double CalculoArea(Object obj) {
        double area = 0;

        //System.out.println(obj.getClass().getSimpleName());
        switch (obj.getClass().getSimpleName()) {
            case "Circulo":
                // convierte el objeto obj recibido por parametro 
                // en la clase instaciada circulo.
                Circulo oCirculo = (Circulo) obj;

                area = Circulo.PI * Math.pow(oCirculo.get_Radio(), 2);

                break;

            case "Triangulo":

                Triangulo oTriangulo = (Triangulo) obj;

                area = oTriangulo.GetBa() * oTriangulo.GetAl() / 2;

                break;
            case "Rectangulo":

                Rectangulo oRectangulo = (Rectangulo) obj;

                area = oRectangulo.a() * oRectangulo.b();

                break;

            default:

                break;
        }

        return area;

    }

}
