package br.com.senaisp.bauru.gustavo.licao07;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class TesteDesenhos {

	public static void main(String[] args) {
		//Criando a janela
		JOptionPane janela = new JOptionPane();
		//Criando a janelacom diálogo
		JDialog dlg = janela.createDialog("Desenhos");
		//Dimencionando a janela
		dlg.setSize(800, 600);
		//Criando nosso conteúdo
		DesenhoSwing desenho = new DesenhoSwing();
		//Atribuindo o desenho à Janela
		dlg.setContentPane(desenho);
		//Mostrando a janela
		dlg.setVisible(true);
		
	}
			

}
