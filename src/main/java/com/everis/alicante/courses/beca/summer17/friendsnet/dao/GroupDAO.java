package com.everis.alicante.courses.beca.summer17.friendsnet.dao;

import com.everis.alicante.courses.beca.summer17.friendsnet.entity.PersonGroup;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.Person;

public interface GroupDAO extends EntityDAO<PersonGroup, Long>  {

    PersonGroup addPersons(Iterable<Person> persons);

    Iterable<Person> getByPersonId(Long personId);

}
