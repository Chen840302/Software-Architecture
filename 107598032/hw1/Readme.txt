�ϥ�IDE:IntelliJ IDEA 2018.2.4 x64
��Ʈw:
  1.�ϥ�mysql��Ʈw
  2.��SQL��J�H�U�y�k
  CREATE DATABASE `course` DEFAULT CHARSET=utf8 COLLATE utf8_general_ci;
  CREATE TABLE `course_system` (
  	`id` int(10) NOT NULL AUTO_INCREMENT,
  	`name` varchar(30) NOT NULL,
  	`content` varchar(30) NOT NULL,
  	`member` varchar(30) NOT NULL,
  	`price` int(10) NOT NULL,
  	`notice` varchar(30) NOT NULL,
  	`remark` varchar(30) NOT NULL,
   	PRIMARY KEY (`id`)
  )
  3.�A��classSystem/src/main/java/dbconn/DbConn.java���b���K�X
�}�Ҭy�{:
  1.�}��IntelliJ->import project->{homework-root-path}/107598032/hw1/classSystem
  2.��ܨϥ�maven�}��
    dependency:jstl1.2�Bmysql-connector-java6.0.6�Bjavax.servlet-api3.1.0
  3.�I��k��maven����->Plugins->tomcat7->tomcat7:run
  4.�}�Һ�����Jlocalhost:8080/Main