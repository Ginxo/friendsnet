package com.everis.alicante.courses.beca.summer17.friendsnet.dao;

import com.everis.alicante.courses.beca.summer17.friendsnet.entity.PostLike;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.Post;

public interface PostDAO extends EntityDAO<Post, Long>  {

    Post addLike(PostLike postLike);
}
