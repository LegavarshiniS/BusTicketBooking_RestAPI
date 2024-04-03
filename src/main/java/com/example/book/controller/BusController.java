package com.example.book.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.book.model.Bus;
import com.example.book.service.BusService;




@RestController
public class BusController {
    @Autowired
    BusService ev;
    @PostMapping("/post/bus")
    public ResponseEntity<Bus>addelements(@RequestBody Bus m)
    {
        Bus evt=ev.create(m);
        return new ResponseEntity<>(evt,HttpStatus.CREATED);
    }
    @GetMapping("/get/bus")
    public ResponseEntity<List<Bus>> showinfo()
    {
        return new ResponseEntity<>(ev.getAll(),HttpStatus.OK);
    }
    @GetMapping("/get/bus/{eid}")
    public ResponseEntity<Bus> getById(@PathVariable Integer eid)
    {
        Bus obj=ev.getId(eid);
        return new ResponseEntity<>(obj,HttpStatus.OK);
    }
    @PutMapping("/put/{eid}")
    public ResponseEntity<Bus> putMethodName(@PathVariable("eid") int eid, @RequestBody Bus e) {
        if(ev.update(eid,e) == true)
        {
            return new ResponseEntity<>(e,HttpStatus.OK);
        }
        
        return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
        
    }
    @DeleteMapping("/delete/{eid}")
    public ResponseEntity<Boolean> delete(@PathVariable("eid") int eid)
    {
        if(ev.delete(eid) == true)
        {
            return new ResponseEntity<>(true,HttpStatus.OK);
        }
        return new ResponseEntity<>(false,HttpStatus.NOT_FOUND);
    }
   
}

