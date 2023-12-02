package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FishService {

  private final FishMapper fishMapper;

  public FishService(FishMapper fishMapper) {
    this.fishMapper = fishMapper;
  }

  public List<Fish> getAllFish() {
    List<Fish> fishList = fishMapper.findAll();
    return fishList;
  }

  public Fish createFish(Fish fish) {
    // 作成ロジックを実装
    return fishMapper.save(fish);
  }

  public Fish getFishById(Long id) {
    // IDを使用してFishを取得するロジックを実装
    return fishMapper.findById(id).orElse(null);
  }

  public Fish updateFish(Long id, Fish fish) {
    // IDを使用してFishを更新するロジックを実装
    // 更新後のFishオブジェクトを返す
    return fishMapper.save(fish);
  }

  public void deleteFish(Long id) {
    // IDを使用してFishを削除するロジックを実装
    fishMapper.deleteById(id);
  }
}
