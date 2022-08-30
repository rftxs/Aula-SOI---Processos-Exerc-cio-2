package view;

import javax.swing.*;

import controller.KillController;

public class Main {

	public static void main(String[] args) {
		
		KillController processosController = new KillController();
		
		int opc = 0;
		 while (opc!=9) {
			 opc = Integer.parseInt(JOptionPane.showInputDialog(" MATAR PROCESSO \n 1 - Matar por PID \n 2 - Matar por Nome \n 9 - Finaliza"));
			 switch(opc) {
			 case 1: String paramPID = JOptionPane.showInputDialog("Número do PID");
				processosController.mataPid(paramPID);
				break;
			 case 2: String paramNome = JOptionPane.showInputDialog("Nome do Processo");
				processosController.mataNome(paramNome);
				break;
			 case 9: JOptionPane.showMessageDialog(null,"Programa finalizado");
			 	break;
			 default:JOptionPane.showMessageDialog(null,"Opção Inválida");
			 			 
			 }
			 
			 
		 }
		
		

	}

}
