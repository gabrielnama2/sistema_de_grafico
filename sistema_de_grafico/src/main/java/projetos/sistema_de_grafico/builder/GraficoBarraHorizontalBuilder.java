package projetos.sistema_de_grafico.builder;

import projetos.sistema_de_grafico.decorator.GraficoBarraHorizontal;

public class GraficoBarraHorizontalBuilder implements GraficoBuilder{
    
    GraficoBarraHorizontal grafico;

    @Override
    public void reset() {
        this.grafico = new GraficoBarraHorizontal();
    }
    
    public GraficoBarraHorizontal getResult() {
        return this.grafico;
    }
}
