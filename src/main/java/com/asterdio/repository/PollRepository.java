package com.asterdio.repository;

import com.asterdio.model.Poll;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Admin on 12/27/2016.
 */
public interface PollRepository extends CrudRepository<Poll,Integer>
{
}
