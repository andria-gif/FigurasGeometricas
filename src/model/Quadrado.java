package model;

import javax.swing.JOptionPane;

/**
 *
 * @author Ândria
 */
public class Quadrado extends FiguraGeometrica {
    
    public Quadrado () {

}
  
    public void Quadrado (){
     String var = Quadrado.JOtionPane.showInputDialog("Mostre o valor lado do   Quadrado ===>  ");
     double lado = Double.valueOf(var);
     double perimetro = 4* lado;
    JOptionPane.showInputDialog(null,"O valor do perimetro é ===> " + perimetro);
               
    
    }

    /**
     *
     */
    @Override
    public void Area (){
       String var = JOtionPane.showInputDialog("Mostre a area ====>    ");
        double raio = Double.valueOf(var);
    
    
    }

    /**
     *
     */
    @Override
    public void Perimetro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static class JOtionPane {

        private static String showInputDialog(String mostre_o_valor_do_R_do_Cícurlo___) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public JOtionPane() {
        }
    }
}
