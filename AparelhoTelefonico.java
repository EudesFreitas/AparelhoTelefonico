// AparelhoTelefonico.java
public interface AparelhoTelefonico {
    void ligar();
    void atender();
    void iniciarCorreioVoz();
}

// Navegador.java
public interface Navegador {
    void exibirPagina();
    void adicionarNovaAba();
    void atualizarPagina();
}

// ReprodutorMusical.java
public interface ReprodutorMusical {
    void tocar();
    void pausar();
    void selecionarMusica();
}

// Iphone.java
public class Iphone implements AparelhoTelefonico, Navegador, ReprodutorMusical {
    // Implementação de AparelhoTelefonico
    @Override
    public void ligar() {
        System.out.println("Ligando!");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada!");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio de Voz!");
    }

    // Implementação de Navegador
    @Override
    public void exibirPagina() {
        System.out.println("Exibindo Página!");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada!");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada!");
    }

    // Implementação de ReprodutorMusical
    @Override
    public void tocar() {
        System.out.println("Música tocando!");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada!");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Música selecionada!");
    }

    // Método main para testar a classe Iphone
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();
        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();
    }
}