# Ecommerce

> Playground For Micro-Service Architecture

## 프로젝트 목표

- 대량의 트래픽 상황에서 동시성 문제 해결 방법에 대한 이해
- 서로 다른 서버에서 발생한 트랜잭션의 원자성을 보장할 수 있는 방법에 대한 이해

## 대량의 트래픽 상황에서의 동시성 문제 해결 방법들

### Select for Update

```sql
SELECT * FROM table WHERE id = 1 FOR UPDATE;
```

### Optimistic Locking

JPA `@OptimisticLocking`

### Distributed Locking

Zookeeper, Redis, MySQL

## 서로 다른 서버에서 발생한 트랜잭션의 원자성을 보장할 수 있는 방법들

### Two Phase Commit

### Kafka CDC

#### Eventual Consistency

### Saga Pattern
