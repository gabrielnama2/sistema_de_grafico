package projetos.sistema_de_grafico.decorator;

abstract class GraficoDecorator implements IGrafico{
    
    private IGrafico wrapee;

    public GraficoDecorator(IGrafico grafico) {
        wrapee = grafico;
    }
    
    @Override
    public void executar() {
        wrapee.executar();
    }

    public IGrafico getWrapee() {
        return wrapee;
    }
}
