package atividadesdocurso.calculo_formas_geometricas;

public class Quadrado extends Retangulo {
     
     public Quadrado(double lado1, double lado2, String cor) {
          super(lado1, lado2, cor);
     }
     
     @Override
     public String toString() {
          String valores = "Informações do Quadrado"
                    + "\n----------------------------------------------\n"
                    + "Área: " + area()
                    + "\nCor: " + getCor()
                    + "\n----------------------------------------------\n";
          return valores;
     }
}
