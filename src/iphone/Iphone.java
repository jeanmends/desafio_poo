package iphone;

public class Iphone implements Reprodutor, AparelhoTelefonico, NavegadorInternet{
    public void tocar(){
        System.out.println("Música está tocando");
    }


    public void pausar() {
        System.out.println("Música está pausada");

    }


    public void selecionarMusica() {
        System.out.println("Selecionar música");
    }


    public void ligar() {
        System.out.println("Ligar pra alguém");
    }


    public void atender() {
        System.out.println("Atender Ligação");
    }


    public void iniciarCorreioVoz() {
        System.out.println("Iniciar correio de voz");
    }

    public void exibirPagina() {
        System.out.println("Exibir página");
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionar nova aba");
    }

    public void atualizarPagina() {
        System.out.println("Atualizar página");
    }
}
