package org.socialsignin.spring.security.web.authentication.rememberme.springdata;
/*
 * Copyright 2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * Interface for provider specific spring-data repositories for persistent logins
 * 
 * @author Michael Lavelle
 */
@NoRepositoryBean
public interface PersistentLoginRepository<T extends PersistentLogin> extends
		CrudRepository<T, String> {

	public List<T> findByUsername(String username);
}
