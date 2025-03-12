public class Main {
    public static void main(String[] args) {
       Funcionario funcionario = new Funcionario("Gabriel", 25, 1000);  
       Gerente gerente = new Gerente("Rafael", 23, 1000, 1900);
       
       funcionario.exibiInfo();
       gerente.exibiInfo();
    }

}
