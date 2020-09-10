package view;

import javax.swing.JOptionPane;

import controller.RedesController;
import controller.TaskController;

public class Main {

	public static void main ( String[] args ) {
		
		RedesController rc = new RedesController ( );
		TaskController tc = new TaskController ( );
		String os = tc.os ( );
		
		String options[] = { "Chamar IP", "Chamar PING", "Finalizar aplica��o" };
		int option;
		
		while ( true ) {
			
			option = JOptionPane.showOptionDialog (
					null,
					"Qual fun��o quer chamar?", "Escolha uma op��o",
					JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
					options, options[0]
			);
			
			switch ( option ) {
				case 0: rc.ip ( os ); break;
				case 1: rc.ping ( os ); break;
				default: System.exit ( 0 );
			}
		}
	}
}
