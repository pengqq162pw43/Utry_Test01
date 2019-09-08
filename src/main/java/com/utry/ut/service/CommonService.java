package com.utry.ut.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.utry.ut.pojo.User;
import com.utry.ut.pojo.UserExample;

/**
 *
 * @版权: Copyright (c) 2016-2017 ****公司技术开发部
 * @author :Steven Liu
 * @E-mail:1661105301@qq.com
 * @版本: 1.0
 * @创建日期: 2018年1月2日 下午4:00:33
 * @ClassName CommonService
 * @类描述-Description: TODO T example, E HxDept
 * @修改记录:
 * @版本: 1.0
 */
public interface CommonService<Example, Pojo, Id> {
	
	
	long countByExample(Example example);

	int deleteByExample(Example example);

	
	int insert(Pojo record);

	int insertSelective(Pojo record);
    
	List<Pojo> selectByExample(Example example);

	int updateByExampleSelective(@Param("record") Pojo record, @Param("example") Example example);

	int updateByExample(@Param("record") Pojo record, @Param("example") Example example);

	
}
