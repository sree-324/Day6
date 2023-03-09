package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.entity.child;
import com.example.demo.repo.childrepo;

@Service
public class ApiService {
    @Autowired
    childrepo cr;

    public List<child> getAllFuels() {
        return cr.findAll();
    }
    
    public List<child> getAllFuels(Sort sort) {
        return cr.findAll(sort);
    }

    

    public child createFuel(child childd) {
        return cr.save(childd);
    }

    public Page<child> showValues(int page,int no)
    {
    	Pageable p = PageRequest.of(page,no);
    	
    	return cr.findAll(p);
    }
	
}
