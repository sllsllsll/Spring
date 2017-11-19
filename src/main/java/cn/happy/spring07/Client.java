package cn.happy.spring07;

/**
 * Created by linlin on 2017/7/26.
 */
public class Client {
    @Auto
    public static void say(String name ) {
        System.out.println("  ~~~~~~~~~~~  :  welcome : "+ name);
    }

    public static void main(final String[] args) throws Exception {
        final ParseMyAnnotation pm = new ParseMyAnnotation();
        pm.parseMethod(Client.class);
    }
}
