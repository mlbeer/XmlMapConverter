package test;

import sviolet.xmlmapconverter.XmlMapConverter;

import java.util.Map;

/**
 * Created by S.Violet on 2016/3/29.
 */
public class TestCase {

    private static final String xml = "" +
            "<?xml version=\"1.0\" encoding=\"GBK\"?>" +
            "<Document>" +
            "<Head>" +
            "<TransactionId>query1</TransactionId>" +
            "<TransactionId>query2</TransactionId>" +
            "<TransactionId>query3</TransactionId>" +
            "</Head>" +
            "<Body>" +
            "body1" +
            "</Body>" +
            "<Body>" +
            "<account>" +
            "<accountName>achello</accountName>" +
            "<accountNo>acno</accountNo>" +
            "</account>" +
            "<name>hello</name>" +
            "</Body>" +
            "<Ex>" +
            "<AList>" +
            "<BList>blistcontent1</BList>" +
            "<BList>blistcontent2</BList>" +
            "</AList>" +
            "<AList>" +
            "<BList>blistcontent3</BList>" +
            "<BList>blistcontent4</BList>" +
            "</AList>" +
            "</Ex>" +
            "</Document>";


    public static void main(String[] args) {
        try {
            Map map = XmlMapConverter.xmlToMap(xml);
            System.out.println(map);
            String str = XmlMapConverter.mapToXml(map, "Doc");
            System.out.println(str);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }



}
