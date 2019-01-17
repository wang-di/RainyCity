package com.wd.xyf.jpa;

import com.wd.xyf.pojo.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

/**
 * @interface UserJPA
 * @Description TODO
 * @Author wangdi
 * @Date 2019/1/11 10:11
 * @Version 1.0
 **/
/**
 * JpaRepository：SpringDataJPA提供的简单数据操作接口
 * JpaSpecificationExecutor：SpringDataJPA提供的复杂查询接口
 * Serializable：序列化接口
 **/
public interface UserJPA extends JpaRepository<UserEntity, Long>, JpaSpecificationExecutor<UserEntity>, Serializable {

	void deleteByCLoginid(String loginId);
}
