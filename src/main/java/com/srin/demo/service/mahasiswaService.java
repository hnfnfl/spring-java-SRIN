package com.srin.demo.service;

import java.util.List;
import com.srin.demo.model.mahasiswaModel;

public interface mahasiswaService {

  List<mahasiswaModel> findAll();

  List<mahasiswaModel> findByName(String name);

}
