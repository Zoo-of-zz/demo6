package com.example.demo3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import java.time.LocalDate;
111
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student implements Serializable {
                    private Integer studId;
                    private String name;
                    private String gender;
                    private LocalDate birthday;

    public void setPhone(java.lang.String phone) {
    }
}
