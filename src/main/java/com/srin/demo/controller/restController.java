package com.srin.demo.controller;

import java.util.List;

import com.srin.demo.model.mahasiswaModel;
import com.srin.demo.service.mahasiswaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mahasiswa")
public class restController {

  @Autowired
  private mahasiswaService service;

  @GetMapping("/")
  public List<mahasiswaModel> getAllMahasiswaModels() {
    return service.findAll();
  }

  @GetMapping("/name")
  public List<mahasiswaModel> getMahasiswaModelsByName(String name) {
    return service.findByName(name);
  }

}
