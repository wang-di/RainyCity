package com.wd.xyf.validator;



import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * @interface CodeValidator
 * @Description 自定义单值代码验证器（只允许单值范围的值，比如：1,2,3）
 * 注解释义：@Retention：用来修饰注解，@Retention(RetentionPolicy.RUNTIME)：表示注解的信息被保留在class文件（字节码文件）中
 * 注解释义：@interface: 定义一个注解@Annotation
 * 注解释义：@Target: 修饰注解的元注解，表示被修饰注解的只用范围（方法、变量）
 * 注解释义：@Documented: 表明这个注释是由javadoc记录的，被修饰的类型的注释会成为公共API的一部分
 * @Author wangdi
 * @Date 2019/1/24 15:52
 * @Version 1.0
 **/
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.PARAMETER, ElementType.FIELD})
@Constraint(validatedBy = CodeValidatorImpl.class)
public @interface CodeValidator {

	//存储单值代码值，多个用“;”隔开
	String codes();

	//提示内容
	String message() default "code不存在";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
}
