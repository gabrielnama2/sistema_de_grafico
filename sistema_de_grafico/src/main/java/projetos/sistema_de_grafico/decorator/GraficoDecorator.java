package projetos.sistema_de_grafico.decorator;
import org.jfree.chart.JFreeChart;

abstract class GraficoDecorator implements IGrafico{
    
    private IGrafico wrapee;

    public GraficoDecorator(IGrafico grafico) {
        wrapee = grafico;
    }
    
    @Override
    public void executar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
