package com.example.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.book.model.Bus;
public interface BusRepository extends JpaRepository<Bus,Integer> {

}