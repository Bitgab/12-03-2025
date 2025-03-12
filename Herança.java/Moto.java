public class Moto extends Veiculo {
    private int cilidrada;
    
    public Moto(String nome, String marca, int ano, int cilidrada){
        super(nome, marca, nome);
        this.cilidrada = cilidrada;
    }

    public int getCilidrada() {
        return cilidrada;
    }

    public void setCilidrada(int cilidrada) {
        this.cilidrada = cilidrada;
    }

    public void exibiInfo(){
        System.out.println("Nome: " +getNome()+ "Marca: "+getMarca()+ "Ano: "+getAno() + "Cilidrada: "+ getCilidrada());
    }


}
