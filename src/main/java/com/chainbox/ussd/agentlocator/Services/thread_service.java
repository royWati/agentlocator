package com.chainbox.ussd.agentlocator.Services;

import com.chainbox.ussd.agentlocator.Entities.tb_thread;
import com.chainbox.ussd.agentlocator.DatabaseRepository.thread_repo;
import org.springframework.beans.factory.annotation.Autowired;

public class thread_service {

    @Autowired
    private thread_repo thread_repo;

    public void add_thread(tb_thread thread){

        thread_repo.save(thread);
    }
}
