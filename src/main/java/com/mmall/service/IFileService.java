package com.mmall.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by codeagles on 2017/7/27.
 */
public interface IFileService {

    String upload(MultipartFile file, String path);
}
