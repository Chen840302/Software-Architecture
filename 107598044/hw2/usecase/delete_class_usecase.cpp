#include <stdio.h>
#include <stdlib.h>
#include <iostream>
#include <string.h>
#include <windows.h>
#include "delete_class_usecase.h"
#include "../db/db.h"

using namespace std;

void DeleteClass(const string& sName){
    string strSql = "";
    strSql += "delete from class where name='";
    strSql += sName;
    strSql += "';";

    char* cErrMsg;
    int nRes = sqlite3_exec(pDB , strSql.c_str() ,0 ,0, &cErrMsg);
    if (nRes != SQLITE_OK){
        SetTextToRed();
        printf("�R���ҵ{����\: %s\n", cErrMsg);
        SetTextToNormal();
        //return false;
    }
    else{
        SetTextToGreen();
        printf("�R���m%s�n�ҵ{���\\\n\n", sName.c_str());
        SetTextToNormal();
    }

    //return true;
}
