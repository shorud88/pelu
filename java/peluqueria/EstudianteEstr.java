import java.util.Scanner;
public class EstudianteEstr
{
  public static void main(String[] args ){
      Scanner sc = new Scanner (System.in);
      String[] identificaciones = new String [50];
      String [] nombres = new String [50];
      
      String[] cursos = new String[50];
      double [] semanauno = new double [50];
      double [] semanados = new double [50];
      double [] semanatres= new double [50];
      int numeroPeluqueros;
      String identificacion, nombre;
      double semana1, semana2, semana3;
      double promedio = 0;
      System.out.println("Digite el numero de estudiantes: ");
      numeroPeluqueros = sc.nextInt();
      for(int i = 0 ; i < numeroPeluqueros; i++){
        System.out.println("Digite la identificacion del peluquero ");
        identificacion = sc.next();
        System.out.println("Digite el nombre del peluquero: ");
        nombre = sc.next();
       
        System.out.println("Digite los ingresas semana uno del estudiante: " );
        semana1 = sc.nextDouble();
        System.out.println("Digite los ingresas semana dos del estudiante: ");
        semana2 = sc.nextDouble();
        System.out.println("Digite los ingresas semana tres del estudiante: ");
        semana3 = sc.nextDouble();
        identificaciones[i] = identificacion;
        nombres[i] = nombre;
        semanauno[i]= semana1;
        semanados[i]= semana2;
        semanatres[i]=semana3;
        
        
        }
        for (int i = 0; i < numeroPeluqueros;i++){
            promedio = promedio + ((semanauno[i] + semanados [i] + semanatres [i]) / 3)/numeroPeluqueros;
        }
        System.out.println("El promedio de ingresos en 3 sem es:" + promedio);
  }
}