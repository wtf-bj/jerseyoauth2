package com.github.hburgmeier.jerseyoauth2.testsuite.rs2.services;

import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.github.hburgmeier.jerseyoauth2.api.types.ParameterStyle;
import com.github.hburgmeier.jerseyoauth2.api.types.TokenType;
import com.github.hburgmeier.jerseyoauth2.authsrv.api.IConfiguration;
import com.github.hburgmeier.jerseyoauth2.authsrv.api.ScopeDescription;
import com.github.hburgmeier.jerseyoauth2.rs.api.IRSConfiguration;

public class Configuration implements IConfiguration, IRSConfiguration {

	private Map<String, ScopeDescription> scopeDescriptions = new HashMap<String, ScopeDescription>();
	private Set<String> defaultScope = new HashSet<>();
	
	public Configuration()
	{
		scopeDescriptions.put("test1", new ScopeDescription("test1", "Test Scope 1"));
		scopeDescriptions.put("test2", new ScopeDescription("test2", "Test Scope 2"));
		defaultScope.add("defaultScope");
	}
	
	@Override
	public long getTokenExpiration() {
		return 6;
	}

	@Override
	public Map<String, ScopeDescription> getScopeDescriptions() {
		return Collections.unmodifiableMap(scopeDescriptions);
	}

	@Override
	public Set<String> getDefaultScopes() {
		return defaultScope;
	}

	@Override
	public EnumSet<ParameterStyle> getSupportedOAuthParameterStyles() {
		return EnumSet.of(ParameterStyle.QUERY, ParameterStyle.HEADER);
	}

	@Override
	public boolean getStrictSecurity() {
		return false;
	}

	@Override
	public boolean getSupportAuthorizationHeader() {
		return false;
	}
	
	@Override
	public EnumSet<TokenType> getSupportedTokenTypes() {
		return EnumSet.of(TokenType.BEARER);
	}
	

}
