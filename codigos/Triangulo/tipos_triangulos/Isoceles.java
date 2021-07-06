package atividadesdocurso.calculo_formas_geometricas.tipos_triangulos;

import atividadesdocurso.calculo_formas_geometricas.Triangulo;

public class Isoceles extends Triangulo {

     private double h;

     public Isoceles(double a, double base, double altura) {
          super(a, base);
          super.setC(a);
          this.h = altura;
     }

     public double getH() {
          return h;
     }

     public final void setH(double h) {
          this.h = h;
     }

     public Isoceles() {
          super(0, 0, 0);
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
          String valorNulo;
          if (this.getH() == 0 || this.getH() == Double.NaN) {
               valorNulo = "A propriedade que você procura é a altura \nNão se preocupe, eu achei para você: \nAltura: " + this.calculoDePitagorasGetAltura();
          } else if (this.getBase() == 0 || this.getBase() == Double.NaN) {
               if (this.getH() == this.getA()) {
                    throw new RuntimeException("\nO calculo não pode ser efetuado pois a medida da altura nunca poderá ter a mesma medida do lado.");
               } else if (this.getH() < this.getA()) {
                    throw new RuntimeException("\nO calculo não pode ser efetuado pois a medida da altura ou do lado não são compatíveis.");
               } else {
                    valorNulo = "A propriedade que você procura é a base \nNão se preocupe, eu achei para você: \nBase: " + this.calculoDePitagorasGetBase();
               }
          } else if (this.getA() == 0 || this.getA() == Double.NaN) {
               valorNulo = "A propriedade que você procura é o lado \nNão se preocupe, eu achei para você: \nAltura: " + this.calculoDePitagorasGetC();
          } else {
               valorNulo = "Todas as informações estão de acordo.";
          }
          return valorNulo;
     }

     // Calculos + validação
     @Override
     public double getArea() {
          double area;
          if (this.getH() == 0 || this.getH() == Double.NaN
                    || this.getBase() == 0 || this.getBase() == Double.NaN) {
               area = (this.getBase() * this.calculoDePitagorasGetAltura()) / 2;
          } else {
               area = (this.getBase() * this.getH()) / 2;
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
          this.setH(Math.sqrt(Math.pow(this.getA(), 2) - Math.pow((this.getBase() / 2), 2)));
          return this.getH();
     }

     protected double calculoDePitagorasGetBase() {
          this.setBase(Math.sqrt(Math.pow(this.getH(), 2) - Math.pow(this.getA(), 2)));
          return this.getBase();
     }

     protected double calculoDePitagorasGetC() {
          this.setA(Math.sqrt(Math.pow(this.getH(), 2) - Math.pow((this.getBase() / 2), 2)));
          return this.getC();
     }
}
