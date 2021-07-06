package atividadesdocurso.calculo_formas_geometricas;

public class Retangulo extends Figura {

     private double lado1;
     private double lado2;

     public Retangulo(double lado1, double lado2, String cor) {
          this.lado1 = lado1;
          this.lado2 = lado2;
          super.setCor(cor);
     }

     public double getLado1() {
          return lado1;
     }

     public void setLado1(double lado1) {
          this.lado1 = lado1;
     }

     public double getLado2() {
          return lado2;
     }

     public void setLado2(double lado2) {
          this.lado2 = lado2;
     }

     @Override
     public String toString() {
          String valores = "Informações do Retângulo"
                    + "\n----------------------------------------------\n"
                    + "Área: " + this.area()
                    + "\nCor: " + this.getCor()
                    + "\n----------------------------------------------\n";

          return valores;
     }
     
     public double area() {
          double area = this.getLado1() * this.getLado2();
          return area;
     }
}
