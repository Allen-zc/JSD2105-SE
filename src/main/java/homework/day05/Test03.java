package homework.day05;

import java.io.*;
import java.util.Scanner;

/**
 * 设计一个类:User
 * 里面有四个属性:String name,String pwd,String nick,int age
 * 定义get,set方法以及toString方法和构造方法
 * 
 * 单词记一记:
 * pwd   是单词password的缩写，是密码的意思
 * user  用户
 * 
 * 
 * 当前程序启动后要求用户顺序输入以上四个信息
 * 然后实例化一个User对象保存着四个信息并将
 * 该对象序列化到文件中。
 * 文件名的命名规则:用户名.obj
 * 比如该用户输入用户名为张三，那么这个对象
 * 序列化后的文件名为:张三.obj
 * 
 * 提高(选做):
 * 可以在用户输入信息后做必要的格式验证，比如4个信息是否
 * 都输入内容了。不能有空的。
 * 用户名只能包含字母数字下划线，并且1-32位
 * 
 * @author Xiloer
 *
 */
public class Test03 {
    public static void main(String[] args) throws IOException {
        System.out.println("请依次输入四个信息，分别为姓名，密码，昵称，年龄。用回车换行隔开");
        Scanner input = new Scanner(System.in);
        String inputname = input.nextLine();
        String inputpwd = input.nextLine();
        String inputnick = input.nextLine();
        int inputage = input.nextInt();

        String reges = "[0-9a-zA-Z_]{1,32}";

        if (inputname!=""&&inputpwd!=""&&inputnick!=""&&inputage!=0){
            if (inputname.matches(reges)){
                User user = new User(inputname,inputpwd,inputnick,inputage);
                String filename = new String(inputname + ".obj");
                FileOutputStream fos = new FileOutputStream(filename);
                ObjectOutputStream oos = new ObjectOutputStream(fos);

                oos.writeObject(user);
                System.out.println("对象创建成功！");
            }
        }

    }
}
class User implements Serializable{
    String name;
    String pwd;
    String nick;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public User(String name, String pwd, String nick, int age) {
        this.name = name;
        this.pwd = pwd;
        this.nick = nick;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                ", nick='" + nick + '\'' +
                ", age=" + age +
                '}';
    }
}