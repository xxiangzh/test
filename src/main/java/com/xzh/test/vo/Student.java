package com.xzh.test.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author 向振华
 * @date 2019/04/22 14:55
 */
@Accessors(chain = true)//链式编程
@Builder//建造支持
@Data//get&set&toString
@NoArgsConstructor//无参构造
@AllArgsConstructor//全参构造
public class Student {
    private String name;
    private Integer age;
}
