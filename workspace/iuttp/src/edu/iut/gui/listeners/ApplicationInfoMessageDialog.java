//package edu.iut.gui.listeners;

import javax.swing.JOptionPane;

public class ApplicationInfoMessageDialog extends
		AbstractApplicationMessageDialog {
	JOptionPane jop;
	@Override
	protected void showMessage(String level, String message) {
		/** UTILISER l'AIDE FORUNIR DANS L'ENNONCE */
		jop = new JOptionPane();
		jop.showMessageDialog(null, message, "Information", JOptionPane.INFORMATION_MESSAGE);
	}
}
