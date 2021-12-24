package com;

public class Images {
    private int id;
    private int articlesId;
    private String url;

    public Images() {
    }

    public Images(int id) {
        this.id = id;
    }

    public Images(int id, int articlesId) {
        this.id = id;
        this.articlesId = articlesId;
    }

    public Images(int id, int articlesId, String url) {
        this.id = id;
        this.articlesId = articlesId;
        this.url = url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getArticlesId() {
        return articlesId;
    }

    public void setArticlesId(int articlesId) {
        this.articlesId = articlesId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Images{" +
                "id=" + id +
                ", articlesId=" + articlesId +
                ", url='" + url + '\'' +
                '}';
    }
}
