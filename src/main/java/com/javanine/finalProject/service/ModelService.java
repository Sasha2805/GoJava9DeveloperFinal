package com.javanine.finalProject.service;

import java.util.List;

public interface ModelService<R, S, ID> {

    R save(S t);

    R findById(ID id);

    List<R> findAll(int page, int offset);

    R update(S t);

    void deleteById(ID id);
}
