import javax.xml.parsers.*;
import org.w3c.dom.*;

public class DOMParser {
    public static void main(String[] args) {
        String userId = "1";
        
        try {
            DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document doc = builder.parse("users.xml");
            NodeList users = doc.getElementsByTagName("user");
            
            for (int i = 0; i < users.getLength(); i++) {
                Element user = (Element) users.item(i);
                if (user.getAttribute("id").equals(userId)) {
                    System.out.println("Name: " + user.getElementsByTagName("n").item(0).getTextContent());
                    System.out.println("Email: " + user.getElementsByTagName("email").item(0).getTextContent());
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}