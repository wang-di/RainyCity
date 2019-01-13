package com.wd.xyf.pojo;

import javax.persistence.*;

/**
 * @ClassName UserEntity
 * Description 用户pojo
 * @Author WD
 * @Date 2018/12/23 15:28
 * Version 1.0
 */

@Entity
@Table(name = "user", schema = "db_xyf")
public class UserEntity {

	@Id
	@GeneratedValue
	@Column(name = "n_id")
	private Long nid;

    @Column(name = "c_loginid")
    private String cLoginid;

    @Column(name = "c_password")
    private String cPassword;

	@Column(name = "c_name")
    private String cName;

	@Column(name = "n_age")
    private Integer nAge;

    public String getcLoginid() {
        return cLoginid;
    }

    public void setcLoginid(String cLoginid) {
        this.cLoginid = cLoginid;
    }

    public String getcPassword() {
        return cPassword;
    }

    public void setcPassword(String cPassword) {
        this.cPassword = cPassword;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public Integer getnAge() {
        return nAge;
    }

    public void setnAge(Integer nAge) {
        this.nAge = nAge;
    }
}