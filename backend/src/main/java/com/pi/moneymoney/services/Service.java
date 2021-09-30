package com.pi.moneymoney.services;

import java.util.List;

public interface Service<T> {
    
    List<T> findAll();
    T findById(Integer id);
    T save(T objecT);
}
