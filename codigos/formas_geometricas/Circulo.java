package atividadesdocurso.calculo_formas_geometricas;

public class Circulo extends Figura {

     private double raio;

     public Circulo(double raio, String cor) {
          this.raio = raio;
          super.setCor(cor);
     }

     public double getRaio() {
          return raio;
     }

     public void setRaio(double raio) {
          this.raio = raio;
     }

     @Override
     public String toString() {
          String valores;
          valores = "Informações do Círculo"
                    + "\n----------------------------------------------\n"
                    + "Perímetro: " + this.getPerimetro() // Implementação
                    + "\nÁrea: " + this.area()
                    + "\nDiâmetro: " + this.getDiametro()
                    + "\nCor: " + this.getCor()
                    + "\n----------------------------------------------\n";
          return valores;
     }

     // Implementação 
     public double getPerimetro() {
          double perimetro = 2 * Math.PI * this.getRaio();
          return perimetro;
     }

     public double getDiametro() {
          double diametro = 2 * this.getRaio();
          return diametro;
     }

     public double area() {
          double area = Math.PI * this.getRaio();
          return area;
     }

}
