# ����
* IDE�GIntlliJ IDEA 2018.3.5 x64
* DataBase�GMySQL

# �`�N�ƶ�

* �������� MySQL �إ߸�Ʈw
* ���ۦ���Ʈw�U�إߦ����

* DataBase Schema
```
CREATE TABLE `coursesys` (
  `courseid` int(11) NOT NULL AUTO_INCREMENT,
  `coursename` varchar(45) NOT NULL,
  `courselevel` varchar(45) DEFAULT NULL,
  `courseprice` int(11) DEFAULT NULL,
  `coursedescription` varchar(45) DEFAULT NULL,
  `precautions` varchar(45) DEFAULT NULL,
  `remarks` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`courseid`)
) ENGINE=InnoDB AUTO_INCREMENT=51 DEFAULT CHARSET=utf8;

```

* ���ۦb Dbconn.java > �]�w��Ʈw`�W��`�H��`�b���P�K�X`

# �p��ϥ�

* IntelliJ > File > import > Software-Architecture/107598029/HW1

* Maven > Plugins > tomcat7 > `tomcat7:run`

* Open URL�Ghttp://localhost:8080