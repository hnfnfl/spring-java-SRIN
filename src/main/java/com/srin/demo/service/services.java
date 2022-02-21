package com.srin.demo.service;

import java.util.List;

import com.srin.demo.model.mahasiswaModel;
import com.srin.demo.repository.mahasiswaRepo;

import org.springframework.beans.factory.annotation.Autowired;

public class services implements mahasiswaService {

  @Autowired
  private mahasiswaRepo repo;

  @Override
  public List<mahasiswaModel> findAll() {
    return repo.findAll();
  }

  @Override
  public List<mahasiswaModel> findByName(String name) {
    return repo.findByName(name);
  }

}
