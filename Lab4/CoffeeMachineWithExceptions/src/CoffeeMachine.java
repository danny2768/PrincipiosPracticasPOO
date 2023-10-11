import java.util.InputMismatchException;
import java.util.Scanner;

public class CoffeeMachine {
    int nivel;
    int saldo;
    int valorOnza;
    int unidadesVenta;
    int dineroRecibido;

    public CoffeeMachine()
    {
        nivel = 100;
        saldo = 20000;
        valorOnza = 100;
        dineroRecibido = 0;
    }

    public boolean preguntarSiNo(String pregunta) {
        Scanner sc = new Scanner(System.in);

        System.out.print(pregunta + " (Sí/No): ");
        String respuesta = sc.nextLine().trim().toLowerCase();

        return respuesta.equals("sí") || respuesta.equals("si");
    }

    public void comprarCafe( int unidadesVenta) throws InsufficientFundsException {
        this.unidadesVenta = unidadesVenta;

        if (unidadesVenta <= nivel ){

            System.out.println( "El cafe tiene un costo de:" + calcularPrecio() );
            boolean respuesta = preguntarSiNo("¿Desea continuar con la operacion?");

            if ( respuesta ){
                System.out.print("Por favor ingrese el dinero: ");
                Scanner sc = new Scanner(System.in);
                try {
                    this.dineroRecibido += sc.nextInt();
                    recibirDinero(dineroRecibido);
                } catch (InputMismatchException e) {
                    System.out.println("Error: Ingrese un valor numérico válido.");
                }
            } else {
                unidadesVenta = 0;
            }

        } else {
            System.out.print( "Operacion fallida, la cantidad de onzas deseadas " +
                    "son mayores a las disponibles. Onzas disponibles: " + nivel);
            unidadesVenta = 0;
        }

    }

    public int calcularPrecio(){
        return (unidadesVenta * valorOnza);
    }

    private void recibirDinero(int dineroRecibido) throws InsufficientFundsException {
        this.dineroRecibido = dineroRecibido;

        if( dineroRecibido < calcularPrecio() ) {
            int dineroAdicional = 0;
            while (dineroRecibido + dineroAdicional < calcularPrecio()) {
                int saldoPendiente = (calcularPrecio() - dineroRecibido - dineroAdicional);
                System.out.println("Por favor ingrese el saldo pendiente: $" + saldoPendiente);

                Scanner sc = new Scanner(System.in);
                try {
                    dineroAdicional += sc.nextInt();
                } catch (InputMismatchException e){
                    System.out.println("Error: Ingrese un valor numerico valido.");
                }

            }
            this.dineroRecibido += dineroAdicional;
            calcularCambio();
            entregarCafe();

        } else {
            calcularCambio();
            entregarCafe();
        }

    }

    private int calcularCambio() throws InsufficientFundsException {
        int cambio = dineroRecibido - calcularPrecio();

        if (cambio < 0) {
            // CustomException: InsufficientFundsException
            throw new InsufficientFundsException("Funds provided are insufficient.");
        }

        System.out.println("Su cambio es: " + cambio);
        return cambio;
    }

    private void entregarCafe() {
        System.out.println("Aquí esta su café, gracias por preferirnos.");
        nivel-=unidadesVenta;
        saldo+=calcularPrecio();
        unidadesVenta=0;
        dineroRecibido=0;
    }
}
