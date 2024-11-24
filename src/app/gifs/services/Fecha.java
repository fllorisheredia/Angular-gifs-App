import java.util.Scanner;

public class Fecha {

  public static String meses(int NumMes){

    String Mes;

    switch(NumMes){
      case 1:
      Mes= "Enero";
      break;

      case 2:
      Mes="Febrero";
      break;

      case 3:
      Mes="Marzo";
      break;

      case 4:
      Mes="Abril";
      break;

      case 5:
      Mes="Mayo";
      break;

      case 6:
      Mes="Junio";
      break;

      case 7:
      Mes="Julio";
      break;

      case 8:
      Mes="Agosto";
      break;

      case 9:
      Mes="Septiembre";
      break;

      case 10:
      Mes="Octubre";
      break;

      case 11:
      Mes="Noviembre";
      break;

      case 12:
      Mes="Diciembre";
      break;

      default:
      Mes="Mes no válido";
      break;


    }
    return Mes;

  }








  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
  }

}
