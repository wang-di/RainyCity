package com.wd.xyf.controller;

import com.wd.xyf.pojo.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;
import java.util.Locale;

/**
 * @ClassName ValidateController
 * @Description TODO
 * @Author wangdi
 * @Date 2019/1/24 14:20
 * @Version 1.0
 **/
@RestController
public class ValidateController {


	//格式化错误下消息
	@Autowired
	private MessageSource messageSource;

	/**
	 * @Author wangdi
	 * @Description hibernate-validator的错误消息支持国际化，获取错误消息的时候传入Locale对象获取本地的国际化类型
	 * @Date 2019/1/24 15:40
	 * @Param [userEntity, bindingResult]
	 * @return java.lang.String
	 **/
	@RequestMapping(value = "/validator")
	public String validator(@Valid UserEntity userEntity, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			StringBuffer msg = new StringBuffer();
			//获取错误字段集合
			List<FieldError> fieldErrorList = bindingResult.getFieldErrors();
			//获取本地locale，zh_CN
			Locale currentLocale = LocaleContextHolder.getLocale();

			for (FieldError error : fieldErrorList) {
				//获取错误信息
				String errorMsg = messageSource.getMessage(error, currentLocale);
				//添加到错误消息集合内
				msg.append(error.getField() + ": " + errorMsg + ", ");
			}
			return msg.toString();
		}
		return "验证通过";
	}
}
