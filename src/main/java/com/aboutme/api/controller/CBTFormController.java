package com.aboutme.api.controller;

import com.aboutme.api.model.CBTForm;
import com.aboutme.api.service.CBTFormService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/cbtform")
@RequiredArgsConstructor
public class CBTFormController {
    private final CBTFormService cbtFormService;

    @GetMapping
    public ResponseEntity<CBTForm> read(@RequestParam String id) {
        return ResponseEntity.ok(cbtFormService.read(id));
    }

    @PostMapping
    public ResponseEntity<CBTForm> add(@RequestBody CBTForm cbtForm) {
        return ResponseEntity.ok(cbtFormService.save(cbtForm));
    }

    @PatchMapping
    public ResponseEntity<CBTForm> edit(@RequestBody CBTForm cbtForm) {
        return ResponseEntity.ok(cbtFormService.save(cbtForm));
    }

    @DeleteMapping
    public ResponseEntity remove(@RequestParam String id) {
        cbtFormService.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
