//package edu.iut.gui.listeners;

import javax.swing.JOptionPane;

public class ApplicationWarningMessageDialog extends
		AbstractApplicationMessageDialog {
	JOptionPane jop;
	@Override
	protected void showMessage(String level, String message) {
		/** UTILISER l'AIDE FORUNIR DANS L'ENNONCE */
		jop = new JOptionPane();
		jop.showMessageDialog(null, message, "Warning", JOptionPane.WARNING_MESSAGE);
	}

}
