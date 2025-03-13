package ControleArCondicionadado;
public class ArCondicionado {
   private String Modelo;
   private String Codigo;
   private String Marca;
   private Double BTU;
   
   
   // Construtor.
    public ArCondicionado(String Modelo, String Codigo, String Marca, Double BTU) {
        this.Modelo = Modelo;
        this.Codigo = Codigo;
        this.Marca = Marca;
        this.BTU = BTU;
    }

    // Get & Set de cada variáveis
    public String getModelo() {
        return Modelo;
    }


    public void setModelo(String modelo) {
        this.Modelo = modelo;
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


    public Double getBTU() {
        return BTU;
    }


    public void setBTU(Double btu) {
        BTU = btu;
    }
   
    public void ExibiInfo(){
        System.out.println("Modelo: "+getModelo() + "\nCódigo: "+getCodigo() + "\nMarca: "+getMarca() + "\nBTU: "+getBTU()+ "\n");
    }

}