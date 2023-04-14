package empresaseguros;

public class EmpresaSeguros {

    public static void main(String[] args) {
       Cliente cliente1 = new Cliente("Perico de Los Palotes", "12345678-9", 'N', 70);
       Poliza poliza1 = new Poliza("Tu Poliza", 4.0, "Sismo", cliente1);
       poliza1.info();
    }
    
}
