#Library Management System (LMS)

#Developers 
1. Pranjal Bajaj
2. Om Makana

#Client 
Career Launcher, Bhilai

#Technology Used
Java, JDBC

#Tools Used 
1. Apache Server
2. MySql
3. NetBeans IDE.

#Project Description
LMS is a simple desktop app developed in java. It is equipped with all basic functionalities that a library requires in its day to day operations. It is developed in java and uses MySql database to store and fetch values. LMS makes use of Swing components for representation of data and JDBC for connectivity. 

#Functionalities:
1. Login and logout facilty.
2. Adding any person as a member by inserting the person's basic details.
3. Adding Books by providing Book name and author.
4. Book issuing facility with a time limit.
5. Deleting redundant members.
6. Deleting redundant books.

#Prereqisites
1. JDK 1.8
2. MySql server
3. Apache

#Connector Used
mysql-connector-java-5.1.35.jar

#Database
Database name - library

#Table Description
1. Table Name - member
   Schema - (sno, name, email_id, contact, book_issued, issue_date, return_date)
   sno - integer, auto-increment
   name, email_id, contact, book_issued, issue_date, return_date - varchar(100), default value = null

2. Table Name - book
   Schema - (bookname, author, status)
   bookname, author, status - varchar(100)

3. Table Name- password
   Schema - (username, password)
   username, password - varchar(100), ascii-binary
#NOTE: Please insert some initial values into password table.
#**All database name, table names, schema defination are all case sensitive and should be written in the same manner as above

#Limitations of LMS
1. Pressing enter doesn't work, so, you have to click the buttons to make it functional.
2. Prompting of values for text fields is supported.
3. JTable initially contains 20 rows, further rows isn't created dynamically so rows can be added only by changing code.
4. JTable representation is not aligined.

#Conclusion
LMS is open source and can be taken or distributed for further development. People can also use its jar file for accessing the present application.

#Thank You!
