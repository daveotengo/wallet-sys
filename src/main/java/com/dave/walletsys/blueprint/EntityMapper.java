package com.dave.walletsys.blueprint;

import java.util.List;

public interface EntityMapper<D,E>{
    public E toEntity( D dto);
    public D toDto(E entity);
    public List<E> toEntity(List<D> dto);
    public List<D> toDto(List<E> entity);
}
