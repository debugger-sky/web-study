package com.study.study.domain.fileupload.controller;

import com.study.study.domain.fileupload.model.PostDto;
import lombok.extern.slf4j.Slf4j;
import net.coobird.thumbnailator.Thumbnailator;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.annotation.MultipartConfig;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.UUID;

@Slf4j
@RestController
public class FileUploadController {

    private final String uploadForlder = "C:\\SKY\\test";

    @PostMapping(value = "/uploadPost")
    public ResponseEntity<String> uploadPost(PostDto postDto) {
        // 1. 파일 저장

        // 2. 글 db 저장

        return new ResponseEntity<>("success", HttpStatus.OK);
    }

    @PostMapping(value = "/uploadAjaxAction")
    public ResponseEntity<String> uploadAjaxPost(MultipartFile[] multipartFiles) throws IOException {
        for(MultipartFile multipartFile : multipartFiles) {
            File uploadPathFile = new File(uploadForlder);

            String originName = multipartFile.getOriginalFilename();
            log.info(originName);
            originName = originName.substring(originName.lastIndexOf("\\") + 1);

            UUID uuid = UUID.randomUUID();
            String saveFileName = uuid.toString() + "_" + originName;

            File destFile = new File(uploadPathFile, saveFileName);
            multipartFile.transferTo(destFile);

            log.info("check!");

            FileOutputStream fileOutputStream = new FileOutputStream(new File(uploadPathFile, "s_" + saveFileName));
            Thumbnailator.createThumbnail(new FileInputStream(destFile), fileOutputStream, 100, 100);
            fileOutputStream.close();
        }
        return new ResponseEntity<>("good", HttpStatus.OK);
    }
}
