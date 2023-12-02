package com.example.demo;

import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Optional;

@Mapper
public interface FishMapper {

  @Select("SELECT * FROM fish")
  List<Fish> findAll();

  @Insert("INSERT INTO fish (name, color) VALUES (#{name}, #{color})")
  @Options(useGeneratedKeys = true, keyProperty = "id")
  Fish save(Fish fish);

  @Select("SELECT * FROM fish WHERE id = #{id}")
  Optional<Fish> findById(Long id);

  @Update("UPDATE fish SET name = #{name}, color = #{color} WHERE id = #{id}")
  void update(Fish fish);

  @Delete("DELETE FROM fish WHERE id = #{id}")
  void deleteById(Long id);
}
