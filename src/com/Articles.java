package com;

public class Articles {
    private int article_id;
    private String name;
    private String content;

    public Articles() {
    }

    public Articles(int id) {
        this.article_id = id;
    }

    public Articles(int id, String name) {
        this.article_id = id;
        this.name = name;
    }

    public int getArticle_id() {
        return article_id;
    }

    public void setArticle_id(int article_id) {
        this.article_id = article_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Articles{" +
                "id=" + article_id +
                ", name='" + name + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
