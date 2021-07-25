DROP table if exists people;
create table people (
                        ID int,
                        NAME varchar,
                        AGE int,
                        HEIGHT int
) AS SELECT * from CSVREAD('classpath:data.csv',null,null)