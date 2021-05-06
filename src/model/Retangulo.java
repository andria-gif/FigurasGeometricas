package model;

import javax.swing.JOptionPane;

/**
 *
 * @author Ândria
 */
public class Retangulo extends FiguraGeometrica{
    public  Retangulo(){
    
    }
  
        public void Retangulo (){
          String var = Retangulo.JOtionPane.showInputDialog("Mostre o valor lado do  Retangulo ===>  ");
          double base = Double.valueOf(var); 
          var = JOptionPane.showInputDialog("Mostre o valor da base do Retangulo ===>  ");
          double altura = Double.valueOf(var);
          double perimetro = 2 * (base + altura);
           JOptionPane.showInputDialog(null,"O valor do perimetro é ===> " + perimetro);
               
        }
         
    @Override
         public void Area (){
           String var = JOtionPane.showInputDialog("Mostre a area ====>    ");
           double base = Double.valueOf(var); 
           var = JOptionPane.showInputDialog("Mostre o valor da base do Retangulo ===>  ");
           double altura = Double.valueOf(var);
           double perimetro = 2 * (base + altura);
           JOptionPane.showInputDialog(null,"O valor do perimetro é ===> " + perimetro);
               
         
         }

    @Override
    public void Perimetro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
                
    private static class JOtionPane {

        private static String showInputDialog(String mostre_o_valor_lado_do___Quadrado___) {
            throw new UnsupportedOperationException("Not supported yet."); 
        }

        public JOtionPane() {
        }
    }
        
}
