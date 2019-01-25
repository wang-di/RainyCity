package com.wd.xyf.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @ClassName CodeValidatorImpl
 * @Description 单值代码验证器实现类
 * @Author wangdi
 * @Date 2019/1/24 15:55
 * @Version 1.0
 **/
public class CodeValidatorImpl implements ConstraintValidator<CodeValidator, Object> {

	//保存所有单值
	private String codes;

	@Override
	public void initialize(CodeValidator codeValidator) {
		//将注解内配置的值赋值给临时变量
		this.codes = codeValidator.codes();
	}

	@Override
	public boolean isValid(Object obj, ConstraintValidatorContext constraintValidatorContext) {

		//为空不验证，默认验证通过
		if (obj == null) {
			return true;
		}
		String[] codeArray = codes.split(";");
		for (int i = 0; i < codeArray.length; i++) {
			if (codeArray[i].equals(String.valueOf(obj))) {
				return true;
			}
		}
		return false;
	}
}
