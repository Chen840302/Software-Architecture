#include <stdio.h>
#include <stdlib.h>
#include <iostream>
#include <string.h>
#include <windows.h>
#include "delete_class.h"
#include "../usecase/delete_class_usecase.h"
#include "../usecase/search_class_usecase.h"

using namespace std;

void delete_class()
{
    char name[100], newname[100], minus_one[5]="-1";
    printf("-----�R���ҵ{-----\n\n");
    SelectClassName();
    SetTextToBlue();
    printf("�п�J�n�R�����ҵ{: ");
    gets(name);
    SetTextToNormal();
    SelectCheckClassName(name);
    if (check_class_exist == 0)
    {
        RedMessage("�ҵ{���s�b�I");
        printf("\n");
    }
    else if (check_class_exist == 1)
    {
        SelectClassOne(name);
        SetTextToBlue();
        printf("�Y�T�w�n�R���A�ЦA��J�@���ҦW�A�_�h��J-1���X: ");
        while (1)
        {
            gets(newname);
            if (strcmp (name, newname) == 0)
            {
                system("cls");
                DeleteClass(name);
                SetTextToNormal();
                break;
            }
            else if (strcmp (minus_one, newname) == 0)
            {
                system("cls");
                SetTextToNormal();
                break;
            }
            else
            {
                RedMessage("��J���~�I");
                SetTextToBlue();
                printf("�Y�T�w�n�R���A�ЦA��J�@���ҦW�A�_�h��J-1���X: ");
            }
        }
    }
}
