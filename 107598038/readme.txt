﻿程式執行環境:
  IDE使用: IntelliJ IDEA 2018.2.3 x64
  Project SDK： 1.8
  build tool 使用Maven
  DataBase使用： Mysql and Excel

設定DataBase：
  資料庫有MySQL與Excel兩種版本，為了方便老師檢查，目前使用Excel作為資料庫，無須任何設定。

開啟流程:
  1.開啟IntelliJ-> import project ->{homework-root-path}/107598038/HW1/  (HW1資料夾要展開)
  2.Import project from external model 選擇 Maven -> Next...
  3.finish後 IDE下方會跑讀取條，需等待一段下載時間
  4.選擇位於IDE右方的 Maven Projects
  5.開啟路徑 Plugins -> tomcat7 -> tomcat7:run
  6.左鍵點擊兩下 tomcat7:run
  7.IDE下方會有一些訊息跑出，滑鼠滾輪往上找到 [INFO] Running war on http://localhost:8080/ 該ROW，點擊該鏈結
  8.瀏覽器上即有執行畫面
  

備註:
  ※ 若跑出http status 404 找不到分頁的訊息，則把瀏覽器url改成 http://localhost:8080/CourseHome
  Maven dependency： 
	javax.servlet-api3.1.0、jstl1.2、
	mysql-connector-java8.0.11、
	tomcat7-maven-plugin2.2、
	commons-collections4.1、
	commons-compress1.18、
	poi4.0.1、
	poi-ooxml4.0.1、
	poi-ooxml-schemas4.0.1、
	xmlbean1.5.5
	