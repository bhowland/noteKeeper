package com.example.notekeeper

class DataManager {
    val courses = HashMap<String, CourseInfo>()
    val notes = ArrayList<NoteInfo>()

    init {
        initializeCourses()
    }

    private fun initializeCourses() {
        var course = CourseInfo( "android_intents",  "Android Progamming with Intents" )
        courses.set( course.courseID, course)

        course = CourseInfo( "android_async",  "Android Async Progamming and Services" )
        courses.set( course.courseID, course)

        course = CourseInfo(   "java_lang",  "Java Fundamentals: The Java Language" )
        courses.set( course.courseID, course)

        course = CourseInfo(   "java_core",  "Java Fundamentals: The Core Platform" )
        courses.set( course.courseID, course)
    }
}