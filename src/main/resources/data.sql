DROP table if exists people;
create table people (
                        ID int,
                        NAME varchar,
                        AGE int,
                        HEIGHT int
) AS SELECT * from CSVREAD('C:\Users\Bogdan\MyProjects\h2-db-work-project\src\main\resources\data.csv',null,null)