package dev.jbang;

@SuppressWarnings("serial")
public class DependencyException extends RuntimeException {

	public DependencyException(Exception e) {
		super(e);
	}

}
