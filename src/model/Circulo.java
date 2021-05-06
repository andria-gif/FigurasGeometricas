package model;

/**
 *
 * @author Ândria
 */
public class Circulo  extends FiguraGeometrica{

   public Circulo(){
   
   
   }
   
   
   @Override
   public  void Perimetro(){
        
       String var = JOtionPane.showInputDialog("Mostre o valor do R do Cícurlo ===>  ");
             double raio = Double.valueOf(var);
             double perimetro =  2 * Math.PI * raio;
       String showInputDialog = javax.swing.JOptionPane.showInputDialog(null,"O valor do perimetro é ===> " + perimetro);
               
                     }
   
@Override 
   public void Area(){
      String var = JOtionPane.showInputDialog("Mostre a area ====>    ");
        double raio = Double.valueOf(var);
             //double perimetro =
             //JOptionPane.showInputDialog(null,"O valor do perimetro do circulo é ===> " +perimetro)=
               
   
   }
   
    private static class JOtionPane {

        private static String showInputDialog(String mostre_o_valor_do_R_do_Cícurlo) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public JOtionPane() {
        }
    }

    private static class JOptionPane {

        public JOptionPane() {
        }
    }
    
}
