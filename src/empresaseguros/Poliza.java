package empresaseguros;

public class Poliza {
    private String nombre;
    private double precioUF;
    private String tipoSeguro;
    private Cliente cliente;

    public Poliza(Cliente cliente) {
        cliente = new Cliente();
    }

    public Poliza(String nombre, double precioUF, String tipoSeguro, Cliente cliente) {
        try {
            if (nombre.equals("")){
                throw new IllegalArgumentException ("El nombre de la poliza no puede estar vacío");
            } else {
                this.nombre = nombre;
                this.precioUF = precioUF;
                if(tipoSeguro.equals("Incendio") || tipoSeguro.equals("Sismo") || tipoSeguro.equals("Accidente") || tipoSeguro.equals("Enfermedad")){
                    this.tipoSeguro = tipoSeguro;
                } else {
                    this.tipoSeguro = "Accidente";
                }
                this.cliente = cliente;
            }
        } catch (IllegalArgumentException ex) {
            System.out.println("Se ha generado una excepcion: " + ex.getMessage());
        }
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioUF() {
        return precioUF;
    }

    public void setPrecioUF(double precioUF) {
        this.precioUF = precioUF;
    }

    public String getTipoSeguro() {
        return tipoSeguro;
    }

    public void setTipoSeguro(String tipoSeguro) {
        if(tipoSeguro.equals("Incendio") || tipoSeguro.equals("Sismo") || tipoSeguro.equals("Accidente") || tipoSeguro.equals("Enfermedad")){
            this.tipoSeguro = tipoSeguro;
        }
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Poliza{" + "nombre=" + nombre + ", precioUF=" + precioUF + ", tipoSeguro=" + tipoSeguro + ", cliente=" + cliente + '}';
    }
    
     public double descuento (){
        if (cliente.getTipoCliente() == 'N' || precioUF >= 5.25){
            return this.precioUF * 0.1;
        }
        return 0;
    } 
     public double recargo (){
         if (cliente.getEdad() >= 70){
             return this.precioUF * 0.25;
         }
        return 0;     
     }
     
     public void info () {
         System.out.println("Informacion Poliza");
         System.out.println("___________________");
         System.out.println("Poliza: " + nombre);
         System.out.println("Tipo Seguro : " + tipoSeguro);
         System.out.println("Nombre Cliente : " + cliente.getNombreCompleto());
         System.out.println("Rut Cliente : " + cliente.getRut());
         System.out.println("Tipo Cliente : " + cliente.getTipoCliente());
         System.out.println("Edad Cliente : " + cliente.getEdad());
         System.out.println("Valor Poliza : " + precioUF);
         System.out.println("Valor Descuentos : " + descuento());
         System.out.println("Valor Recargo : " + recargo());
         System.out.println("------------------------");
         System.out.println("Valor Final : " + (precioUF - descuento() + recargo()));
         System.out.println("######################################################");
         
     }
  
}
