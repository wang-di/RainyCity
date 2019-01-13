package com.wd.xyf.mapper;

import com.wd.xyf.pojo.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {

	@Select("select * from db_xyf.user")
	List<UserEntity> selectAll();
}