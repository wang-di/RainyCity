package com.wd.xyf.test;

import com.wd.xyf.pojo.UserEntity;
import org.junit.Test;

import javax.swing.text.html.Option;
import java.util.NoSuchElementException;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * @ClassName OptionalTest
 * @Description TODO
 * @Author wangdi
 * @Date 2019/1/15 16:01
 * @Version 1.0
 **/
public class OptionalTest {
	@Test
	public void createOptional() {
		Optional<UserEntity> emptyOpt = Optional.empty();
		emptyOpt.get();
	}

	@Test
	public void whenCreateEmptyOptional_thenNull() {
		Optional<UserEntity> emptyOpt = Optional.empty();
		emptyOpt.get();
	}

	@Test
	public void whenCreateOfEmptyOptional_thenNullPointerException() {
		Optional<UserEntity> opt = Optional.ofNullable(null);
		opt.get();
	}

	@Test
	public void whenCreateOfNullableOptional_thenOk() {
		String name = "John";
		Optional<String> opt = Optional.ofNullable(name);

		assertEquals("John", opt.get());
	}

	@Test
	public void whenCheckIfPresent_thenOk() {
		UserEntity userEntity = new UserEntity("wangdi");
		Optional<UserEntity> opt = Optional.ofNullable(userEntity);
		System.out.println(opt.isPresent());
		assertTrue(opt.isPresent());

		assertEquals(userEntity.getcName(), opt.get().getcName());
	}

}
