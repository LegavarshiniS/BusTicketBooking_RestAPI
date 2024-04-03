package com.example.book.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.book.model.Bus;
import com.example.book.repository.BusRepository;

import java.util.List;
@Service
public class BusService {
     @Autowired
     BusRepository ev;
     public Bus create(Bus e){
      return ev.save(e);
     }
     public List<Bus> getAll(){
      return ev.findAll();
     }
     public Bus getId(int eid){
      return ev.findById(eid).orElse(null);
     }
     public boolean update(int eid,Bus ee){
          if(this.getId(eid)==null)
          {
              return false;
          }
          try{
              ev.save(ee);
          }
          catch(Exception ex)
          {
              return false;
          }
          return  true;
     }
     public boolean delete(int eid){
          if(this.getId(eid)==null){
             return false;
          }
          ev.deleteById(eid);
          return true;
     }
} 