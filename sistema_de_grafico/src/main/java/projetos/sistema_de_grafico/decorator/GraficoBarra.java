/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetos.sistema_de_grafico.decorator;

import java.awt.Dimension;
import java.util.ArrayList;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import projetos.sistema_de_grafico.model.Pessoa;

/**
 *
 * @author Usuário
 */
public class GraficoBarra implements IGrafico{
    
    //cria dataset
    public CategoryDataset createDataSet(ArrayList<Pessoa> listaDePessoas){
        
        int masculino = 0, feminino = 0, solteiro = 0, casado = 0;
                
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();                
        
        for(Pessoa pessoa : listaDePessoas){
            String estadoCivil = pessoa.getEstado_civil();
            String sexo = pessoa.getSexo();
            
            if (estadoCivil.equals("Casado(a)")) {
                casado += 1;
            } else {
                solteiro += 1;
            }
            if (sexo.equals("Masculino")) {
                masculino += 1;
            } else {
                feminino += 1;
            }
        }
        
        dataSet.addValue(casado, "Casados", "");
        dataSet.addValue(solteiro, "Solteiros", "");
        dataSet.addValue(masculino, "Homens", "");
        dataSet.addValue(feminino, "Mulheres", "");
        
        return dataSet;
    }
    
    //criar o grafico
    public JFreeChart createBarChart(CategoryDataset dataSet){
        
        JFreeChart graficoBarras = ChartFactory.createBarChart(
                "Relação de Pessoas",
                "",
                "Contagem",
                dataSet, 
                PlotOrientation.HORIZONTAL,
                true,
                false,
                false);
        
        return graficoBarras;
    }

    public ChartPanel criarGraficoBarra(ArrayList<Pessoa> listaDePessoas){
        
        CategoryDataset dataSet = this.createDataSet(listaDePessoas);
        
        JFreeChart grafico = this.createBarChart(dataSet);
        
        ChartPanel painelDoGrafico = new ChartPanel(grafico);
        
        painelDoGrafico.setPreferredSize(new Dimension(400, 400));
        
        return painelDoGrafico;
    }
    
    @Override
    public void executar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
