package com.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class CoursePaths {

    HashMap<Integer, String>    coursePath = new HashMap<>();
    String                      track      = "";
    List<String>                res        = new ArrayList<>();
    private int                 courses;

    private LinkedList<Integer> adj[];

    //

    CoursePaths(int courses) {
        this.courses = courses;
        adj = new LinkedList[courses];
        for (int i = 0; i < courses; ++i)
            adj[i] = new LinkedList();
    }

    void addPath(int course, int path) {
        adj[course].add(path);
    }

    List<String> individualCoursePaths(int course) {
        Iterator<Integer> i = adj[course].listIterator();
        if (i.hasNext()) {
            track = track + course + "-> ";
            coursePath.put(course, track);
        } else {
            coursePath.put(course, track + course);
            res.add((String) coursePath.get(course));
        }

        while (i.hasNext()) {
            int n = i.next();
            individualCoursePaths(n);
            track = (String) coursePath.get(course);
        }

        return res;
    }

    public static void main(String args[]) {
        int courses = 7;
        CoursePaths paths = new CoursePaths(courses);
        paths.addPath(0, 1);
        paths.addPath(0, 2);
        paths.addPath(1, 3);
        paths.addPath(1, 5);
        paths.addPath(2, 5);
        paths.addPath(6, 2);

        paths.individualCoursePaths(0);
        paths.track = "";
        paths.individualCoursePaths(4);
        paths.track = " ";

        List<String> res = paths.individualCoursePaths(6);
        System.out.println(res);
    }
}
