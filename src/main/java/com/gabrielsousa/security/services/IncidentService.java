package com.gabrielsousa.security.services;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import com.gabrielsousa.security.domain.Incident;
import com.gabrielsousa.security.repository.IncidentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IncidentService {

    @Autowired
    private IncidentRepository repo;


    public Incident find(Integer id){
        Optional<Incident> obj = repo.findById(id);
        return obj.orElse(null);
    }
    public Incident insert(Incident obj){
        obj.setId(null);
        return repo.saveAndFlush(obj);
    }
    public Incident update(Incident obj){
        find(obj.getId());
        return repo.saveAndFlush(obj);
    }

    public void delete(Integer id){
        find(id);
        repo.deleteById(id);
    }


}
