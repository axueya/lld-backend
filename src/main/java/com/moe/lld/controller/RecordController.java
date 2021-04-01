package com.moe.lld.controller;

import com.moe.lld.model.Record;
import com.moe.lld.service.RecordService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/record")
public class RecordController {

  private final RecordService recordService;

  public RecordController(RecordService recordService) {
    this.recordService = recordService;
  }

  @GetMapping
  public @ResponseBody
  Iterable<Record> getAllUsers() {
    return recordService.findAll();
  }


  @PostMapping
  public @ResponseBody
  Record addRecord(@RequestBody Record record) {
    return recordService.save(record);
  }

  @GetMapping(path = "/hello")
  public String hello() {
    return "lld";
  }

}

