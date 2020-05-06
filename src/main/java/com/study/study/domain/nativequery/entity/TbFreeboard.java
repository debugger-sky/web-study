package com.study.study.domain.nativequery.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tb_freeboard")
@Getter
@Setter
public class TbFreeboard {

    @Id
    @GeneratedValue
    @Column(name = "freeboard_id")
    private Integer id;

    @Column(name = "title")
    private String title;

    @Column(name = "created_date")
    private Date createdDate;

    @Column(name = "family")
    private String family;

    @Column(name = "modified_date")
    private Date modifiedDate;

    @Column(name = "order_by")
    private Integer orderBy;
}
