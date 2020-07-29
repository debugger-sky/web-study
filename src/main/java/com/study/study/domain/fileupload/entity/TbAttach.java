package com.study.study.domain.fileupload.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tb_attach")
@Getter
@Setter
public class TbAttach {

    @Id
    @GeneratedValue
    @Column(name = "attach_id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "path")
    private String path;

    @Column(name = "post_id")
    private String post_id;

    @Column(name = "created_date")
    private Date createdDate;

    @Column(name = "modified_date")
    private Date modifiedDate;

}
