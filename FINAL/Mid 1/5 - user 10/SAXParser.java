import javax.xml.parsers.*;
import org.xml.sax.*;
import org.xml.sax.helpers.DefaultHandler;

class UserHandler extends DefaultHandler {
    String userId = "1";
    String currentUserId;
    String currentElement;
    boolean isTargetUser = false;
    
    public void startElement(String uri, String localName, String qName, Attributes attributes) {
        currentElement = qName;
        if (qName.equals("user")) {
            currentUserId = attributes.getValue("id");
            if (currentUserId.equals(userId)) {
                isTargetUser = true;
            }
        }
    }
    
    public void characters(char[] ch, int start, int length) {
        String content = new String(ch, start, length).trim();
        if (isTargetUser && !content.isEmpty()) {
            if (currentElement.equals("n")) {
                System.out.println("Name: " + content);
            } else if (currentElement.equals("email")) {
                System.out.println("Email: " + content);
            }
        }
    }
    
    public void endElement(String uri, String localName, String qName) {
        if (qName.equals("user") && isTargetUser) {
            isTargetUser = false;
        }
    }
}

public class SAXParser {
    public static void main(String[] args) {
        try {
            SAXParserFactory.newInstance().newSAXParser().parse("users.xml", new UserHandler());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}