package com.visusi.tracker.service.Entity;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.ZonedDateTime;
import java.util.Date;

@Entity(name = "expenses")
public class ExpenseEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "details")
    @NotNull
    private String details;

    @Column(name = "transaction_amount")
    @NotNull
    private Double amount;

    @Column(name = "transaction_account")
    @NotNull
    private String account;

    @Column(name = "transaction_type")
    @NotNull
    private String transactionType;

    @Column(name = "uuid")
    @NotNull
    private String uuid;

    @Column(name="created_at")
    @NotNull
    private ZonedDateTime createdAt;

    @Column(name="transaction_date")
    @NotNull
    private Date transactionalDate;

    public int getId() {
        return id;
    }

    public ExpenseEntity setId(int id) {
        this.id = id;
        return this;
    }

    public String getDetails() {
        return details;
    }

    public ExpenseEntity setDetails(String details) {
        this.details = details;
        return this;
    }

    public Double getAmount() {
        return amount;
    }

    public ExpenseEntity setAmount(Double amount) {
        this.amount = amount;
        return this;
    }

    public String getAccount() {
        return account;
    }

    public ExpenseEntity setAccount(String account) {
        this.account = account;
        return this;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public ExpenseEntity setTransactionType(String transactionType) {
        this.transactionType = transactionType;
        return this;
    }

    public String getUuid() {
        return uuid;
    }

    public ExpenseEntity setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    public ZonedDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Date getTransactionalDate() {
        return transactionalDate;
    }

    public void setTransactionalDate(Date transactionalDate) {
        this.transactionalDate = transactionalDate;
    }

    @Override
    public String toString() {
        return "ExpenseEntity{" +
                "id=" + id +
                ", details='" + details + '\'' +
                ", amount=" + amount +
                ", account='" + account + '\'' +
                ", transactionType='" + transactionType + '\'' +
                ", uuid='" + uuid + '\'' +
                ", createdAt=" + createdAt +
                ", transactionalDate=" + transactionalDate +
                '}';
    }
}
