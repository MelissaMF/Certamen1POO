package empresaseguros;

public class Cliente {
    private String nombreCompleto;
    private String rut;
    private char tipoCliente;
    private int edad;

    public Cliente() {
    }

    public Cliente(String nombreCompleto, String rut, char tipoCliente, int edad) {
        try{
            if (nombreCompleto.equals("")){
            throw new IllegalArgumentException("El parametro no puede estar vacio.");
            }
            else{
            this.nombreCompleto = nombreCompleto;
            this.rut = rut;
            if (tipoCliente == 'N' || tipoCliente == 'A'){
                this.tipoCliente = tipoCliente;
            } else {
                this.tipoCliente = 'N';
            }
            if (edad >= 18){
                this.edad = edad;
            } else {
                this.edad = 18;
            }
        }}
        catch(IllegalArgumentException ex){
            
            System.out.println("Se ha producido una excepcion: " + ex.getMessage());
        }
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        try {
            if(nombreCompleto.equals("")){
                throw new IllegalArgumentException ("El parámetro no puede estar vacío");
            } else {
                this.nombreCompleto = nombreCompleto;
            }
        } catch (IllegalArgumentException ex){
            System.out.println("Se ha producido una excepcion: " + ex.getMessage());
        }
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public char getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(char tipoCliente) {
        if (tipoCliente == 'N' || tipoCliente == 'A'){
            this.tipoCliente = tipoCliente;
        } else {
            this.tipoCliente = 'N';
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 18){
            this.edad = edad;
        } else {
            this.edad = 18;
        }
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombreCompleto=" + nombreCompleto + ", rut=" + rut + ", tipoCliente=" + tipoCliente + ", edad=" + edad + '}';
    }
    
   
}
