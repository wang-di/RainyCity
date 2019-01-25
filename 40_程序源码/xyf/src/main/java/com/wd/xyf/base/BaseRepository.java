package com.wd.xyf.base;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

/**
 * @interface BaseRepository
 * @Description @NoRepositoryBean:配置在继承了JpaRepository接口以及其他SpringDataJpa内部的接口的子接口时，子接口不被作为一个Repository创建代理实现类
 * @Author wangdi
 * @Date 2019/1/23 15:00
 * @Version 1.0
 **/
@NoRepositoryBean
public interface BaseRepository<T, PK extends Serializable> extends JpaRepository<T, PK>, JpaSpecificationExecutor<T> {

}
