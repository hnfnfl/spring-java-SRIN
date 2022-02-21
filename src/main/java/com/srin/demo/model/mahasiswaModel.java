package com.srin.demo.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("mahasiswa")
public class mahasiswaModel {

  @Id
  private String id;

  private String name;
  private Integer age;
  private String domicile;
  private String gender;
  private List<Integer> matkul;

  public mahasiswaModel(String name, Integer age, String domicile, String gender, List<Integer> matkul) {
    this.name = name;
    this.age = age;
    this.domicile = domicile;
    this.gender = gender;
    this.matkul = matkul;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public String getDomicile() {
    return domicile;
  }

  public void setDomicile(String domicile) {
    this.domicile = domicile;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public List<Integer> getMatkul() {
    return matkul;
  }

  public void setMatkul(List<Integer> matkul) {
    this.matkul = matkul;
  }

  @Override
  public String toString() {
    return "mahasiswaModel {" +
        "id=" + id + ", name=" + name + ", age=" + age + ", domicile=" + domicile + ", gender= " + domicile
        + ", matkul= " + matkul + "}";
  }
}
