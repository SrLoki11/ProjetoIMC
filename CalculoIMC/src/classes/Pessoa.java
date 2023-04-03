package classes;

public class Pessoa {
    
        private String nome;
        private String sobrenome;
        private int idade;
        private double altura;
        private double peso;
        private double imc;
        
        public Pessoa(String nome, String sobrenome, int idade, double altura, double peso) {
            this.nome = nome;
            this.sobrenome = sobrenome;
            this.idade = idade;
            this.altura = altura;
            this.peso = peso;
            this.imc = calculaImc();
        }

        public void informaObesidade() {
            double imc = calculaImc();
            if (imc < 18.5) {
                System.out.println("A pessoa está abaixo do peso.");
            } 
            
            else if (imc >= 18.5 && imc < 25) {
                System.out.println("A pessoa está com peso normal.");
            } 
            
            else if (imc >= 25 && imc < 29.9) {
                System.out.println("A pessoa está com sobrepeso.");
            } 
            
            else if (imc >= 30 && imc < 34.9) {
                System.out.println("A pessoa está com obesidade grau I.");
            } 
            
            else if (imc >= 35 && imc < 39.9) {
                System.out.println("A pessoa está com obesidade grau II (severa).");
            } 
            
            else if (imc >= 40) {
                System.out.println("A pessoa está com obesidade grau III (mórbida).");
            }
        }
        
        
        public double calculaImc() {
            double imc = peso / (altura * altura);

            return imc;
        }
        
        public String getNome() {
            return nome;
        }
        
        public void setNome(String nome) {
            this.nome = nome;
        }
        
        public String getSobrenome() {
            return sobrenome;
        }
        
        public void setSobrenome(String sobrenome) {
            this.sobrenome = sobrenome;
        }
        
        public int getIdade() {
            return idade;
        }
        
        public void setIdade(int idade) {
            this.idade = idade;
        }
        
        public double getAltura() {
            return altura;
        }
        
        public void setAltura(double altura) {
            this.altura = altura;
        }
        
        public double getPeso() {
            return peso;
        }
        
        public void setPeso(double peso) {
            this.peso = peso;
        }
        
        public double getImc() {
            return imc;
        }
        
        public void setImc(double imc) {
            this.imc = imc;
        }
    }
    

