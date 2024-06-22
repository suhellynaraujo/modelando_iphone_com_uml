package main.java.com.modelagem.app;

import main.java.com.modelagem.models.Iphone;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();
        
        // Testando métodos de AparelhoTelefonico
        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();
        
        // Testando métodos de NavegadorInternet
        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
