package com.example.mybatis.persistence;

import com.example.mybatis.dao.TestDAOImpl;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
public class TimeMapperTest {
    @Autowired
    private TestDAOImpl testDAO;


    @Test
    public void testGetTime2() {
        System.out.println("굳굳굳22");
        System.out.println("날짜 출력            :            " +testDAO);
    }

    @Test
    public void test11(){
        //System.out.println("아이디 출력   :" +  timeMapper.getTime2());
    }
}