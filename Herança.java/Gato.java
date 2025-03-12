public class Gato extends Animal {
    private String cor;
    private String Som;
    public Gato(String nome, int patas, String cor, String som){ 
        super(nome, patas);
        this.cor = cor;
        this.Som = som;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getSom() {
        return Som;
    }
    public void setSom(String som) {
        Som = som;
    }
    public void exibiInfo(){
        System.out.println("Nome: "+getNome()+ "\nPatas:"+getPatas()+ "\nCor: "+cor+ "\nSom: "+Som);
    }
    
}
