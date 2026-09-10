package dev.team1.contracts;

import java.util.List;

public interface IGenericGetService<T> {

    public List<T> getAll();
    public T getById(Long id);

}
