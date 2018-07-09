package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    private static final String DESCRIPTION = "Test: Learn Hibernate";

    @Test
    public void testTaskDaoSave() {
        //Given
        TaskList taskList1 = new TaskList("ToDo", DESCRIPTION);
        TaskList taskList2 = new TaskList("InProgress", DESCRIPTION);
        TaskList taskList3 = new TaskList("Done", DESCRIPTION);

        taskListDao.save(taskList1);
        taskListDao.save(taskList2);
        taskListDao.save(taskList3);

        String listName = taskList2.getListName();
        int id = taskList3.getId();


        //When
        List<TaskList> readTaskList = taskListDao.findByListName(listName);
        Optional<TaskList> readTaskList2 = taskListDao.findById(id);

        //Then
        Assert.assertEquals(1, readTaskList.size());
        Assert.assertEquals(id, readTaskList2.get().getId());

        //CleanUp
        taskListDao.deleteAll();
    }

}