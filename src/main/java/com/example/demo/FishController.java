package com.example.demo;// FishController.java
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fish")
public class FishController {

  private final FishService fishService;

  public FishController(FishService fishService) {
    this.fishService = fishService;
  }

  @GetMapping
  public List<Fish> getAllFish() {
    return fishService.getAllFish();
  }

  @PostMapping
  public Fish createFish(@RequestBody Fish fish) {
    return fishService.createFish(fish);
  }

  @GetMapping("/{id}")
  public Fish getFishById(@PathVariable Long id) {
    return fishService.getFishById(id);
  }

  @PutMapping("/{id}")
  public Fish updateFish(@PathVariable Long id, @RequestBody Fish fish) {
    return fishService.updateFish(id, fish);
  }

  @DeleteMapping("/{id}")
  public void deleteFish(@PathVariable Long id) {
    fishService.deleteFish(id);
  }
}

