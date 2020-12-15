package com.visusi.tracker.service.buisness;
import com.visusi.tracker.service.Entity.ExpenseEntity;
import com.visusi.tracker.service.dao.ExpensesDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.UUID;

@Service
public class ExpenseService {

    @Autowired
    public ExpensesDao expensesDao;

    @Transactional(propagation = Propagation.REQUIRED)
    public ExpenseEntity addExpense(ExpenseEntity expenseEntity) {
        expenseEntity.setUuid(UUID.randomUUID().toString());
        expenseEntity.setTransactionalDate(new Date());
        expenseEntity.setCreatedAt(ZonedDateTime.now());
        return expensesDao.saveExpense(expenseEntity);
    }

}
