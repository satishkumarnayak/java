package org.garage.java.corejava.lang.pkg;

final public class CreateImmutable {

	private String name;
	private int id;

	public CreateImmutable(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public CreateImmutable modify(String name, int id) {
		if (this.name == name && this.id == id) {
			return this;
		} else {
			return new CreateImmutable(name, id);
		}
	}
}
