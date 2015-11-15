

import java.util.ArrayList;
import java.util.Collection;

public abstract class AbstractApplicationLog implements IApplicationLog {

	protected String message;
	/** TP1 : Tableau au sens des collections **/
	protected ArrayList <IApplicationLogListener> listeners;
	
	public AbstractApplicationLog() {
		message = null;
		listeners = new ArrayList<IApplicationLogListener>/*TYPE TABLEAU*/();
	}
	
    /** TP1 : Fonction venant de l'interface par héritage */
	public abstract void setMessage(String message);
	

	/** Listener action */
	protected void fireMessage(String level, String message) {
		for (IApplicationLogListener listener_i : listeners) {
			listener_i.newMessage(level, message);
		}
	}

	public ArrayList<IApplicationLogListener> getListeners() {
		return listeners;
	}

	public void AddListeners(IApplicationLogListener listener) {
		this.listeners.add(listener);
	}
	
}
