package com.rekj.core.web.security;

import java.util.Collection;
import java.util.Properties;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.access.AccessDecisionManager;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.authentication.InsufficientAuthenticationException;
import org.springframework.security.core.Authentication;

public class GenericAccessDecisionManager implements AccessDecisionManager {
	public Logger logger = LoggerFactory.getLogger(GenericAccessDecisionManager.class);

	@Resource
	private Properties configproperties;

	public boolean supports(ConfigAttribute attribute) {
		return true;
	}

	public boolean supports(Class<?> clazz) {
		return true;
	}

	@Override
	public void decide(Authentication arg0, Object arg1, Collection<ConfigAttribute> arg2)
			throws AccessDeniedException, InsufficientAuthenticationException {
		// TODO Auto-generated method stub
		
	}
}
