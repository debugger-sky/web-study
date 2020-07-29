package com.study.study.domain.fileupload.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tb_post")
@Getter
@Setter
public class TbPost {

    @Id
    @GeneratedValue
    @Column(name = "post_id")
    private Integer id;

    @Column(name = "title")
    private String title;

    @Column(name = "created_date")
    private Date createdDate;

    @Column(name = "modified_date")
    private Date modifiedDate;
}
