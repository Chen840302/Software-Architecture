--------����w��---------
JDK: https://www.oracle.com/technetwork/java/javase/downloads/index.html(�n���i�H���Φw��)
Android Studio: https://developer.android.com/studio/index.html
�i��android studio �٦��U��gradle (���ǹq���|�۰ʦw��)�A�ڰO�o�L�����Xdialog�A���I�s���L�N���ڸ��n�F(�I���U��Build��tab�|�����ܪ��s��)
�U���n�骺�ѦҺ��}:https://ithelp.ithome.com.tw/articles/10200176?sc=iThelpR


--------����{��---------
HW1�ڨS����{�����ж��A�ҥHcode���b�U�������|
107598069\sa_hw\app\src\main\java\com\example\sa_hw

Code
����SQLite: CreateDB�BFeedReaderContract�BFeedReaderDbHelper
�{���D����: MainActivity
�s�W�@���ҵ{��ƪ�����: InfoData
�ק�@���ҵ{��ƪ�����: updateData
���F�n��ܦb�D������listView�W����k: MyCursorAdapter

����User�ϥΪ�View��XML���|�b:
107598069\sa_hw\app\src\main\res\layout
�D����: activity_main.xml
��ܷs�W��ƪ�����: activity_info_data.xml
��ܭק��ƪ�����: activity_update_data.xml
�w�qlistView���ˤl: activity_page2.xml

--------����run---------
�ڸդF�T�Ӥ覡�]�_�ڪ��{��:
1.�w�˵����� (�ڸդF�ܦh�q���A���ǭn�iBIOS�]�wVT-x enable�A�B���@�w���\)
  step1.
  Tool->AVD Manager->Create Virtual Device...->Category(phone)->(�ڬO��)Nexus 5X->Next->(�ڬO��)Pie �nDownload->Next->Finish

  step2.
  �w�˦n�N�i�H��Run->Run 'App'->����Q�w�˦n��������->OK
�q�`�@�}�l���������n�ظm��2mins

2.�ǿ�u�t���
  step1.����n���զ��}�o�H���Ҧ�
  step2.USB�����n�}��
  step3.����n�զ��ǿ��ɮ�(�D�ȥR�q)
  step4.Run->Run 'App'->��ۤv�����->OK

3.�ץX��apk
  step1.
  Build->Build Bundle(s)/APK(s)->Build APK(s)

  step2.
  �ئn��k�U���|���Ӵ��ܮءA���apk�b���Ӹ��|�U�A��'locate'

  step3.
  ��Ƨ����|���ӶץX��apk��
  
  step4.
  �ڧ�L��춳�ݡA�A�q����s���ݤU���U�ӡA�N�i�H����F

--------����ާ@�覡---------
�s�W�ҵ{: �n��J�@�ӽҵ{�W�٤���|�ťժ���(�s�W��|���^�D�����A���C�X�Ҧ��ҵ{�|�N���s�W���ҵ{���)
�R���ҵ{: ���I��ListView�A�I��R���ҵ{�A�Q������ҵ{�N�|�Q�R��
�ק�ҵ{: ���I��ListView�A�I��ק�ҵ{�A�|���X�n�Q�ק諸�ҵ{���e(�s�W��|���^�D�����A���C�X�Ҧ��ҵ{�|�N���ק諸�ҵ{���)
�C�X�Ҧ��ҵ{: �|�N�ҵ{���