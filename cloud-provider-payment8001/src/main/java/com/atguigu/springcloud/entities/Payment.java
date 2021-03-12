package com.atguigu.springcloud.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data       //自动get，set方法
@AllArgsConstructor     //自动合成全参数构造函数
@NoArgsConstructor      //自动生成无参构造函数
public class Payment implements Serializable {

    private Long id;
    private String serial;
}
