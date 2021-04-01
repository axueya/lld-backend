package com.moe.lld.database;

import com.moe.lld.model.Record;
import org.springframework.data.repository.CrudRepository;

public interface RecordRepository extends CrudRepository<Record, Integer> {

}
