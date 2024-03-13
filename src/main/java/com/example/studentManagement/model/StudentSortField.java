package com.example.studentManagement.model;

public enum StudentSortField {//all the fields that sorting can be done with
    id("id") ,
    createdAt ("created_at"),
    fullName ("fullname"),
    birthDate ("birth_date"),
    satScore ("sat_score"),
    graduationScore ("graduation_score"),
    phone ("phone"),
    profilepicture ("profile_picture");

    public final String fieldName;
    private StudentSortField(String fieldName) {
        this.fieldName = fieldName;
    }
}