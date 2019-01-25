package com.wd.xyf.jpa;

import com.wd.xyf.base.BaseRepository;
import com.wd.xyf.pojo.UserEntity;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @interface UserJPA
 * @Description 用户持久化操作
 * @Author wangdi
 * @Date 2019/1/11 10:11
 * @Version 1.0
 **/
/**
 * JpaRepository：SpringDataJPA提供的简单数据操作接口
 * JpaSpecificationExecutor：SpringDataJPA提供的复杂查询接口
 * Serializable：序列化接口
 **/
public interface UserJPA extends BaseRepository<UserEntity, Long> {

	void deleteByLoginid(String loginId);

	/**
	 * @Author wangdi
	 * @Description @Query是用来配置自定义SQL的注解，nativeQuery=true才是表明使用原生sql
	 * @Date 2019/1/23 10:22
	 * @Param [age]
	 * @return java.util.List<com.wd.xyf.pojo.UserEntity>
	 **/
	@Query(value = "select * from db_xyf.t_user where n_age > ?", nativeQuery = true)
	List<UserEntity> queryByAge(int age);

	/**
	 * @Author wangdi
	 * @Description @Transactional：SpringDataJPA自定义sql需要添加事物注解，开启事物自动化管理  @Modifying：和@Query配合使用可以完成数据的删除、添加、更新操作
	 * @Date 2019/1/23 14:44
	 * @Param [name, password]
	 * @return int
	 **/
	@Transactional
	@Modifying
	@Query(value = "delete from db_xyf.t_user where c_name = ?1 and c_password = ?2", nativeQuery = true )
	int nq_deleteUser(String name, String password);
}
