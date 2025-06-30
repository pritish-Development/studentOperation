package com.student_operation.student_operation.controller;

import com.student_operation.student_operation.entity.TwoNumber;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/num")
public class GraterNumberController {

    @PostMapping("/")
    public String findGrater(@RequestBody TwoNumber twoNumber){
//        System.out.println("Num1"+twoNumber.getNum1());
//        System.out.println("Num2"+twoNumber.getNum2());
//        return twoNumber.getNum1()>twoNumber.getNum2()?twoNumber.getNum1()+" is grater number":twoNumber.getNum2()+" is grater number";
        int a = twoNumber.getNum1();
        int b = twoNumber.getNum2();

        if(a>b){
            return a+" number is grater";
        }else {
            return b+" number is grater";
        }
    }
}

