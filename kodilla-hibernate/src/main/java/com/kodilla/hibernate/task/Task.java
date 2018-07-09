package com.kodilla.hibernate.task;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.Instant;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "TASKS")
public final class Task {
    private int id;
    private String description;
    private Instant created;
    private int duration;




    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    public int getId() {
        return id;
    }

    @Column(name = "DESCRIPTION")
    public String getDescription() {
        return description;
    }

    @NotNull
    @Column(name="CREATED")
    public Instant getCreated() {
        return created;
    }

    @Column(name="DURATION")
    public int getDuration() {
        return duration;
    }

    public void setId(int id) {
        this.id = id;
    }

   public void setDescription(String description) {
        this.description = description;
    }

    public void setCreated(Instant created) {
        this.created = created;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return id == task.id &&
                duration == task.duration &&
                Objects.equals(description, task.description) &&
                Objects.equals(created, task.created);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, description, created, duration);
    }
}
