package com.moe.lld.service;

import com.moe.lld.database.RecordRepository;
import com.moe.lld.model.Record;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecordService {
  private final RecordRepository recordRepository;

  public RecordService(RecordRepository recordRepository) {
    this.recordRepository = recordRepository;
  }

  public Record save(Record record) {
    return recordRepository.save(record);
  }

  public Iterable<Record> findAll() {
    return recordRepository.findAll();
  }
}
