package com.utry.ut.service.impl;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.utry.ut.mapper.TestUserMapper;
import com.utry.ut.pojo.TestUser;
import com.utry.ut.pojo.User;
import com.utry.ut.pojo.UserExample;

import com.utry.ut.service.TestUserService;


@Service
public class TestUserServiceImpl implements TestUserService {



	@Autowired
	TestUserMapper userMapper;

	@Override
	public long countByExample(com.utry.ut.pojo.TestUserExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByExample(com.utry.ut.pojo.TestUserExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(TestUser record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(TestUser record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<TestUser> selectByExample(com.utry.ut.pojo.TestUserExample example) {
		// TODO Auto-generated method stub
		return userMapper.selectByExample(example);
	}

	@Override
	public int updateByExampleSelective(TestUser record, com.utry.ut.pojo.TestUserExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByExample(TestUser record, com.utry.ut.pojo.TestUserExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
