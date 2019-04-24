#include <stdio.h>
#include <stdlib.h>
#include <iostream>
#include <string.h>
#include <windows.h>
#include "modify_class_usecase.h"
#include "../db/db.h"

using namespace std;

void ModifyClassName(const string& sName, const string& sNewName){
    string strSql = "";

    strSql += "update class set name ='";
    strSql += sNewName;
    strSql += "' where name='";
    strSql += sName;
    strSql += "';";

    char* cErrMsg;
    int nRes = sqlite3_exec(pDB , strSql.c_str() ,0 ,0, &cErrMsg);
    if (nRes != SQLITE_OK){
        SetTextToRed();
        printf("�ק�ҵ{�W�٥���\: %s\n\n", cErrMsg);
        SetTextToNormal();
        //return false;
    }
    else{
        SetTextToGreen();
        printf("�ק�m%s�n�ҵ{�W�٦��\\: %s\n\n", sName.c_str(), sNewName.c_str());
        SetTextToNormal();
    }
    //return true;
}

void ModifyClassDescription(const string& sName, const string& sNewDescription){
    string strSql = "";

    strSql += "update class set description ='";
    strSql += sNewDescription;
    strSql += "' where name='";
    strSql += sName;
    strSql += "';";

    char* cErrMsg;
    int nRes = sqlite3_exec(pDB , strSql.c_str() ,0 ,0, &cErrMsg);
    if (nRes != SQLITE_OK){
        SetTextToRed();
        printf("�ק�ҵ{��������\: %s\n\n", cErrMsg);
        SetTextToNormal();
        //return false;
    }
    else{
        SetTextToGreen();
        printf("�ק�m%s�n�ҵ{�������\\: %s\n\n", sName.c_str(), sNewDescription.c_str());
        SetTextToNormal();
    }
    //return true;
}

void ModifyClassTarget(const string& sName, const string& sNewTarget){
    string strSql = "";

    strSql += "update class set target ='";
    strSql += sNewTarget;
    strSql += "' where name='";
    strSql += sName;
    strSql += "';";

    char* cErrMsg;
    int nRes = sqlite3_exec(pDB , strSql.c_str() ,0 ,0, &cErrMsg);
    if (nRes != SQLITE_OK){
        SetTextToRed();
        printf("�ק�ҵ{�A�ι�H����\: %s\n\n", cErrMsg);
        SetTextToNormal();
        //return false;
    }
    else{
        SetTextToGreen();
        printf("�ק�m%s�n�ҵ{�A�ι�H���\\: %s\n\n", sName.c_str(), sNewTarget.c_str());
        SetTextToNormal();
    }
    //return true;
}

void ModifyClassPrice(const string& sName, const string& sNewPrice){
    string strSql = "";

    strSql += "update class set price =";
    strSql += sNewPrice;
    strSql += " where name='";
    strSql += sName;
    strSql += "';";

    char* cErrMsg;
    int nRes = sqlite3_exec(pDB , strSql.c_str() ,0 ,0, &cErrMsg);
    if (nRes != SQLITE_OK){
        SetTextToRed();
        printf("�ק�ҵ{�w������\: %s\n\n", cErrMsg);
        SetTextToNormal();
        //return false;
    }
    else{
        SetTextToGreen();
        printf("�ק�m%s�n�ҵ{�w�����\\: %s\n\n", sName.c_str(), sNewPrice.c_str());
        SetTextToNormal();
    }
    //return true;
}

void ModifyClassAttention(const string& sName, const string& sNewAttention){
    string strSql = "";

    strSql += "update class set attention ='";
    strSql += sNewAttention;
    strSql += "' where name='";
    strSql += sName;
    strSql += "';";

    char* cErrMsg;
    int nRes = sqlite3_exec(pDB , strSql.c_str() ,0 ,0, &cErrMsg);
    if (nRes != SQLITE_OK){
        SetTextToRed();
        printf("�ק�ҵ{�`�N�ƶ�����\: %s\n\n", cErrMsg);
        SetTextToNormal();
        //return false;
    }
    else{
        SetTextToGreen();
        printf("�ק�m%s�n�ҵ{�`�N�ƶ����\\: %s\n\n", sName.c_str(), sNewAttention.c_str());
        SetTextToNormal();
    }
    //return true;
}

void ModifyClassNote(const string& sName, const string& sNewNote){
    string strSql = "";

    strSql += "update class set note ='";
    strSql += sNewNote;
    strSql += "' where name='";
    strSql += sName;
    strSql += "';";

    char* cErrMsg;
    int nRes = sqlite3_exec(pDB , strSql.c_str() ,0 ,0, &cErrMsg);
    if (nRes != SQLITE_OK){
        SetTextToRed();
        printf("�ק�ҵ{�Ƶ�����\: %s\n\n", cErrMsg);
        SetTextToNormal();
        //return false;
    }
    else{
        SetTextToGreen();
        printf("�ק�m%s�n�ҵ{�Ƶ����\\: %s\n\n", sName.c_str(), sNewNote.c_str());
        SetTextToNormal();
    }
    //return true;
}


