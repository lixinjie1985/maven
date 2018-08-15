package org.eop.maven.dependencies;

public class JsonUser {

	public static void main(String[] args) {
		System.out.println(JsonWrapper.toJsonString(new User("love thinking")));
	}

}
