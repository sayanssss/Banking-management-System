CREATE DATABASE bankmanagementsystem;
USE bankmanagementsystem;
CREATE TABLE signup (
    formno VARCHAR(20) PRIMARY KEY,
    name VARCHAR(50),
    fname VARCHAR(50),
    dob VARCHAR(20),
    gender VARCHAR(10),
    email VARCHAR(50),
    marital VARCHAR(20),
    address VARCHAR(100),
    city VARCHAR(30),
    pincode VARCHAR(10),
    state VARCHAR(30)
);
