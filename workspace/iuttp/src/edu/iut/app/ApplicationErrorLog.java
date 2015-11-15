import java.util.ArrayList;

public class ApplicationErrorLog extends AbstractApplicationLog {

	protected ArrayList <IApplicationLogListener> listeners;
	protected static ArrayList <String> Messages;
	
	/** Ajouter un tableau ou profiter de l'héritage ? */
	public ApplicationErrorLog() {
		super();
	}
	
	@Override
	public void setMessage(String message) {
		this.message = message;
		super.fireMessage("[ERROR]", this.message);
		int i;
		Messages.add(message);
		for(i=0;i<listeners.size();i++){
			listeners.get(i).newMessage("Error",message);
		}
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addListener(IApplicationLogListener listener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public IApplicationLogListener[] getApplicationLogListeners() {
		// TODO Auto-generated method stub
		return null;
	}


}
