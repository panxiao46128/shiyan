package com.wu.pojo;

import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.format.DateTimeFormatter;
import java.util.Date;


@Data
@NoArgsConstructor

//员工表
public class Employee {
    private Integer id;
    private String lastName;
    private String email;
    private Integer gender;
    private Department department;

    private Date birth;

    public Employee(int id, String lastName, String email, Integer gender, Department department) {
        this.id = id;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.department = department;
        this.birth = new Date();
    }

    public void setBirth(String birth) {
        if (birth == null || "".equals(birth)) {
            this.birth = new Date();
        }else{
            // 将birth装换成date
            this.birth = DateUtil.parseDate(birth);
        }
    }
}
