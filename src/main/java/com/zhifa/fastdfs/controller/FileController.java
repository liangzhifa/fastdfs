package com.zhifa.fastdfs.controller;

import com.zhifa.fastdfs.util.FastDFSUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
public class FileController {

    @Autowired
    private FastDFSUtil fastDFSUtil;

    @PostMapping("/uploadFile")
    public String uploadFile(MultipartFile file) throws IOException {
        String upload = fastDFSUtil.upload(file);
        return upload;
    }

}
