package atividadesdocurso.calculo_formas_geometricas.tipos_triangulos;

import atividadesdocurso.calculo_formas_geometricas.Triangulo;

public class Escaleno extends Triangulo {

     private double h;
     private double medianaLadoDireito;
     private double medianaLadoEsquerdo;
     private double bissetriz;

     public Escaleno(double a, double b, double c, double altura, double medianaLadoDireito, double medianaLadoEsquerdo, double bissetriz) {
          super(a, b, c);
          this.h = altura;
          this.medianaLadoDireito = medianaLadoDireito;
          this.medianaLadoEsquerdo = medianaLadoEsquerdo;
          this.bissetriz = bissetriz;
     }

     public double getH() {
          return h;
     }

     public void setH(double h) {
          this.h = h;
     }

     public double getMedianaLadoDireito() {
          return medianaLadoDireito;
     }

     public void setMedianaLadoDireito(double medianaLadoDireito) {
          this.medianaLadoDireito = medianaLadoDireito;
     }

     public double getMedianaLadoEsquerdo() {
          return medianaLadoEsquerdo;
     }

     public void setMedianaLadoEsquerdo(double medianaLadoEsquerdo) {
          this.medianaLadoEsquerdo = medianaLadoEsquerdo;
     }

     public double getBissetriz() {
          return bissetriz;
     }

