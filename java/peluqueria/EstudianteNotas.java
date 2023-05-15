import java.util.Scanner;


public class EstudianteNotas
{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numeroPeluqueros;
    PeluqueroPoo[] losPeluqueros = new PeluqueroPoo[50];
    String identificacion, nombre ;
    double semana1, semana2, semana3;
    double promedio = 0 ;
    System.out.println("Digite el numero de Peluquero");
    numeroPeluqueros = sc.nextInt();
    for(int i = 0; i < numeroPeluqueros ; i++)
    {
        System.out.println("Digite la identificacion del peluquero: ");
        identificacion = sc.next();
         System.out.println("Digite el nombre del peluquero: ");
        nombre = sc.next();
         System.out.println("Digite el ingreso semana uno del peluquero: ");
        semana1 = sc.nextDouble();
         System.out.println("Digite el ingreso dos del peluquero: ");
        semana2 = sc.nextDouble();
         System.out.println("Digite el ingreso tres del Estudiante: ");
        semana3 = sc.nextDouble();
    
        
        PeluqueroPoo unPeluquero = new PeluqueroPoo();
        unPeluquero.identificacion = identificacion;
        unPeluquero.nombre = nombre;
        unPeluquero.semanauno = semana1;
        unPeluquero.semanados = semana2;
        unPeluquero.semanatres = semana3;
        losPeluqueros[i] = unPeluquero;
      }
      for (int i = 0; i < numeroPeluqueros; i++){
          double sum = (losPeluqueros[i].semanauno + losPeluqueros[i].semanados + losPeluqueros[i].semanatres) / 3;
          promedio = promedio + sum / numeroPeluqueros;
        }
        System.out.println("El promedio de notas es: " + promedio);
      }
    }

    
 
     
       
    

    