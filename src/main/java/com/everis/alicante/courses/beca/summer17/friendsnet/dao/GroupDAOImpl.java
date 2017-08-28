package com.everis.alicante.courses.beca.summer17.friendsnet.dao;

import com.everis.alicante.courses.beca.summer17.friendsnet.entity.PersonGroup;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.Person;
import org.springframework.stereotype.Service;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

@Service
public class GroupDAOImpl extends AbstractDAO<PersonGroup, Long> implements GroupDAO {
    @Override
    public PersonGroup addPersons(Iterable<Person> persons) {
        return null;
    }

    public Iterable<Person> getByPersonId(Long personId) {
        return null;
    }
}
