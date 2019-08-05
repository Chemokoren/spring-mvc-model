package com.vega.springit.controller;

import com.vega.springit.domain.Link;
import com.vega.springit.repository.LinkRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/links")
public class LinkController {

    private LinkRepository linkRepository;

    public LinkController(LinkRepository linkRepository) {
        this.linkRepository = linkRepository;
    }

    //list
    @GetMapping("/")
    public List<Link> list() {
        return linkRepository.findAll();
    }

    //CRUD
    @PostMapping("/create")
    public Link create(@ModelAttribute Link link) {
        return linkRepository.save(link);
    }

    @GetMapping("/{id}")
    public Optional<Link> read(@PathVariable Long id) {
        return linkRepository.findById(id);
    }

    public Link create() {
        return null;
    }

    @PutMapping("/{id}")
    public Link update(@ModelAttribute Link link) {
        return linkRepository.save(link);
    }

    @DeleteMapping("/id")
    public Link delete(@PathVariable Long id) {
        return linkRepository.deleteById(id);
    }
}
