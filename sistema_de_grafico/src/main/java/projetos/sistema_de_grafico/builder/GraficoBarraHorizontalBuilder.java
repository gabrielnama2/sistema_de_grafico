package projetos.sistema_de_grafico.builder;
import java.util.ArrayList;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.CategoryDataset;
import projetos.sistema_de_grafico.decorator.GraficoBarraHorizontal;
import projetos.sistema_de_grafico.model.Pessoa;

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
