package com.everis.alicante.courses.beca.summer17.friendsnet.dao;

import com.everis.alicante.courses.beca.summer17.friendsnet.entity.FNEntity;

import java.io.Serializable;
import java.util.Set;

public interface EntityDAO<E extends FNEntity, ID extends Serializable> {

    Iterable<E> findAll();

    E findById(ID id);

    Iterable<E> findByIds(Set<ID> ids);

    E save(E e);

    Iterable<E> save(Iterable<E> es);

    E update(E e);

    Iterable<E> update(Iterable<E> es);

    void remove(E id);
}
