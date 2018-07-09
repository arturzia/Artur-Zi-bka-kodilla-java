package com.kodilla.hibernate.task.dao;

import com.kodilla.hibernate.task.Task;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.Instant;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskDaoTestSuite {
    @Autowired
    private TaskDao taskDao;
    private static final String DESCRIPTION = "Test: Learn Hibernate";

    @Test
    public void testTaskDaoSave() {
        //Given
        Task task = new Task();
        task.setDescription(DESCRIPTION);
        task.setDuration(7);
        task.setCreated(Instant.now());
        taskDao.save(task);
        //When
        int id = task.getId();
        Optional<Task> readTask = taskDao.findById(id);
        //Then
        Assert.assertTrue(readTask.isPresent());
        Assert.assertEquals(task, readTask.get());



        //CleanUp
        taskDao.deleteById(id);
    }
}
