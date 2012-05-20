/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.util.Iterator;
import java.util.List;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;

/**
 *
 * @author Nandez
 * 
 * Esta es la clase que realiza la autenticacion y luego 
 * invoca una de las 3 app. EI, PA o AR 
 * 
 */
public class IEAFITWeb {
    
    private String key;
    private Document doc;

    public String recorrerNodo() {
        String temp = null;
        List listCursos = doc.getRootElement().getChildren();
        Iterator iteraCursos = listCursos.iterator();
        
        while (iteraCursos.hasNext()) {
            
            Element curso = (Element) iteraCursos.next();
            List CodNumEstud = curso.getChildren();
            
            Iterator Registro = CodNumEstud.iterator();
            
            while (Registro.hasNext()) {
                        Element estudiante = (Element) CodNumEstud.get(3);
                        temp = estudiante.getText();
                        return temp;
            
            }
        }
        return temp;
    }

    public NameHandler() {
        try {
            SAXBuilder saxBuilder = new SAXBuilder();
            doc = saxBuilder.build("http://localhost:8084/HelloWeb/roseindia.xml");
            name = null;
        } catch (Exception e) {
            name = "ERROR DE ARCHIVO";
        }
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    
    public String login (String user, String psswrd){
        return key;
    }
    
        
}
