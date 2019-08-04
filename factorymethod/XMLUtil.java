package designpatten.factorymethod;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

/**
 * @author hao
 * @title: XMLUtil
 * @projectName JavaDemo
 * @description: TODO
 * @date 2019/7/308:57
 */
public class XMLUtil {
    public static Object getBean() {
        try {
            //创建DOM文档对象
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document document = builder.parse(new File("src/designpatten/factorymethod/config.xml"));

            //获取包含类名的文本节点
            NodeList nl = document.getElementsByTagName("className");
            Node classNode = nl.item(0).getFirstChild();
            String name = classNode.getNodeValue();

            //通过类名生成实例对象并将其返回
            Class c = Class.forName(name);
            Object obj = c.newInstance();
            return obj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
