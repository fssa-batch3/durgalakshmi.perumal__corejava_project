package day09.practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

class Task implements Comparable<Task> {
    private int id;
    private String name;
    private LocalDate deadline;

    public Task(int id, String name, LocalDate deadline) {
        this.id = id;
        this.name = name;
        this.deadline = deadline;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    @Override
    public String toString() {
        return "Task [id=" + id + ", name=" + name + ", deadline=" + deadline + "]";
    }

    @Override
    public int compareTo(Task other) {
        return this.deadline.compareTo(other.deadline);
    }
}


