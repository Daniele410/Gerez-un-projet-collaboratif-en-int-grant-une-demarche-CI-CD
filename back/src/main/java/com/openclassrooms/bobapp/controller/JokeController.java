package com.openclassrooms.bobapp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.openclassrooms.bobapp.service.JokeService;
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
@RestController
@RequestMapping("api/joke")
public class JokeController {

    private final JokeService jokeService;

    JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @GetMapping()
    public ResponseEntity<?> getRandomJokes() {
        return ResponseEntity.ok(this.jokeService.getRandomJoke());
    }
}
