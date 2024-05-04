public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    @Override
    public void tocar() {
        // TODO Auto-generated method stub
        System.out.println("Reprodutor iniciado");
    }

    @Override
    public void pausar() {
        // TODO Auto-generated method stub
        System.out.println("Pause ativo");
    }

    @Override
    public void selecionarMusica(String musica) {
        // TODO Auto-generated method stub
        System.out.println("Musica selecionada: " + musica);
    }

    @Override
    public void exibirPagina(String pagina) {
        // TODO Auto-generated method stub
        System.out.println("Exibindo pagina: " + pagina);
    }

    @Override
    public void adicionarNovaAba(String pagina) {
        // TODO Auto-generated method stub
        System.out.println("Nova Aba aberta na pagina!" + pagina);
    }

    @Override
    public void atualizarPagina() {
        // TODO Auto-generated method stub
        System.out.println("Pagina atualizada!");
    }

    @Override
    public void ligar() {
        // TODO Auto-generated method stub
        System.out.println("Ligando... Espere uns segundos");
        System.out.println("Ligado");
    }

    @Override
    public void atender() {
        // TODO Auto-generated method stub
        System.out.println("Atender Ligacao");
    }

    @Override
    public void iniciarCorreioVoz() {
        // TODO Auto-generated method stub
        System.out.println("Correio de voz iniciado, pode falar e mandar a msg");
    }
    
}
