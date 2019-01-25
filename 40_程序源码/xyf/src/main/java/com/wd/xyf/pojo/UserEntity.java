package com.wd.xyf.pojo;

import com.wd.xyf.base.BaseEntity;
import com.wd.xyf.validator.CodeValidator;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

/**
 * @ClassName UserEntity
 * Description 用户pojo
 * @Author WD
 * @Date 2018/12/23 15:28
 * Version 1.0
 */

@Entity
@Table(name = "t_user", schema = "db_xyf")
public class UserEntity extends BaseEntity {

	public UserEntity() { }

	public UserEntity(String name) {
		this.name = name;
	}

	@Id
	@GeneratedValue
	@Column(name = "n_id")
	private Long id;

    @Column(name = "c_loginid")
	@NotBlank
    private String loginid;

    @Column(name = "c_password")
	@NotBlank
    private String password;

	@Column(name = "c_name")
    private String name;

	@Column(name = "n_age")
	@Min(value = 1)
    private Integer age;

	@Column(name = "n_is_vip")
	@CodeValidator(codes = "1;2")
	private Integer isVip;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLoginid() {
		return loginid;
	}

	public void setLoginid(String loginid) {
		this.loginid = loginid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getIsVip() {
		return isVip;
	}

	public void setIsVip(Integer isVip) {
		this.isVip = isVip;
	}
}