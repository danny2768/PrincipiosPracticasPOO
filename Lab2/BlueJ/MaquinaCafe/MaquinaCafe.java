import java.util.Scanner;
public class MaquinaCafe
{
    // Consideraciones:
    // Cafe se mide en onzas
    // La maquina recibe dinero
    // La maquina recibe la candidad de onzas a vender
    // La maquina debe disponer un valor de venta por onza
    // Al cerrar la venta o entregar el cafe el saldo debe aumentar y el nivel disminuir

    int nivel;
    int saldo;
    int valorOnza;
    int unidadesVenta;
    int dineroRecibido;

    public MaquinaCafe()
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

    void comprarCafe( int unidadesVenta){
        this.unidadesVenta = unidadesVenta;

        if (unidadesVenta <= nivel ){

            System.out.println( "El cafe tiene un costo de:" + calcularPrecio() );
            boolean respuesta = preguntarSiNo("¿Desea continuar con la operacion?");

            if ( respuesta ){
                System.out.print("Por favor ingrese el dinero: ");
                Scanner sc = new Scanner(System.in);
                this.dineroRecibido += sc.nextInt();
                recibirDinero( dineroRecibido );
            } else {
                unidadesVenta = 0;
            }

        } else {
            System.out.print( "Operacion fallida, la cantidad de onzas deseadas son mayores a las disponibles. Onzas disponibles: " + nivel);
            unidadesVenta = 0;            
        }

    }

    int calcularPrecio(){
        return (unidadesVenta * valorOnza);
    }

    void recibirDinero(int dineroRecibido) {
        this.dineroRecibido = dineroRecibido;

        if( dineroRecibido < calcularPrecio() ) {
            int dineroAdicional = 0;
            while (dineroRecibido + dineroAdicional < calcularPrecio()) {
                int saldoPendiente = (calcularPrecio() - dineroRecibido - dineroAdicional);
                System.out.println("Por favor ingrese el saldo pendiente: $" + saldoPendiente);

                Scanner sc = new Scanner(System.in);
                dineroAdicional += sc.nextInt();
            }
            this.dineroRecibido += dineroAdicional;
            calcularCambio();
            entregarCafe();

        } else {
            calcularCambio();
        }

    }

    int calcularCambio() {
        int cambio = (dineroRecibido-calcularPrecio());
        System.out.println("Su cambio es: " + cambio);
        return ( cambio );
    }

    private void entregarCafe() {
        System.out.println("Aquí esta su café, gracias por preferirnos.");
        nivel-=unidadesVenta;
        saldo+=calcularPrecio();
        unidadesVenta=0;
        dineroRecibido=0; 
    }
}
