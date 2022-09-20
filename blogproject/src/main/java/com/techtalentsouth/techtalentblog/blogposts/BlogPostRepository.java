package com.techtalentsouth.techtalentblog.blogposts;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
//cole
@Repository
public interface BlogPostRepository extends CrudRepository<BlogPost, Long> {
	@Override
	public List<BlogPost> findAll(); 
	
}
