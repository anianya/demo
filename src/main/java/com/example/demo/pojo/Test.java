package com.example.demo.pojo;

import lombok.Builder;
import lombok.Data;

@Data(staticConstructor = "of")
@Builder
public class Test {
    private int id;
    private String name;
}
