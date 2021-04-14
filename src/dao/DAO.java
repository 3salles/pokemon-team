package dao;

import java.util.List;

public interface DAO<T> {
    void add (T o);
    
    List<T> getPokemons();
    
}
