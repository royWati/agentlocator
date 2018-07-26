package com.chainbox.ussd.agentlocator.Services;

import com.chainbox.ussd.agentlocator.Entities.tb_thread;
import com.chainbox.ussd.agentlocator.DatabaseRepository.transcation_repo;
import com.chainbox.ussd.agentlocator.Entities.tb_transaction;
import com.chainbox.ussd.agentlocator.Notification.Success;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class transacion_service {

    private static thread_service threadService;

    @Autowired
    private  transcation_repo trans_repo;

    public  List<Success> add_transaction(tb_transaction transaction){
        trans_repo.save(transaction);

        String cell_id=transaction.getCell_id();
        String msisdn=transaction.getMsisdn();

        System.out.println("Cell ID:"+cell_id);
        System.out.println("msisdn"+msisdn);

        Success success=new Success(200,"transaction successful");
        List<Success> list=new ArrayList<>();
        list.add(success);

//        threadService.add_thread(new tb_thread(msisdn,cell_id));

        return list;
    }

    public List<tb_transaction> getAllTransactions(){
        List<tb_transaction> transactions=new ArrayList<>();
        trans_repo.findAll().forEach(transactions::add);

        return  transactions;
    }


}
