package atividadesdocurso.calculo_formas_geometricas;

public abstract class Triangulo extends Figura {

     private double a;
     private double base;
     private double c;

     public Triangulo(double a, double b, double c) {
          this.a = a;
          this.base = b;
          this.c = c;
     }

     public Triangulo(double a, double base) {
          this.a = a;
          this.base = base;
     }

     public Triangulo(double a) {
          this.a = a;
     }

     public double getA() {
          return a;
     }

     public void setA(double a) {
          this.a = a;
     }

     public double getBase() {
          return base;
     }

     public void setBase(double b) {
          this.base = b;
     }

     public double getC() {
          return c;
     }

     public void setC(double c) {
          this.c = c;
     }

     public abstract String verificaValorNulo();
     
     public abstract String validarTriangulo();

     public abstract boolean propriedadesDoTiangulo();

     public abstract double getArea();

     public abstract double getPerimetro();
}
