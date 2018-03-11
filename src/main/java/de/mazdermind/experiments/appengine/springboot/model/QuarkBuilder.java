package de.mazdermind.experiments.appengine.springboot.model;

import java.util.UUID;

public final class QuarkBuilder {
	private UUID id;
	private String title;

	private QuarkBuilder() {
	}

	public static QuarkBuilder aQuark() {
		return new QuarkBuilder();
	}

	public QuarkBuilder withId(UUID id) {
		this.id = id;
		return this;
	}

	public QuarkBuilder withTitle(String title) {
		this.title = title;
		return this;
	}

	public Quark build() {
		Quark quark = new Quark();
		quark.setId(id);
		quark.setTitle(title);
		return quark;
	}
}
