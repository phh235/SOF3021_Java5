package com.example.demo.api;import org.springframework.http.ResponseEntity;import org.springframework.web.bind.annotation.GetMapping;import org.springframework.web.bind.annotation.RestController;@RestControllerpublic class HomeAPI {    @GetMapping("/getInformation")    public ResponseEntity<?>doGetInformation() {        return ResponseEntity.ok(null);    }}