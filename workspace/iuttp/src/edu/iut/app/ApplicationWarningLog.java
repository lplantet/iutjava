import java.util.ArrayList;

public class ApplicationWarningLog extends AbstractApplicationLog {

	/** Ajouter un tableau ou profiter de l'héritage ? */
	public ApplicationWarningLog() {
		super();
	}
	protected ArrayList <IApplicationLogListener> listeners;
	protected static ArrayList <String> Messages;
	@Override
	public void setMessage(String message) {
		this.message = message;
		super.fireMessage("[WARNING]", this.message);
		int i;
		Messages.add(message);
		for(i=0;i<listeners.size();i++){
			listeners.get(i).newMessage("warning",message);
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
