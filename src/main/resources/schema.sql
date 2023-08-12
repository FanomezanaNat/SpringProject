CREATE TABLE  Student (
                          id INT  PRIMARY KEY,
                          firstName VARCHAR(100) not null ,
                          lastName VARCHAR(100) not null ,
                          address varchar(250) not null ,
                          phoneNumber int ,
                          email varchar(200) not null ,
                          studyYear int
);
CREATE TABLE Fee (
                     id INT PRIMARY KEY,
                     year VARCHAR(5) not null,
                     type VARCHAR(30) not null,
                     amountPaid int not null,
                     paymentDate TIMESTAMP not null ,
                     paymentStatus VARCHAR(30) not null

)
