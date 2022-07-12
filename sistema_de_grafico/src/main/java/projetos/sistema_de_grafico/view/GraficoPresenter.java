/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetos.sistema_de_grafico.view;

import java.awt.BorderLayout;
import java.util.ArrayList;
import projetos.sistema_de_grafico.builder.DiretorGrafico;
import projetos.sistema_de_grafico.builder.GraficoBarraHorizontalBuilder;
import projetos.sistema_de_grafico.decorator.GraficoBarraHorizontal;
import projetos.sistema_de_grafico.model.Pessoa;
import projetos.sistema_de_grafico.presenter.LeituraArquivo;

/**
 *
 * @author Usuário
 */
public class GraficoPresenter {
    
    private GraficoView view;
    private GraficoBarraHorizontalBuilder builder;
    private DiretorGrafico diretor;
    private LeituraArquivo leitura = new LeituraArquivo("pessoas.csv");
    
    public GraficoPresenter(){
        view = new GraficoView();
        diretor = new DiretorGrafico();
        builder = new GraficoBarraHorizontalBuilder();
        diretor.fazerGraficoBarraHorizontal(builder);
        
        view.getJpnGrafico().setLayout(new BorderLayout());
        // view.getJpnGrafico().add(graficoBarraHorizontal.criarGraficoBarra((ArrayList<Pessoa>) leitura.getPessoaCollection().getPessoas()));
        view.getJpnGrafico().add(builder.getResult().criarGraficoBarra((ArrayList<Pessoa>) leitura.getPessoaCollection().getPessoas()));
        view.setVisible(true);
    }
}
