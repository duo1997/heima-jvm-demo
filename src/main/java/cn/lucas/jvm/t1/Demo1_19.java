package cn.lucas.jvm.t1;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;

import javax.xml.ws.spi.ServiceDelegate;
import java.util.Arrays;
import java.util.List;

/**
 * json数据转换导致的异常
 *
 * @author liujie
 * @date 2022-06-17 13:51
 **/
public class Demo1_19 {
    public static void main(String[] args) throws JsonProcessingException {
        Dept dept = new Dept();
        dept.setName("Market");

        Emp e1 = new Emp();
        e1.setName("zhang");
        e1.setDept(dept);

        Emp e2 = new Emp();
        e2.setName("li");
        e2.setDept(dept);

        dept.setEmps(Arrays.asList(e1,e2));

        ObjectMapper om = new ObjectMapper();
        System.out.println(om.writeValueAsString(dept));
    }
}

@Data
class Emp {
    private String name;

    private Dept dept;
}

@Data
class Dept {
    private String name;
    private List<Emp> emps;
}
