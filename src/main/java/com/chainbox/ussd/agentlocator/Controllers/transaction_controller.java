package com.chainbox.ussd.agentlocator.Controllers;

import com.chainbox.ussd.agentlocator.DatabaseRepository.transcation_repo;
import com.chainbox.ussd.agentlocator.Entities.tb_transaction;
import com.chainbox.ussd.agentlocator.Notification.Success;
import com.chainbox.ussd.agentlocator.Services.transacion_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class transaction_controller {

    @Autowired
    private transacion_service trans_service;

    @RequestMapping(method = RequestMethod.POST,value = "transaction/add")
    public List<Success> add_transcation(@RequestBody tb_transaction trans_data){

        return trans_service.add_transaction(trans_data);
    }
}
