/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetos.sistema_de_grafico.view;

import java.awt.BorderLayout;
import java.util.ArrayList;
import projetos.sistema_de_grafico.decorator.GraficoBarra;
import projetos.sistema_de_grafico.model.Pessoa;
import projetos.sistema_de_grafico.presenter.LeituraArquivo;

/**
 *
 * @author Usuário
 */
public class GraficoPresenter {
    
    GraficoView view;
    GraficoBarra grafico;
    LeituraArquivo leitura = new LeituraArquivo("pessoas.csv");
    
    public GraficoPresenter(){
        view = new GraficoView();
        grafico = new GraficoBarra();
        
        view.getJpnGrafico().setLayout(new BorderLayout());
        view.getJpnGrafico().add(grafico.criarGraficoBarra((ArrayList<Pessoa>) leitura.getPessoaCollection().getPessoas()));
        view.setVisible(true);
    }
}
