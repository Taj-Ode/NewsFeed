package server;

import express.Express;

import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) {

        Database db = new Database();
        Express app = new Express();


        app.listen(4000);
        System.out.println("Server started on port 4000");

        app.useStatic(Paths.get("src/www"));

    }
}
