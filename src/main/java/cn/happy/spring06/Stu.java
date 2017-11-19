package cn.happy.spring06;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by linlin on 2017/7/26.
 */
@Component("stu")
public class Stu {
    @Value("苏苏")
    private String name;
   /* @Resource(name="car")*/
   @Autowired
   @Qualifier("car")
    private Car car;

    public Stu() {
    }

    @Override
    public String toString() {
        return "Stu{" +
                "name='" + name + '\'' +
                ", car=" + car +
                '}';
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
