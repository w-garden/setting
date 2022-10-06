package com.example.mybatis.dao;

import com.example.mybatis.vo.TestVO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TestDAOImpl implements TestDAO {
    @Autowired
    SqlSession sqlSession;
    @Override
    public void insertDb(TestVO vo) {
        sqlSession.insert("insert_db",vo);
    }
}
