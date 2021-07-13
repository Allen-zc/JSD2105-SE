package xml;


import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.List;

public class ParseXmlDemo {
    public static void main(String[] args){
        /**
         * 解析XML文档的大致步骤：
         * 1.创建SAXReader
         * 2.使用SAXReader读取xml文档并生成Document对象
         * 3.通过Document对象获取根元素（根标签）
         * 4.从根标签开始逐级获取子标签最终达到解析XML数据目的
         */

        try {

            //1
            SAXReader reader = new SAXReader();

            //2
            Document doc = reader.read("./userList.xml");

            //3
            /**
             * Element类的每一个实例用于表示XML文档中的一个元素（一对标签）
             * 它提供了一组获取元素相关信息的方法，常用的有：
             *
             * String getName()
             * 获取元素名字
             *
             * String getText()
             * 获取元素体的文本数据（开始与结束标签之间的文本信息）
             *
             * Element element(String name)
             * 获取当前元素中指定名字的子元素
             *
             * List elements()
             * 获取当前元素中的所有子元素
             *
             * List elements(String name)
             * 获取当前元素中所有同名子元素（指定的名字）
             *
             */

            /**
             * 获取根元素
             */
            Element root = doc.getRootElement();    //.getRootElement()     获取根元素

            System.out.println("根元素：" + root.getName());

            /**
             * 通过跟标签获取其所有名为<emp>的子标签
             */
            List<Element> empList = root.elements("emp");
            System.out.println(empList.size());

            /**
             * 遍历每一个员工标签<emp>
             */
            for (Element empEle : empList) {

                /**
                 * 获取<name>标签
                 */
                Element nameEle = empEle.element("name");

                /**
                 * 获取<name>标签中间的文本
                 */
                String name = nameEle.getText();        //.getText()    获取标签中间的文本

                /**
                 * 获取年龄
                 */
                Element ageEle = empEle.element("age");     //.element（属性）  获取文本
                int age = Integer.parseInt(ageEle.getText());

                /**
                 * 获取性别
                 */
//                Element genderEle = empEle.element("gender");
//                String gender = genderEle.getText();

//                String gender = empEle.element("gender").getText();

                String gender = empEle.elementText("gender");       //.elementText(属性)  获取标签属性的文本

                /**
                 * 获取工资
                 */
                int salary = Integer.parseInt(empEle.elementText("salary"));

                /**
                 * 获取<emp>标签的属性“id”的值
                 */
//                Attribute attr = empEle.attribute("id");
//                int id = Integer.parseInt(attr.getValue());

//                int id = Integer.parseInt(empEle.attribute("id").getValue());

                int id = Integer.parseInt(empEle.attributeValue("id"));     //.attributeValue（属性）   获取标签属性的值

                System.out.println(name + "," + age + "," + gender + "," + salary);
            }


        } catch (DocumentException e) {
            e.printStackTrace();
        }

    }
}
