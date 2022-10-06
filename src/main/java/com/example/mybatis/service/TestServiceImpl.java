package com.example.mybatis.service;

import com.example.mybatis.dao.TestDAO;
import com.example.mybatis.vo.TestVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestDAO testDao;


    @Override
    public void insertDb(TestVO vo) {
        testDao.insertDb(vo);
    }
}
