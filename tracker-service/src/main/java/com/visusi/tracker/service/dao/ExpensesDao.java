package com.visusi.tracker.service.dao;
import com.visusi.tracker.service.Entity.ExpenseEntity;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class ExpensesDao {

    @PersistenceContext
    EntityManager entityManager;

    public ExpenseEntity saveExpense(ExpenseEntity expenseEntity) {
        entityManager.persist(expenseEntity);
        return expenseEntity;
    }
}
