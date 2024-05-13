package org.example.lab2.api;import org.example.lab2.entity.Student;import org.springframework.http.ResponseEntity;import org.springframework.web.bind.annotation.*;import java.util.HashMap;import java.util.Map;@RestControllerpublic class HomeApi {    @GetMapping("/getInformation")    public ResponseEntity<?> doGetInformation(@RequestParam("ten") String name,                                              @RequestParam("tuoi") String age) {        Map<String, String> result = new HashMap<String, String>();        result.put("ten", name);        result.put("tuoi", age);        result.put("lop hoc", "Java 5");        result.put("status", "Đã nhận thông tin thành công");        return ResponseEntity.ok(result);    }    @GetMapping("/getInformationWithPathVariable/{name}")    public ResponseEntity<?> doGetInformationWithPathVariable(@PathVariable String name) {        String message = "Đã nhận thông tin thành công cho " + name;        return ResponseEntity.ok(message);    }    @PostMapping("/getStudent")    public ResponseEntity<Student[]> doGetStudent(@RequestBody Student[] students) {        return ResponseEntity.ok(students);    }}