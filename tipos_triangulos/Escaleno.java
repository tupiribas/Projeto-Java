package atividadesdocurso.calculo_formas_geometricas.tipos_triangulos;

import atividadesdocurso.calculo_formas_geometricas.Triangulo;

public class Escaleno extends Triangulo {

     public Escaleno(double a, double b, double c, String cor) {
          super(a, b, c, cor);
     }

     @Override
     public String toString() {
          String valores = "Informações do Triângulo"
                    + "\n----------------------------------------------\n"
                    + this.validarTriangulo()
                    + this.verificaValorNulo()
                    + "Perímetro: "
                    + "Área: " + getArea()
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
     public boolean propriedadesDoTiangulo() {
          throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     }

     @Override
     public String validarTriangulo() {
          String tipo;
          if (this.propriedadesDoTiangulo()) {
               tipo = "É um triangulo isóceles.";
          } else {
               throw new RuntimeException("O valores atribuidos, não pertencem a um triangulo isóceles.");
          }
          return tipo;
     }

     @Override
     public String verificaValorNulo() {
          throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     }

}
