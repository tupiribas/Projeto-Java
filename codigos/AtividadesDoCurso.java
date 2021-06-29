package atividadesdocurso;

import atividadesdocurso.calculo_formas_geometricas.tipos_triangulos.Equilatero;
import atividadesdocurso.calculo_formas_geometricas.tipos_triangulos.Isoceles;

public class AtividadesDoCurso {

     public static void main(String[] args) {
          try {
               Isoceles isoceles = new Isoceles(10, 12, 0);
               System.out.println(isoceles.toString());
          } catch (RuntimeException ex) {
               System.out.println(ex.getMessage());
          }

          try {
               Equilatero equilatero = new Equilatero(12, 10);
               System.out.println(equilatero.toString());
          } catch (RuntimeException ex) {
               System.out.println(ex.getMessage());
          }
          
     }
}
