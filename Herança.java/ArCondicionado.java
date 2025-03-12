public class ArCondicionado {
    private String Modelo;
    private String Codigo;
    private String Marca;
    private double BTU;
    
    // Construtor.
    public ArCondicionado (String Modelo, String Codigo, String Marca, double BTU){
        this.Modelo = Modelo; 
        this.Marca = Marca; 
        this.Codigo = Codigo; 
        this.BTU = BTU; 
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String codigo) {
        Codigo = codigo;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public double getBTU() {
        return BTU;
    }

    public void setBTU(double btu) {
        BTU = btu;
    }

}
