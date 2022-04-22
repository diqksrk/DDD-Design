package com.codestates.universitysystem.service;

import com.codestates.universitysystem.domain.Lecture;

import java.util.HashMap;
import java.util.List;

public class LectureService {

    public List<Lecture> lectures();

    public HashMap<String, String> createLecture();

    public HashMap<String, String> updateShowYnLecture();

    public HashMap<String, String> showLecture();

    public HashMap<String, String> giveStudentScore();

    public HashMap<String, String> saveLetctureContent();
}
