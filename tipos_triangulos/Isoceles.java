package atividadesdocurso.calculo_formas_geometricas.tipos_triangulos;

import atividadesdocurso.calculo_formas_geometricas.Triangulo;

public class Isoceles extends Triangulo {

     private double h;

     public Isoceles(double a, double base, double h) {
          super(a, base);
          super.setC(a);
          this.setH(h);
     }

     public double getH() {
          return h;
     }

     public final void setH(double h) {
          this.h = h;
     }

     public Isoceles() {
          super(0, 0, 0, null);
     }

     @Override
     public String toString() {
          String valores = "Informações do Triângulo"
                    + "\n----------------------------------------------\n"
                    + this.validarTriangulo()
                    + "\n"
                    + this.verificaValorNulo()
                    + "\nPerímetro: " + this.getPerimetro()
                    + "\nÁrea: " + this.getArea()
                    + "\n----------------------------------------------\n";

          return valores;
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
     public boolean propriedadesDoTiangulo() {
          return (this.getA() + this.getA()) > this.getBase();
     }

     @Override
     public String verificaValorNulo() {
          String valorNulo = null;
          if (this.getH() == 0 || this.getH() == Double.NaN) {
               valorNulo = "A propriedade que você procura é altura \nEu achei para você: ";
          } else if (this.getBase() == 0 || this.getBase() == Double.NaN) {
               valorNulo = "A propriedade que você procura é a base \nEu achei para você: ";
          } else if (this.getC() == 0 || this.getC() == Double.NaN) {
               valorNulo = "A propriedade que você procura é o lado \nEu achei para você: ";
               if (this.getA() == 0 || this.getA() == Double.NaN) {
                    valorNulo = "A propriedade que você procura é o lado \nEu achei para você: ";
               }
          }
          return valorNulo;
     }

     // Calculos + validação
     @Override
     public double getArea() {
          double area = 0;
          if (this.getH() == 0 || this.getH() == Double.NaN) {
               area = (this.getBase() * this.calculoDePitagorasGetAltura()) / 2;
          } else if (this.getBase() == 0 || this.getBase() == Double.NaN) {
               area = (this.getBase() * this.calculoDePitagorasGetBase()) / 2;
          } else if (this.getC() == 0 || this.getC() == Double.NaN) {
               area = (this.getBase() * this.calculoDePitagorasGetC()) / 2;
               if (this.getA() == 0 || this.getA() == Double.NaN) {
                    area = (this.getBase() * this.calculoDePitagorasGetA()) / 2;
               }
          }
          return area;
     }

     // Cálculo
     @Override
     public double getPerimetro() {
          double perimetro = 2 * this.getA() + this.getBase();
          return perimetro;
     }

     protected double calculoDePitagorasGetAltura() {
          this.setH(Math.sqrt(Math.pow(this.getC(), 2) - Math.pow((this.getBase() / 2), 2)));
          return this.getH();
     }

     protected double calculoDePitagorasGetBase() {
          this.setBase(Math.sqrt(Math.pow(this.getH(), 2) - Math.pow(this.getC(), 2)));
          return this.getBase();
     }

     protected double calculoDePitagorasGetC() {
          this.setC(Math.sqrt(Math.pow(this.getC(), 2) - Math.pow((this.getBase() / 2), 2)));
          return this.getC();
     }

     protected double calculoDePitagorasGetA() {
          this.setA(Math.sqrt(Math.pow(this.getA(), 2) - Math.pow((this.getBase() / 2), 2)));
          return this.getA();
     }
}
