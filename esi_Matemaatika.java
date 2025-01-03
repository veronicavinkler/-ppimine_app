import java.util.Scanner;

class Matemaatika {
  static void suunamine(int tase) {
    System.out.println("Matemaatika meetod on kutsutud");
    switch (tase) {
      case 1:
        Matemaatika_1 m1 = new Matemaatika_1();
        m1.sissejuhatus();
        break;
      case 2:
        Matemaatika_2 m2 = new Matemaatika_2();
        m2.sissejuhatus();
        break;
    
      default:
        System.out.println("Palun sisesta tase antud valikutest");
    }
  }
}
class Matemaatika_1 extends Matemaatika {
  public void sissejuhatus(){
    System.out.println("MATEMAATIKA ESIMENE PEATÜKK");
    System.out.println("SELLES OSAS ÕPIME:\n\tNUMBREID\n\tLIITMIST\n\tLAHUTAMIST");
  }
}
class Matemaatika_2 extends Matemaatika {
  public void sissejuhatus(){
    System.out.println("MATEMAATIKA TEINE PEATÜKK");
    System.out.println("SELLES OSAS ÕPIME:\n\tKORRUTAMIST\n\tJAGAMIST");
  }
}

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int tase = sc.nextInt();
    Matemaatika.suunamine(tase);
    sc.close();
  }
}
