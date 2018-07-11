package com.kodilla.hibernate.tasklist;
import com.kodilla.hibernate.task.Task;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "TASKLISTS")
public final class TaskList {

        private int id;
        private String listName;
        private String description;
        private List<Task> tasks = new ArrayList<>();


    @OneToMany(
            targetEntity = Task.class,
            mappedBy = "taskList",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public TaskList() {
    }

    public TaskList(String listName, String description) {
        this.listName = listName;
        this.description = description;
    }

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

        public void setId(int id) {
            this.id = id;
        }

        @Column(name = "LISTNAME", unique = true)
        @NotNull
        public String getListName() {
            return listName;
        }

        public void setListName(String listName) {
            this.listName = listName;
        }

        public void setDescription(String description) {
            this.description = description;
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TaskList taskList = (TaskList) o;
        return id == taskList.id &&
                Objects.equals(listName, taskList.listName) &&
                Objects.equals(description, taskList.description);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, listName, description);
    }

    @Override
    public String toString() {
        return "TaskList{" +
                "id=" + id +
                ", listName='" + listName + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}

