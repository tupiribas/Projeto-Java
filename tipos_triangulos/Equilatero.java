package atividadesdocurso.calculo_formas_geometricas.tipos_triangulos;

import atividadesdocurso.calculo_formas_geometricas.Triangulo;

public class Equilatero extends Triangulo {

     private double h;

     public Equilatero(double a, double h) {
          super(a);
          this.setH(h);
     }

     public double getH() {
          return h;
     }

     public final void setH(double h) {
          this.h = h;
     }

     @Override
     public String toString() {
          String valores = "Informações do Triângulo"
                    + "\n----------------------------------------------\n"
                    + "É um equilátero"
                    + "\nPerímetro: " + this.getPerimetro()
                    + "\nÁrea: " + this.getArea()
                    + "\n----------------------------------------------\n";
          return valores;
     }

     @Override
     public double getArea() {
          throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     }

     @Override
     public double getPerimetro() {
          throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     }

     @Override
     public String verificaValorNulo() {
          throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     }

     @Override
     public boolean propriedadesDoTiangulo() {
          throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     }

     @Override
     public String validarTriangulo() {
          throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     }

}
