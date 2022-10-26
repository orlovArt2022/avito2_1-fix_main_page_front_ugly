package com.amr.project;

import com.amr.project.webapp.controller.SearchAvitoRestContoller;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;


@ExtendWith(MockitoExtension.class)
public class MyTEst {

    @Test
    public void myTest() {
        Assertions.assertThat(counter("xxaabbcc")).isEqualTo("x2a2b2c2");
    }

    @Test
    public void MyTest2() {
        Assertions.assertThat(maxSum(new int[] {1,3,1,2})).isEqualTo(10);
    }

    public String counter(String stroka) {
        StringBuilder stringBuilder = new StringBuilder();
        Map<Character,Integer> map= new LinkedHashMap<>();
//        for(String i: stroka.split("")){
//            map.merge(i,1,(old,one)->old+one);
//        }
        for(int i =0; i<stroka.length();i++){
            map.merge(stroka.charAt(i),1,(o,n)->o+n);
        }
        map.forEach((k,v)-> stringBuilder.append(k).append(v));
        return stringBuilder.toString();
    }

    public int maxSum(int[] prices) {
        int max=0;
        int sum=0;
        for(int i: prices) {
            if (i>max) {
                max=i;
            }
            sum+=max;
        }
        return sum;
    }
}