     public void setBissetriz(double bissetriz) {
          this.bissetriz = bissetriz;
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
     public double getArea() { // calculo e análise
          double area;
          if (this.getH() == 0 || this.getH() == Double.NaN
                    || this.getMedianaLadoDireito() == 0 || this.getMedianaLadoDireito() == Double.NaN
                    || this.getMedianaLadoEsquerdo() == 0 || this.getMedianaLadoEsquerdo() == Double.NaN
                    || this.getBissetriz() == 0 || this.getBissetriz() == Double.NaN) {
               area = (Math.pow(this.getBase(), 2) * Math.pow(this.calculoGetAltura(), 2)) / 4;
          } else if (this.getBase() == 0 || this.getBase() == Double.NaN) {
               area = (Math.pow(this.calculoGetBase(), 2) * Math.pow(this.getH(), 2)) / 4;
          } else if (this.getBase() == 0 || this.getBase() == Double.NaN || this.getH() == 0 || this.getH() == Double.NaN) {
               area = (Math.pow(this.calculoGetBase(), 2) * Math.pow(this.calculoGetAltura(), 2)) / 4;
          } else {
               area = (Math.pow(this.getBase(), 2) * Math.pow(this.getH(), 2)) / 4;
          }
          System.out.println(area);
          return Math.sqrt(area);
     }

     @Override
     public double getPerimetro() {
          return this.getA() + this.getBase() + this.getC();
     }

     @Override
     public boolean propriedadesDoTiangulo() {
          return this.getA() != this.getBase() && this.getC() != this.getA() && this.getC() != this.getBase();
     }

     @Override
     public String validarTriangulo() {
          String tipo;
          if (this.propriedadesDoTiangulo()) {
               tipo = "É um triangulo Escaleno.";
          } else {
               throw new RuntimeException("O valores atribuidos, não pertencem a um triangulo Escaleno.");
          }
          return tipo;
     }

     @Override
     public String verificaValorNulo() {
          String valorNulo;
          if (this.getH() == 0 || this.getH() == Double.NaN) {
               valorNulo = "\nA propriedade que você procura é a altura \nNão se preocupe, eu achei para você: \nAltura: " + this.calculoGetAltura();
               if (this.getMedianaLadoDireito() == 0 || this.getMedianaLadoDireito() == Double.NaN
                         && this.getMedianaLadoEsquerdo() == 0 || this.getMedianaLadoEsquerdo() == Double.NaN
                         && this.getBissetriz() == 0 || this.getBissetriz() == Double.NaN) {
                    valorNulo = "\nA propriedade que você procura é uma das medianas, a bissetriz e altura\n"
                              + "Não se preocupe, eu achei para você: \nMediana do lado direito: " + this.calculoGetMedianaLadoDireito()
                              + "\nMediana do lado esquerdo: " + this.calculoGetMedianaLadoEsquerdo()
                              + "\nBissetriz: " + this.calculoGetBissetriz()
                              + "\nAltura: " + this.calculoGetAltura();
               }
               if (this.getMedianaLadoDireito() == 0 || this.getMedianaLadoDireito() == Double.NaN
                         && this.getMedianaLadoEsquerdo() == 0 || this.getMedianaLadoEsquerdo() == Double.NaN
                         && this.getBissetriz() == 0 || this.getBissetriz() == Double.NaN) {
                    valorNulo = "\nA propriedade que você procura é uma das medianas, a bissetriz e altura\n"
                              + "Não se preocupe, eu achei para você: \nMediana do lado direito: " + this.calculoGetMedianaLadoDireito()
                              + "\nMediana do lado esquerdo: " + this.calculoGetMedianaLadoEsquerdo()
                              + "\nBissetriz: " + this.calculoGetBissetriz();
               }
               if (this.getBissetriz() == 0 || this.getBissetriz() == Double.NaN) {
                    valorNulo = "\nA propriedade que você procura é a bissetriz\n"
                              + "Não se preocupe, eu achei para você: \nBissetriz: " + this.calculoGetBissetriz();
               }
          } else if (this.getBase() == 0 || this.getBase() == Double.NaN) {
               valorNulo = "\nA propriedade que você procura é a base \nNão se preocupe, eu achei para você: \nBase: " + this.calculoGetBase();
          } else if (this.getA() == 0 || this.getA() == Double.NaN) {
               valorNulo = "\nA propriedade que você procura é o lado A \nNão se preocupe, eu achei para você: \nLado A: " + this.calculoGetA();
          } else if (this.getC() == 0 || this.getC() == Double.NaN) {
               valorNulo = "\nA propriedade que você procura é o lado C \nNão se preocupe, eu achei para você: \nLado C: " + this.calculoGetC();
          } else if (this.getMedianaLadoDireito() == 0 || this.getMedianaLadoDireito() == Double.NaN
                    || this.getMedianaLadoEsquerdo() == 0 || this.getMedianaLadoEsquerdo() == Double.NaN) {
               valorNulo = "\nA propriedade que você procura é uma das medianas\n"
                         + "Não se preocupe, eu achei para você: \nMediana do lado direito: " + this.calculoGetMedianaLadoDireito()
                         + "\nMediana do lado esquerdo: " + this.calculoGetMedianaLadoEsquerdo();
          } else if (this.getBissetriz() == 0 || this.getBissetriz() == Double.NaN) {
               valorNulo = "\nA propriedade que você procura é a bissetriz\n"
                         + "Não se preocupe, eu achei para você: \nBissetriz: " + this.calculoGetBissetriz();
          } else {
               valorNulo = "\nTodas as informações estão de acordo.";
          }
          return valorNulo;
     }

     // Cálculo
     protected double calculoGetAltura() {
          double p = (this.getA() + this.getBase() + this.getC()) / 2;
          this.setH(2 * ((Math.sqrt(p
                    * ((p - this.getA())
                    * (p - this.getBase())
                    * (p - this.getC()))
          )) / this.getBase()));
          return this.getH();
     }

     protected double calculoGetMedianaLadoDireito() { // m
          this.setMedianaLadoDireito(Math.sqrt(Math.pow(this.getH(), 2) + Math.pow(this.getA(), 2)));
          return this.getMedianaLadoDireito();
     }

     protected double calculoGetMedianaLadoEsquerdo() { // n
          this.setMedianaLadoEsquerdo(Math.sqrt(Math.pow(this.getH(), 2) + Math.pow(this.getC(), 2)));
          return this.getMedianaLadoEsquerdo();
     }

     protected double calculoGetBissetriz() {
          this.setBissetriz(2 * ((Math.sqrt(this.getBase() * this.getA() * this.getPerimetro() * (this.getPerimetro() - this.getC())))
                    / this.getBase() + this.getA()));
          return this.getBissetriz();
     }

     protected double calculoDePitagorasGetA() {
          this.setA(Math.sqrt(Math.pow(this.getH(), 2) + Math.pow((this.getMedianaLadoDireito()), 2)));
          return this.getA();
     }

     protected double calculoDePitagorasGetC() {
          this.setC(Math.sqrt(Math.pow(this.getH(), 2) + Math.pow((this.getMedianaLadoEsquerdo()), 2)));
          return this.getC();
     }

     protected double calculoGetBase() {
          this.setBase(Math.sqrt((Math.pow(this.getA(), 2)) + (Math.pow(this.getC(), 2))));
          return this.getBase();
     }

     protected double calculoGetA() {
          this.setA(Math.sqrt((Math.pow(this.getH(), 2)) + Math.pow(this.getMedianaLadoEsquerdo(), 2)));
          return this.getA();
     }

     protected double calculoGetC() {
          this.setC(Math.sqrt((Math.pow(this.getH(), 2)) + Math.pow(this.getMedianaLadoDireito(), 2)));
          return this.getC();
     }

}
