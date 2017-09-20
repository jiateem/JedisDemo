package dom4j.test;

import java.util.ArrayList;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;


public class Dom4jTest {

	String theXml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><students><student><name>Tom  </name><age>12</age><sex>m</sex><pet></pet></student><student><name>Lily</name><age>11</age><sex>f</sex><pet/></student><student><name>Jack</name><age>13</age><sex>m</sex><pet>fish</pet></student></students>";
	String theXml2 = "<?xml version=\"1.0\" encoding=\"GBK\"?><padisPackage xmlns=\"http://www.chinapop.gov.cn/dataspec\"  xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"  xsi:schemaLocation=\"http://www.chinapop.gov.cn/dataspec\"  version=\"1.0\"><identity>    <serviceId>110212</serviceId>    <channelId>210000</channelId>    <globalBusinessId>#globalBusinessId</globalBusinessId>    <password>#password#</password>  </identity>  <contentControl>    <zip>      <isZip>false</isZip>      <zipType>zipType</zipType>    </zip>    <encrypt>      <isEncrypt>false</isEncrypt>      <encryptType>#encryptType#</encryptType>    </encrypt>    <code>      <isCode>false</isCode>      <codeType>#codeType#</codeType>    </code>  </contentControl>  <routerSession>    <paramList>      <name>desCId</name>      <value>000000</value>    </paramList>  </routerSession>  <businessContent>    <subPackage>      <id>id</id>      <content><![CDATA[<?xml version=\"1.0\" encoding=\"GBK\"?><cpXML cName=\"Э������\" name=\"padis_req_lg_xcxx\" version=\"CP2008\">  <fsSj>2016-06-20 00:00:00</fsSj>  <fkZhsj>2016-06-30 00:00:00</fkZhsj>  <xch></xch>  <xcFsnr>��Э��鿴��Ϣ��</xcFsnr>  <xcLxDm>1</xcLxDm>  <xcJjcdDm>2</xcJjcdDm>  <fsdXzqhDm>210102001000</fsdXzqhDm>  <jsdXzqhDm>110108014001</jsdXzqhDm>  <xcx>100;101;102</xcx>  <ylfvGaxxItem>    <csRq>1983-09-02</csRq>    <xm>�Է���</xm>    <sfzjHm>211202197801137126</sfzjHm>    <hjdXxDz>�й�����Ͻ������廪԰��¥</hjdXxDz>    <hjdXzqhDm>110108014000</hjdXzqhDm>    <hkxzDm>1</hkxzDm>    <mzDm>01</mzDm>    <hyzkDm>21</hyzkDm>    <xjzdXzqhDm>210102001002</xjzdXzqhDm>    <xjzdXxDz>����ʡ�����к�ƽ������ֵ�ˮԴ������</xjzdXxDz>    <sfldszBz>N</sfldszBz>    <zfXx>      <zfCsRq>1980-02-03</zfCsRq>      <zfXm>�ű�</zfXm>      <zfSfzjlxDm>10</zfSfzjlxDm>      <zfSfzjHm>370901198002038770</zfSfzjHm>      <zfMzDm>01</zfMzDm>      <zfHkxzDm>1</zfHkxzDm>      <zfHyzkDm>21</zfHyzkDm>      <zfHjdXzqhDm>350102001001</zfHjdXzqhDm>    </zfXx>    <syfwdj>      <hydjrq>2016-06-04</hydjrq>      <jbrdjsj>2016-06-22</jbrdjsj>      <yyzk>1</yyzk>      <hyzs>0</hyzs>      <Jbr>������</Jbr>      <Jbrdh>13231234543</Jbrdh>      <hcs>1</hcs>    </syfwdj>  </ylfvGaxxItem></cpXML>]]></content>      <paramList>        <name>desCId</name>        <value>value</value>      </paramList>    </subPackage>  </businessContent></padisPackage>";
	public void fnA() throws Exception{
		
		Document doc = DocumentHelper.parseText(theXml);
		Element rootEle = doc.getRootElement();
		System.out.println("xml==============="+rootEle.asXML());
		List<Element> stuEles = rootEle.elements("student");
		//String name1 = stuEles.get(1).elementText("name");
		//System.out.println(name1);
		
		List<Student> stuList = new ArrayList<Student>();
		for(Element ele : stuEles){
			System.out.println(ele.asXML());
			String name = ele.elementText("name");
			String age = ele.elementText("age");
			String sex = ele.elementText("sex");
			String pet = ele.elementText("pet");
			Student stu = new Student(name,age,sex,pet);
			stuList.add(stu);
		}
		
		for(Student stu : stuList){
			System.out.println(stu);
		}
		

		System.out.println(stuEles.get(0).element("no"));
		System.out.println(stuEles.get(0).element("name"));
		System.out.println(stuEles.get(0).element("name").getText());
		System.out.println(stuEles.get(0).element("name").getTextTrim());
		System.out.println(stuEles.get(0).element("pet").getText());
		System.out.println(stuEles.get(0).element("pet").getTextTrim());
		System.out.println(stuEles.get(1).element("pet").getText());
		System.out.println(stuEles.get(1).element("pet").getTextTrim());
		System.out.println(stuEles.get(1).element("pet").getTextTrim().equals(""));
		//System.out.println(stuEles.get(0).element("mom").elementText("momname"));
		System.out.println(stuEles.get(0).elementText("mom"));
			
		
	}
	
	
	

	
	
public static void main(String[] args) {
	Dom4jTest dTest = new Dom4jTest();
	try {
		dTest.fnA();
	} catch (Exception e) {
		// TODO: handle exception
		System.err.println(e);
	}
	
	
}
	
	
	
	
}
