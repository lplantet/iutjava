

import java.util.ArrayList;


public class ApplicationLogs extends ArrayList<IApplicationLog> {

	public ApplicationLogs() {		
	}
	
	public ArrayList<IApplicationLog> getErrors() {
		ArrayList<IApplicationLog> filteredLogs = new ArrayList<IApplicationLog>();
		// une boucle à faire ici, penser à utiliser instanceof
		//la boucle � deja �t� faite dans "setMessage"
		//On ne sait pas comment r�cup�rer les messages de type IApplicationLog
		//filteredLogs = ApplicationErrorLog.Messages;
		return filteredLogs;
	}
	public ArrayList<IApplicationLog> getWarnings() {
		ArrayList<IApplicationLog> filteredLogs = new ArrayList<IApplicationLog>();
		// une boucle à faire ici, penser à utiliser instanceof
		//la boucle � deja �t� faite dans "setMessage"
		//On ne sait pas comment r�cup�rer les messages de type IApplicationLog
		//filteredLogs = ApplicationWarningLog.Messages;
		return filteredLogs;
	}
	public ArrayList<IApplicationLog> getInfos() {
		ArrayList<IApplicationLog> filteredLogs = new ArrayList<IApplicationLog>();
		// une boucle à faire ici, penser à utiliser instanceof
		//la boucle � deja �t� faite dans "setMessage"
		//On ne sait pas comment r�cup�rer les messages de type IApplicationLog
		//filteredLogs = ApplicationInfoLog.Messages;
		return filteredLogs;
	}
	

}
