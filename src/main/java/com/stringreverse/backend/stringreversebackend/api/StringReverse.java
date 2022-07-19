package com.stringreverse.backend.stringreversebackend.api;

import com.stringreverse.backend.stringreversebackend.model.Payload;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
  public ResponseEntity create(@RequestBody Payload p) {
    String r = p.toString();
    return ResponseEntity.ok(r);
  }



}
