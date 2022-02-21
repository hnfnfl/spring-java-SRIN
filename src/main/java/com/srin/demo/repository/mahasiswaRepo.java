package com.srin.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.srin.demo.model.mahasiswaModel;
import java.util.List;

public interface mahasiswaRepo extends MongoRepository<mahasiswaModel, String> {

  List<mahasiswaModel> findByName(String name);

  List<mahasiswaModel> findAll();
}
