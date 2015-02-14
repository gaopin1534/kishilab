package xml_analysis;

import java.io.FileInputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

public class xml_analysis {
	private static String xmlFile;
	public static void main(String[] args) throws Exception {

		xmlFile = "C:/Users/kohei/Documents/current/pleiades/workspace/ゼミ用ディレクトリ/src/xml_analysis/class.xml";
		parseXml(xmlFile);
	}

	private static void parseXml(String xmlFile) throws Exception {
		DocumentBuilderFactory dbf
					= DocumentBuilderFactory.newInstance();
		DocumentBuilder db
					= dbf.newDocumentBuilder();

		Document doc = db.parse(new FileInputStream(xmlFile));;

		Element root =doc.getDocumentElement();

		walk(root);

	}

	private static void walk(Node node) {
		for (Node ch = node.getFirstChild();   //指定されたノードの最初の子を取得して
				  ch != null;				   //子がいる限り
				  ch = ch.getNextSibling()) {  //兄弟をたどる
			System.out.println(ch.getNodeName());
			NamedNodeMap attr = ch.getAttributes();
			if(attr!=null){
				Node name = attr.getNamedItem("name");
				if(name!=null){
					System.out.println(name.getNodeValue());
				}
			}
			walk(ch);
		}
	}
}