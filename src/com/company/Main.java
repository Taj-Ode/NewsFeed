package com.company;

import express.Express;

public class Main {

    public static void main(String[] args) {

        Database db = new Database();
        Express app = new Express();


        app.listen(3000);
        System.out.println("Server started on port 3000");
    }
}
