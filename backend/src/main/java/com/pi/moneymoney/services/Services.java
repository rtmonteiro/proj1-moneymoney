package com.pi.moneymoney.services;

import java.util.List;

public interface Services<T> {
    
    List<T> findAll();
    T findById(String id);
    T save(T objecT);
}
