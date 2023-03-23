public class Producto{
    private String nombreProducto;
    
    private double precioProducto;
    
    private boolean envaseReciclable;
    
    private boolean sinGluten;
    
    private double dimensionEnvase;
    
    public Producto (String nombre, boolean reciclable, boolean gluten){
        nombreProducto = nombre;
        envaseReciclable = reciclable;
        sinGluten = gluten;
        precioProducto = 2.50;
        dimensionEnvase = 10.50;
    }
    
    public void cambiarDimension(double nuevaDimension){
        dimensionEnvase = nuevaDimension;  
    }
    
    public void setConGluten(){
        sinGluten = false;
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
        String celiacos ="";
        if (envaseReciclable == false && sinGluten==false){
            reciclable = "No es reciclable";
            celiacos = "contiene gluten";
        }
        else{
            reciclable = "Si es reciclable";
            celiacos="sin gluten";
        }
        System.out.println ("Datos del producto:" + nombreProducto +" "+ reciclable +" " + precioProducto+" "+ celiacos+" "+"Dimension del envase en cm2:"+" "+dimensionEnvase);
    }
    
    public String getDatosProduto(){
        return nombreProducto + envaseReciclable + precioProducto;
    }





































}