package com.testpackage.customscope;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;

import com.testpackage.customthreadlocal.CustomThreadLocal;

public class CustomScope implements Scope {

	Map<String, Object> scope;
	CustomThreadLocal customThreadLocal=new CustomThreadLocal();

	@SuppressWarnings("unchecked")
	@Override
	public Object get(String name, ObjectFactory<?> objectFactory) {
		scope = (Map<String, Object>) customThreadLocal.get();
		Object object = scope.get(name);
		if (object == null) {
			object = objectFactory.getObject();
			scope.put(name, object);
		}
		return object;

	}

	@Override
	public String getConversationId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void registerDestructionCallback(String arg0, Runnable arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public Object remove(String name) {
		return scope.remove(name);
	}

	@Override
	public Object resolveContextualObject(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

}
