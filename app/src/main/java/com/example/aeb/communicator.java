package com.example.aeb;


import com.google.gson.*;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class communicator {
    static class Pair<L, R> {
        private L l;
        private R r;

        public Pair() {
        }

        public Pair(L l, R r) {
            this.l = l;
            this.r = r;
        }

        public L getL() {
            return l;
        }

        public R getR() {
            return r;
        }

        public void setL(L l) {
            this.l = l;
        }

        public void setR(R r) {
            this.r = r;
        }
    }

    static class Level {
        public String problemTitle, problemDesc;
        public List<Pair> pairList;

        public Level() {
        }

        public Level(String title, String desc) {
            this.problemTitle = title;
            this.problemDesc = desc;
            this.pairList = new ArrayList<>();
            pairList.add(new Pair<String, String> ("ababababa", "bababababba"));
            pairList.add(new Pair<String, String> ("ababababa", "bababababba"));
        }

        public String getTitle () {
            return this.problemTitle;
        }

        public String getDesc () {
            return this.problemDesc;
        }

        public List<Pair> getTests () {
            return this.pairList;
        }
    }

    public static void cum() throws IOException {
        /*Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());

        List<Level> levels = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            levels.add(new Level("aboba", "abobo"));
        }

        File json = new File("levels.json");
        json.createNewFile();
        FileWriter wr = new FileWriter("levels.json");
        final Gson gson = new GsonBuilder().create();
        wr.write(gson.toJson(levels));
        wr.close();*/

        File json = new File("src/levels.json");

        String fileName = "src/levels.json";
        Path path = Paths.get(fileName);
        List<String> allLines = Files.readAllLines(path, StandardCharsets.UTF_8);

        System.out.println(allLines.get(0));

        final Gson gson = new GsonBuilder().create();
        Type typeOfLevel = new TypeToken<ArrayList<Level>>() {}.getType();
        List<Level> levels = gson.fromJson(allLines.get(0), typeOfLevel);

        json.createNewFile();
        FileWriter wr = new FileWriter("src/levels.json");
        wr.write(gson.toJson(levels));
        wr.close();

        System.out.println(levels.get(0).getDesc());
    }
}


