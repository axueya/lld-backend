package com.moe.lld.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Record {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String title;
  private String category;
  private String tag;
  private String content;
}
