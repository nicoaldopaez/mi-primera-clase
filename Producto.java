public class Producto{
    private String nombreProducto;
    
    private double precioProducto;
    
    private boolean envaseReciclable;
    
<<<<<<< HEAD
    public Producto (String nombre, boolean reciclable){
=======
    private boolean sinGluten;
    
    private int temperatura;
    
    public Producto (String nombre, boolean reciclable, boolean gluten){
>>>>>>> 516ff1325eea1991a3b932e5ef531fa81cad9dce
        nombreProducto = nombre;
        envaseReciclable = reciclable;
        precioProducto = 2.50;
        temperatura = 30;
    }
    
<<<<<<< HEAD
=======
    public void setConGluten(){
        sinGluten = false;
    }
    
    public void modificarTemperatura(int nuevoValor){
        temperatura = nuevoValor ; 
    }
    
>>>>>>> 516ff1325eea1991a3b932e5ef531fa81cad9dce
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
<<<<<<< HEAD
        System.out.println ("Datos del producto:" + nombreProducto +" "+ reciclable +" " + precioProducto);
=======
        System.out.println ("Datos del producto:" + nombreProducto +" "+"Tipo de envase:"+ reciclable +" " +"Precio:"+ precioProducto +" "+"Con/Sin gluten:"+ celiacos +" "+"temperatura:"+ temperatura);
>>>>>>> 516ff1325eea1991a3b932e5ef531fa81cad9dce
    }
    
    public String getDatosProduto(){
        return nombreProducto + envaseReciclable + precioProducto;
    }





































}