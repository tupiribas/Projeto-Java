package atividadesdocurso.calculo_formas_geometricas.tipos_triangulos;

import atividadesdocurso.calculo_formas_geometricas.Triangulo;

public class Equilatero extends Triangulo {

     private double h;

     public Equilatero(double a, double altura) {
          super(a);
          this.h = altura;
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
                    + this.validarTriangulo()
                    + this.verificaValorNulo()
                    + "\nPerímetro: " + this.getPerimetro()
                    + "\nÁrea: " + this.getArea()
                    + "\n----------------------------------------------\n";
          return valores;
     }

     @Override
     public double getArea() {
          double area;
          if (this.getH() == 0 || this.getH() == Double.NaN) {
               area = (Math.pow(this.getA(), 2) * this.calculoDePitagorasGetAltura()) / 4;
          } else {
               area = (Math.pow(this.getA(), 2) * Math.sqrt(3)) / 4;
          }
          return area;
     }

     @Override
     public double getPerimetro() {
          return this.getA() * 3;
     }

     @Override
     public String verificaValorNulo() {
          String valorNulo;
          if (this.getH() == 0 || this.getH() == Double.NaN) {
               valorNulo = "\nA propriedade que você procura é a altura \nNão se preocupe, eu achei para você: \nAltura: " + this.calculoDePitagorasGetAltura();
          } else {
               valorNulo = "\nTodas as informações estão de acordo.";
          }
          return valorNulo;
     }

     @Override
     public boolean propriedadesDoTiangulo() {
          return this.getA() == this.getA();
     }

     @Override
     public String validarTriangulo() {
          String tipo;
          if (this.propriedadesDoTiangulo()) {
               tipo = "É um triangulo Equilátero.";
          } else {
               throw new RuntimeException("O valores atribuidos, não pertencem a um triangulo isóceles.");
          }
          return tipo;
     }

     protected double calculoDePitagorasGetAltura() {
          this.setH((Math.sqrt(3) * this.getA()) / 2);
          return this.getH();
     }

}
