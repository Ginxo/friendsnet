package com.everis.alicante.courses.beca.summer17.friendsnet.manager;

import com.everis.alicante.courses.beca.summer17.friendsnet.entity.Person;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.PersonGroup;

public interface GroupManager extends Manager<PersonGroup, Long> {

    Iterable<Person> getByPersonId(Long personId);
}
