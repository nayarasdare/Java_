import java.io.IOException;


class Pessoa {
        private String nome;
        private String pai;
        private String mae;
        
        public Pessoa(String _nome, String _pai, String _mae) {
            this.nome = _nome;
            this.pai = _pai;
            this.mae = _mae;
        }
        public Pessoa(String _nome){
            this.nome = _nome;
        }
        public void Verifica(Pessoa p) {
            if(this.pai == p.pai || this.mae == p.mae){
                System.out.println("São irmãos!");
            } else {
                System.out.println("Não são irmãos!");
            }
        }
        public void Verifica_Parentesco(Pessoa p) {
            if(p.nome == this.pai || p.nome == this.mae) {
                System.out.println("São parentes !");
            } else {
                System.out.println("Não são parentes !");
            }
        }
        public String getNome(){
            return nome;
        }
        public String getMae(){
            return mae;
        }
        public String getPai(){
            return pai;
        }
        public String setNome(String nome){
            return this.nome = nome;
        }
        public String setMae(String mae){
            return this.mae = mae;
        }
        public String setPai(String pai){
            return this.pai = pai;
        }
}