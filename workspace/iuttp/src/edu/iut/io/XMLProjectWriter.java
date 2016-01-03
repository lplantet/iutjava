package edu.iut.io;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import javax.lang.model.element.Element;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.*;
import javax.xml.transform.stream.*;
import org.xml.sax.*;

import edu.iut.app.Classroom;
import edu.iut.app.Document;
import edu.iut.app.ExamEvent;
import edu.iut.app.Person;

import org.w3c.dom.*;

//EX 1 Completer la classe 

public class XMLProjectWriter {
	
	private Date ExamDate = null;
	private Person student = null;
	private ArrayList<Person> jury = null;
	private Classroom classroom = null;
	private ArrayList<Document> documents;
	
	public XMLProjectWriter() {		
	}
	
	public static void save(ArrayList<ExamEvent> data, java.io.File xmlfile) {
		Document dom;
	    Element e = null;
	    Element e2= null;
	    DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
	    DocumentBuilder db;
		try {
			db = dbf.newDocumentBuilder();
			dom = (Document) db.newDocument();
			Element rootEle = dom.createElement("ExamEvent");
			
			e = dom.createElement("ExamDate");
	        e.appendChild(dom.createTextNode(ExamEvent1.toString()));
	        ((Node) rootEle).appendChild((Node) e);
	        
	        e = dom.createElement("student");
	        e.appendChild(dom.createTextNode(student1));
	        ((Node) rootEle).appendChild((Node) e);
	        
	        e = dom.createElement("jury");
	        e.appendChild(dom.createTextNode(jury1));
	        
	        e2 = dom.createElement("unMembre");
	        e2.appendChild(dom.createTextNode(personne1));
	        ((Node) e).appendChild((Node) e2);
	        ((Node) rootEle).appendChild((Node) e);
	        
	        e = dom.createElement("classroom");
	        e.appendChild(dom.createTextNode(classroom1));
	        ((Node) rootEle).appendChild((Node) e);
	        
	        e = dom.createElement("documents");
	        e.appendChild(dom.createTextNode(document1));
	        e2 = dom.createElement("unDoc");
	        e2.appendChild(dom.createTextNode(unDoc1));
	        ((Node) e).appendChild((Node) e2);
	        ((Node) rootEle).appendChild((Node) e);
	        
	        dom.appendChild(rootEle);
	        try {
	            Transformer tr = TransformerFactory.newInstance().newTransformer();
	            tr.setOutputProperty(OutputKeys.INDENT, "yes");
	            tr.setOutputProperty(OutputKeys.METHOD, "xml");
	            tr.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
	            tr.setOutputProperty(OutputKeys.DOCTYPE_SYSTEM, "roles.dtd");
	            tr.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");

	            // send DOM to file
	            tr.transform(new DOMSource(dom), 
	                                 new StreamResult(xmlfile);

	        } catch (TransformerException te) {
	            System.out.println(te.getMessage());
	        }
	        } catch (IOException ioe) {
	            System.out.println(ioe.getMessage());
	        }
		}
		catch (ParserConfigurationException pce) {
			// TODO Auto-generated catch block
			System.out.println("UsersXML: Error trying to instantiate DocumentBuilder " + pce);
		}
	}


