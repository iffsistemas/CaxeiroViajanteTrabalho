/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caixeiroviajante;

import javax.swing.JFrame;

/**
 *
 * @author tarcisio
 */
public class CaixeiroViajante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int largura=700, altura=700, qtde=160;
        Pontos p = new Pontos(qtde, largura, altura);
        
       JFrame pto = new JFrame("Pontos gerados");
       pto.add(p); 
       
       pto.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       pto.setSize(largura,altura);
       pto.setLocationRelativeTo(null);
       pto.setVisible(true);
       
       BuscaLocal bl = new BuscaLocal(p.getDistancias(),qtde);
       
       Plotar plo = new Plotar(qtde, largura, altura, bl.getRota(), p.getCoordenadas());
       
       JFrame pto2 = new JFrame("Melhor Rota");
       pto2.add(plo); 
       
       pto2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       pto2.setSize(largura,altura);
       pto2.setLocationRelativeTo(null);
       pto2.setVisible(true);
       
       
       Plotar plo2 = new Plotar(qtde, largura, altura, bl.getRotinha(), p.getCoordenadas());
       
       JFrame pto3 = new JFrame("Rota Inicial");
       pto3.add(plo2); 
       
       pto3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       pto3.setSize(largura,altura);
       pto3.setLocationRelativeTo(null);
       pto3.setVisible(true);
       
       
       
       
       
       
    }
    
}
