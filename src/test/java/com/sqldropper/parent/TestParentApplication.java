package com.sqldropper.parent;

import org.springframework.boot.SpringApplication;

public class TestParentApplication {

	public static void main(String[] args) {
		SpringApplication.from(ParentApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
