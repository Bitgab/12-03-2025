public class Som extends Animal{
    private String Auau;
    private String Miau;

    public Som(String nome, int patas, String Auau, String Miau){
        super(nome, patas);
        this.Auau = Auau;
        this.Miau = Miau;
    }

    public String getAuau() {
        return Auau;
    }

    public void setAuau(String auau) {
        Auau = auau;
    }

    public String getMiau() {
        return Miau;
    }

    public void setMiau(String miau) {
        Miau = miau;
    }
   

     
}    
