package com.testpackage.customthreadlocal;

import java.util.HashMap;
import java.util.Map;

public class CustomThreadLocal extends ThreadLocal<Object> {
@Override
protected Map<String, Object> initialValue() {
	return new HashMap<String, Object>();
}
}
