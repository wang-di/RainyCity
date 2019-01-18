package com.wd.xyf.pojo;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

/**
 * @ClassName LogEntity
 * @Description 日志实体类
 * @Author wangdi
 * @Date 2019/1/16 14:33
 * @Version 1.0
 **/
@Entity
@Table(name = "t_log", schema = "db_xyf")
public class LogEntity {

	@Id
	@GeneratedValue(generator = "paymentableGenerator")
	@GenericGenerator(name = "paymentableGenerator", strategy = "uuid")
	@Column(name = "c_id")
	private String id;

	//客户端请求ip
	@Column(name = "c_client_ip")
	private String client_ip;

	//客户端请求路径
	@Column(name = "c_uri")
	private String uri;

	//终端请求方式(普通请求、ajax请求)
	@Column(name = "c_type")
	private String type;

	//session标识
	@Column(name = "c_session_id")
	private String sessionId;

	//请求方式(get、post)
	@Column(name = "c_method")
	private String method;

	//请求参数内容json
	@Column(name = "c_params")
	private String params;

	//请求时间
	@Column(name = "dt_request_time")
	private Timestamp requestTime;

	//请求返回时间
	@Column(name = "dt_return_time")
	private Timestamp returnTime;

	//返回码
	@Column(name = "n_return_code")
	private Integer returnCode;

	//接口返回数据json
	@Column(name = "c_return_data")
	private String returnData;

	//请求耗时
	@Column(name = "n_cost_time")
	private Long costTime;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getClient_ip() {
		return client_ip;
	}

	public void setClient_ip(String client_ip) {
		this.client_ip = client_ip;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getParams() {
		return params;
	}

	public void setParams(String params) {
		this.params = params;
	}

	public Timestamp getRequestTime() {
		return requestTime;
	}

	public void setRequestTime(Timestamp requestTime) {
		this.requestTime = requestTime;
	}

	public Timestamp getReturnTime() {
		return returnTime;
	}

	public void setReturnTime(Timestamp returnTime) {
		this.returnTime = returnTime;
	}

	public Integer getReturnCode() {
		return returnCode;
	}

	public void setReturnCode(Integer returnCode) {
		this.returnCode = returnCode;
	}

	public String getReturnData() {
		return returnData;
	}

	public void setReturnData(String returnData) {
		this.returnData = returnData;
	}

	public Long getCostTime() {
		return costTime;
	}

	public void setCostTime(Long costTime) {
		this.costTime = costTime;
	}
}
