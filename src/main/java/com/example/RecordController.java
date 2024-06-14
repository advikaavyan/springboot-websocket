package com.example;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/records")
public class RecordController {

    @Autowired
    private DataService dataService;

    @GetMapping
    public ResponseEntity<List<String>> getRecords() {
        List<String> records = dataService.getRecords();
        return ResponseEntity.ok(records);
    }
}
