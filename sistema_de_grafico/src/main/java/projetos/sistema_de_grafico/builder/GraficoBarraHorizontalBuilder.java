/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetos.sistema_de_grafico.builder;

import java.util.ArrayList;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.CategoryDataset;
import projetos.sistema_de_grafico.decorator.GraficoBarraHorizontal;
import projetos.sistema_de_grafico.model.Pessoa;

/**
 *
 * @author Usuário
 */
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
