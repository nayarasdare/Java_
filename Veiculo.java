import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;


class Veiculo{
    String marca;
    int qtdRodas;
    String Modelo;
    int velocidade = 0;
    public Veiculo(String _marca, int _quantidade, String _modelo, int _velocidade){
        this.marca = _marca;
        this.qtdRodas = _quantidade;
        this.Modelo = _modelo;
        this.velocidade = _velocidade;
    }
    public int acelerar(int num){
        return this.velocidade + num;
    }
    public int frear(int num){
        return this.velocidade - num;
    }
    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return Modelo;
    }
    public int getRodas(){
        return qtdRodas;
    }
    public int getVelocidade(){
        return velocidade;
    }
    public String setMarca(String marca){
        return this.marca = marca;
    }
    public String setModelo(String Modelo){
        return this.Modelo = Modelo;
    }
    public int setRodas(int quantidade){
        return this.qtdRodas = quantidade;
    }
    public int setVelocidade(int velocidade){
        return this.velocidade = velocidade;
    }
}
class Bicicleta extends Veiculo{
    int numMarchas;
    boolean bagageiro;
    public Bicicleta(String _marca, int _quantidade, String _modelo, int _velocidade, int _numMarchas,boolean _bagageiro) {
        super(_marca, _quantidade, _modelo, _velocidade);
        this.numMarchas = _numMarchas;
        this.bagageiro = _bagageiro;
    }
    public void ImprimirInformacoes() {
		System.out.println(this.bagageiro);
		System.out.println(this.numMarchas);
	}
    public int setMarchas(int marchas){
        return this.numMarchas = marchas;
    }
    public boolean setBagageiro(Boolean bagageiro){
        return this.bagageiro = bagageiro;
    }
    public int getMarchas(){
        return numMarchas;
    }
    public boolean getBagageiro(){
        return bagageiro;
    }
}
class Automovel extends Veiculo{
    static double potenciaDoMotor;
    public Automovel(String _marca, int _quantidade, String _modelo, int _velocidade,double _potenciaDoMotor) {
        super(_marca, _quantidade, _modelo, _velocidade);
        Automovel.potenciaDoMotor = _potenciaDoMotor;
    }
    public void ImprimirInformacoes() {
		System.out.println(Automovel.potenciaDoMotor);
	}
    public double setPotencia(double potencia){
        return Automovel.potenciaDoMotor = potencia;
    }
    public double getPotencia(double potencia){
        return potenciaDoMotor;
    }
} 
class Moto extends Automovel{
    boolean partidaEletrica;
    public Moto(String _marca, int _quantidade, String _modelo, int _velocidade,boolean _partidaEletrica){
        super(_marca, _quantidade, _modelo, _velocidade, potenciaDoMotor);
        this.partidaEletrica = _partidaEletrica;
    }
    public void ImprimirInformacoes() {
		System.out.println(this.partidaEletrica);
	}
    public boolean getPartida(){
        return partidaEletrica;
    }
    public boolean setPartida( boolean partida){
        return this.partidaEletrica = partida;
    }
}
class Carro extends Automovel{
    int qtdPortas;
    public Carro(String _marca, int _quantidade, String _modelo, int _velocidade,int _qtdPortas) {
        super(_marca, _quantidade, _modelo, _velocidade, potenciaDoMotor);
        this.qtdPortas = _qtdPortas;
    }
    public void ImprimirInformacoes() {
		System.out.println(this.qtdPortas);
	}
    public int getPortas(){
        return qtdPortas;
    }
    public int setPortas(int numero){
        return this.qtdPortas = numero;
    }
}


