package com.nt.text;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import com.nt.beans.A;
public class CyclicInjectionTest {
public static void main(String[] args) {
	XmlBeanFactory factory=new XmlBeanFactory(new FileSystemResource("src/com/nt/cfgs/applicationContext.xml"));
	A a=(A)factory.getBean("a1");
	System.out.println(a);
}
}
