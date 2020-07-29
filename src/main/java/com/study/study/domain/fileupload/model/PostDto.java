package com.study.study.domain.fileupload.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

@Getter
@Setter
public class PostDto {

    private String title;
    private MultipartFile[] multipartFiles;
    private String text;

}
