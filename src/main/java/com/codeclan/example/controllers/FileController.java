package com.codeclan.example.controllers;

import com.codeclan.example.models.File;
import com.codeclan.example.repositories.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/files")
public class FileController {

    @Autowired
    FileRepository fileRepository;

    @GetMapping
    public List<File> getAllFiles() {
        return fileRepository.findAll();
    }

    @GetMapping("{id}")
    public Optional<File> getPirate(@PathVariable Long id){
        return fileRepository.findById(id);
    }

}
