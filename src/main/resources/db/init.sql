CREATE DATABASE testdemo;

CREATE TABLE employees
(
    id       SERIAL PRIMARY KEY,
    name     VARCHAR(100),
    position VARCHAR(100)
);

INSERT INTO employees (name, position)
VALUES ('Alice', 'Developer'),
       ('Bob', 'Manager'),
       ('Charlie', 'Designer');