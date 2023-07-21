package com.js.apps.library.api.repository;

import com.js.apps.library.api.model.Member;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MemberRepository extends MongoRepository<Member, String> {
}
