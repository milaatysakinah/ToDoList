package com.example.todolist.model;

public class ToDo {
    private String title;
    private String due_date;
    private String notes;
    private String status;

    public ToDo(String title, String due_date, String notes) {
        this.title = title;
        this.due_date = due_date;
        this.notes = notes;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDue_date() {
        return due_date;
    }

    public void setDue_date(String due_date) {
        this.due_date = due_date;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    public void showData(int[] data){
        for(int index = 0; index < data.length; index++){
            System.out.println("Ini adalah sebuah data " + index+1 + ": " + data[index]);
        }
    }


}
