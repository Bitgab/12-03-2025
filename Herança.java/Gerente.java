public class Gerente extends Funcionario {
    private double bonus;

    public Gerente(String nome, int idade, double salario, double bonus){
        super(nome,idade,salario);
        this.bonus = bonus;
    }  

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus){
        this.bonus = bonus;
    }
    public void exibiInfo(){
        System.out.println("Nome: "+getNome() + "\nIdade: "+getIdade() + " anos\n" + "Salário: R$ "+getSalario()+ " reais" + "\nBônus: R$"+getBonus());
    }
}
