package br.com.lucas.rest_with_spring_boot_and_java_erudio.__FirstSteepInJavaWithSpringBoot;

public class Greeting {
    private final Long id;
    private final String content;

    public String getContent() {
        return content;
    }

    public Long getId() {
        return id;
    }

    public Greeting(String content, Long id) {
        this.content = content;
        this.id = id;
    }
}
