package org.garage.java.corejava.lang.pkg;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

final public class CreateImmutable {

	private String name;
	private int id;
	private Map m;

	public CreateImmutable(String name, int id, Map m) {
		this.name = name;
		this.id = id;
		this.m = m;
	}

	public CreateImmutable modify(String name, int id, Map m) {
		if (this.name == name && this.id == id && this.m == m) {
			return this;
		} else {
			return new CreateImmutable(name, id, m);
		}
	}

	@Override
	public String toString() {
		return "CreateImmutable [name=" + name + ", id=" + id + ", m=" + m + "]";
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public Map getM() {
		return new HashMap(m);
	//	return Collections.unmodifiableMap(m);
	//	return m;
	}

	
	
	
	
}
