import java.util.Scanner;


public class Main {

    PabellonCirugia[] pabellonCirugias = new  PabellonCirugia[6];

    public static void main(String[] args) {

        Main programa = new Main();
        programa.procesa();
    }


    public void procesa() {

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < pabellonCirugias.length; i++) {
            System.out.println("Introduce el numero del pabellon de cirugias");
            int numero = sc.nextInt();
            if (numero == -1) {
                break;
            }
            System.out.println("Ingrese el especialidad del pabellon de cirugias");
            String especialidad = sc.next();
            if (especialidad == null) {
                break;
            }
            pabellonCirugias[i] = new PabellonCirugia(numero, especialidad);


        }
        for (int i = 0; i < pabellonCirugias.length; i++) {
            if (i % 2 == 0 && pabellonCirugias[i] != null) {
                pabellonCirugias[i].setEstado(Estado.OCUPADO);
            } else {
                pabellonCirugias[i].setEstado(Estado.DISPONIBLE);
            }
        }
        for (int i = 0; i < pabellonCirugias.length; i++) {
            if (pabellonCirugias[i] != null) {
                System.out.println("Posición " + i + ": " + pabellonCirugias[i]);
            }
        }
        boolean hayIguales = false;
        for (int i = 0; i < pabellonCirugias.length; i++) {
            for (int j = i + 1; j < pabellonCirugias.length; j++) {
                if (pabellonCirugias[i] != null && pabellonCirugias[j] != null &&
                        pabellonCirugias[i].equals(pabellonCirugias[j])) {
                    System.out.println("Pabellones iguales en posiciones " + i + " y " + j);
                    hayIguales = true;


                }
            }
        }
        if (!hayIguales) {
            System.out.println("No hay pabellones iguales");
        }


    }
}