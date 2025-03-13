package ControleArCondicionadado;

public class Portatil extends ArCondicionado {
    private String Voltagem;
    private String Cor;

    public Portatil(String Modelo, String Codigo, String Marca, Double BTU, String Voltagem, String Cor){
        super(Modelo, Codigo, Marca, BTU);
        this.Voltagem = Voltagem;
        this.Cor = Cor;
    }

    // Get de Voltagem and Cor.
    public String getVoltagem(){
        return Voltagem;
    }
    public String getCor(){
        return Cor;
    }

    // Set de Voltagem and Cor.
    public void setVoltagem(String voltagem){
        this.Voltagem = voltagem;
    }

    public void setCor(String cor){
        this.Cor = cor;
    }

    public void ExibiInfo(){
        System.out.println("\nModelo: "+getModelo() + "\nCódigo: "+getCodigo() + "\nMarca: "+getMarca() + "\nBTU: "+getBTU() + "\nVoltagem: "+getVoltagem() + "Cor: "+getCor() + "\n");
    }
}
