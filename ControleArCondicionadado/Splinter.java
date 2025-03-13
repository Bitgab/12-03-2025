package ControleArCondicionadado;
    public class Splinter extends ArCondicionado{
       
        private String Tipo;
        private String Tamanho;

        // Construtor.
        public Splinter(String Modelo,String Codigo, String Marca, Double BTU,String Tipo, String Tamanho){
           super(Modelo, Codigo, Marca, BTU);
           this.Tamanho = Tamanho;
           this.Tipo = Tipo;
        }

        // Get & Set de Tipo e Tamanho.
        public String getTipo(){
            return Tipo;
        }

        public void setTipo(String tipo){
            this.Tipo = tipo;
        }

        public String getTamanho(){
            return Tamanho;
        }

        public void setTamanho(String tamanho){
            this.Tamanho = tamanho;
        }

        public void ExibiInfo(){
            System.out.println("Modelo: "+getModelo() + "\nCódigo: "+getCodigo() + "\nMarca: "+getMarca() + "\nBTU: "+getBTU() + "\nTipo: "+getTipo() + "\nTamanho: "+getTamanho() + "\n");
        }



    }