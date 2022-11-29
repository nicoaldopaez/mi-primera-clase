public class Producto{
    private String nombreProducto;
    
    private double precioProducto;
    
    private boolean envaseReciclable;
    
    public Producto (String nombre, boolean reciclable){
        nombreProducto = nombre;
        envaseReciclable = reciclable;
        precioProducto = 2.50;
    }
    
    public String getNombreProducto(){
        return nombreProducto;
    }
    
    public boolean getEnvasereciclable(){
        return envaseReciclable;
    }
    
    public double getPrecioproducto(){
        return precioProducto;
    }
    
    public void setNombreproducto (String Hamburguesas){
        nombreProducto = Hamburguesas;
    }
    
    public void aplicarIva(){
        double iva = 1.21;
        precioProducto = (iva * precioProducto);
    }
    
    public void cambiarEnvase(){
        if (envaseReciclable == false){
            envaseReciclable = true;
        }
        else{
            envaseReciclable = false;
        }   
    }
    
    public void imprimirDatosProducto(){
        String reciclable = "";
        if (envaseReciclable == false){
            reciclable = "No es reciclable";
        }
        else{
            reciclable = "Si es reciclable";
        }
        System.out.println ("Datos del producto:" + nombreProducto +" "+ reciclable +" " + precioProducto);
    }
    
    public String getDatosProduto(){
        return nombreProducto + envaseReciclable + precioProducto;
    }





































}