package com.wd.xyf.controller;

import com.wd.xyf.constant.RequestConsts;
import com.wd.xyf.utils.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.UUID;

/**
 * @ClassName UploadController
 * @Description 上传控制器
 * @Author wangdi
 * @Date 2019/1/18 16:28
 * @Version 1.0
 **/
@RestController
public class UploadController {
	Logger logger = LoggerFactory.getLogger(UploadController.class);

	@RequestMapping(value = "/upload", method = RequestMethod.POST)
	public String uploads(HttpServletRequest request, MultipartFile[] file) {
		String result = "上传成功";
		try {
			//上传目录地址
			String uploadPath = request.getServletContext().getRealPath("/") + "upload/";
			File uploadDir = new File(uploadPath);
			if (!uploadDir.exists()) {
				uploadDir.mkdir();
			}
			for (int i = 0; i < file.length; i++) {
				if (file[i] != null && !file[i].isEmpty()) {
					uploadFile(uploadPath, file[i]);
				}
			}
		} catch (Exception e) {
			logger.error("上传文件失败：", e);
			result = "上传失败";
		}

		request.setAttribute(RequestConsts.LOG_RETURN, result);
		return result;
	}


	/**
	 * @Author wangdi
	 * @Description 上传文件
	 * @Date 2019/1/18 18:28
	 * @Param [uploadPath, file]
	 **/
	public void uploadFile(String uploadPath, MultipartFile file) throws Exception {
		//文件名后缀
		String suffix = FileUtils.getSuffix(file.getOriginalFilename());
		//生成随机文件名
		String fileName = UUID.randomUUID().toString() + suffix;
		//服务器端保存文件对象
		File saveFile = new File(uploadPath + fileName);
		//将上传文件写入到服务器端文件
		file.transferTo(saveFile);
	}
}
