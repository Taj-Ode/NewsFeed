package com;

import express.Express;

import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) {

        Database db = new Database();
        Express app = new Express();

        app.get("/rest/articles/:articleId/:articleName",(request, response) -> {
            int articleId = Integer.parseInt(request.params("articleId"));
            String articleName = request.params("articleName");

            Articles article = db.getArticle(articleId,articleName);
            System.out.println(article + "successfully gotten");
            response.json(article);
        });

        app.post("/rest/articles/createArticle", (request, response) -> {
            Articles article = request.body(Articles.class);
            System.out.println(article + "created");
            db.createArticle(article);

        });

        app.listen(4000);
        System.out.println("Server started on port 4000");

        app.useStatic(Paths.get("src/www"));

    }
}
