�{����������:
  IDE�ϥ�: IntelliJ IDEA 2018.2.3 x64
  Project SDK�G 1.8
  build tool �ϥ�Maven
  DataBase�ϥΡG Mysql

�]�wDataBase�G
  1. �s�W�@�� Database schema �W�٬� sacms
  2. �s�W�@�Ӫ��, �W�٬� course_purpose
     --- Create Course Table SQL�G
     CREATE TABLE course_purpose (courseId int NOT NULL AUTO_INCREMENT, 
                                  courseName varchar(45) NOT NULL, 
                                  courseDetail varchar(45), 
                                  courseSuitPeople varchar(45), 
                                  coursePrice int(15), 
                                  courseNotes varchar(45), 
                                  courseRemark varchar(45), 
                                  PRIMARY KEY (courseId)
                                  ) ENGINE=InnoDB DEFAULT CHARSET=utf8 DEFAULT COLLATE=utf8_general_ci;

�}�Ҭy�{:
  1.�}��IntelliJ-> import project ->{homework-root-path}/107598045/hw1/  (hw1��Ƨ��n�i�})
  2.Import project from external model ��� Maven -> Next...
  3.finish�� IDE�U��|�]Ū�����A�ݵ��ݤ@�q�U���ɶ�
    
  4.�bsrc/main/java/dbconn/Dbcon.java
         ���U���Ѽ�
         private final String SACMS= "sacms"; //�z�إߪ�schema�W�١A
         private final String userName= "<�z��Database �b��>";
         private final String password = "<�z��Database �K�X>";

  5.��ܦ��IDE�k�誺 Maven Projects
  6.�}�Ҹ��| Plugins -> tomcat7 -> tomcat7:run
  7.�����I����U tomcat7:run
  8.IDE�U��|���@�ǰT���]�X�A�ƹ��u�����W��� [INFO] Running war on http://localhost:8080/ ��ROW�A�I�����쵲
  9.�s�����W�Y������e��
  

�Ƶ�:
  �� �Y�]�Xhttp status 404 �䤣��������T���A�h���s����url�令 http://localhost:8080/listAllCourses
  �Y�M�׵L�k�}�ҡA�нT�{��Ʈw�O�_�����T�إ�
  Maven dependency�G javax.servlet-api3.1.0�Bjstl1.2�Bmysql-connector-java8.0.11  �Btomcat7-maven-plugin 2.2