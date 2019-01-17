package com.wd.xyf.jpa;

import com.wd.xyf.pojo.LogEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

/**
 * @interface LogJPA
 * @Description TODO
 * @Author wangdi
 * @Date 2019/1/17 16:18
 * @Version 1.0
 **/
public interface LogJPA extends JpaRepository<LogEntity, String>, JpaSpecificationExecutor<LogEntity>, Serializable {

}
