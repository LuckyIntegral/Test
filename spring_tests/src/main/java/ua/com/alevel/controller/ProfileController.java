package ua.com.alevel.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.com.alevel.entity.Profile;
import ua.com.alevel.service.ProfileService;

import java.util.Collection;

@RestController
@AllArgsConstructor
@RequestMapping("/profiles")
public class ProfileController {
    private final ProfileService profileService;

    @PutMapping("/{id}")
    public ResponseEntity<Boolean> update(@PathVariable Long id, @RequestBody Profile profile) {
        profileService.update(id, profile);
        return ResponseEntity.ok(true);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Profile> findById(@PathVariable Long id) {
        return ResponseEntity.ok(profileService.findById(id));
    }

    @GetMapping()
    public ResponseEntity<Collection<Profile>> findAll() {
        return ResponseEntity.ok(profileService.findAll());
    }
}
