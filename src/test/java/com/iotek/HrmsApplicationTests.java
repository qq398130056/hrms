package com.iotek;

import com.iotek.dao.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan("com.iotek.dao")
public class HrmsApplicationTests {
    @Autowired
	UserMapper userMapper;
	@Test
	public void contextLoads() {
		System.out.println(userMapper.selectByAccountAndPassword("123456","123456"));
	}

}
