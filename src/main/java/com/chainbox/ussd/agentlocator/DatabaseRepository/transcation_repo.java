package com.chainbox.ussd.agentlocator.DatabaseRepository;

import com.chainbox.ussd.agentlocator.Entities.tb_transaction;
import org.springframework.data.repository.CrudRepository;

public interface transcation_repo extends CrudRepository<tb_transaction,Integer> {
}
