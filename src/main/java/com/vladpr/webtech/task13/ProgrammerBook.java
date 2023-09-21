package com.vladpr.webtech.task13;

public class ProgrammerBook extends Book {

    private String language;
    private int level;

    public ProgrammerBook(String title, String author, int price, String language, int level) {
        super(title, author, price);
        this.language = language;
        this.level = level;
    }

    @Override
    public String toString() {
        return String.format("[title='%s', author='%s', price='%d', language='%s', level='%d']", super.getTitle(), super.getAuthor(), super.getPrice(), language, level);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false;
        }
        if (obj instanceof ProgrammerBook book) {
            return this.language.equals(book.language)
                    && this.level == book.level;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return super.hashCode() + 7 * language.length() + 11 * level;
    }
}
