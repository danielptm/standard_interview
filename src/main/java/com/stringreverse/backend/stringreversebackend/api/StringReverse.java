package com.stringreverse.backend.stringreversebackend.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stringreverse")
public class StringReverse {

  @GetMapping
  public ResponseEntity health() {
    return ResponseEntity.ok("String reverse backend is up");
  }

  @PostMapping
  public ResponseEntity create() {
    return null;
  }



}
