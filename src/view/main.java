package view;
import model.Circulo;
import model.Quadrado;
import model.Retangulo;
      

/**
 *
 * @author Ândria
 */
public class main {
    public void main(String[] args){
    Retangulo r = new Retangulo();
    Circulo c = new Circulo ();
    Quadrado q = new Quadrado();
    
    r.Area();
    r.Perimetro();
    
    c.Area();
    c.Perimetro();
    
    q.Area();
    q.Perimetro();
   
    
    
    }
}
