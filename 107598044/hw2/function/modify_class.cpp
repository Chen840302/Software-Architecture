#include <stdio.h>
#include <stdlib.h>
#include <iostream>
#include <string.h>
#include <windows.h>
#include "modify_class.h"
#include "../usecase/modify_class_usecase.h"
#include "../usecase/search_class_usecase.h"

using namespace std;

void modify_class()
{
    int modify;
    char name[100], aa[50], description[100], target[100], price[100], attention[100], note[100], newname[100], empty_class[5]="";
    printf("-----�ҵ{�s��-----\n\n");
    SelectClassName();
    SetTextToBlue();
    printf("�п�J���ק蠟�ҵ{: ");
    gets(name);
    SetTextToNormal();
    SelectCheckClassName(name);
    if (check_class_exist == 0)
    {
        RedMessage("�ҵ{���s�b�I");
        printf("\n");
    }
    else
    {
        modify = 0;
        while(modify!=7)
        {
            SelectClassOne(name);
            printf("1. �ק�m%s�n�ҵ{�W��\n", name);
            printf("2. �ק�m%s�n�ҵ{����\n", name);
            printf("3. �ק�m%s�n�ҵ{�A�X����H\n", name);
            printf("4. �ק�m%s�n�ҵ{�w��\n", name);
            printf("5. �ק�m%s�n�ҵ{�`�N�ƶ�\n", name);
            printf("6. �ק�m%s�n�ҵ{�Ƶ�\n", name);
            printf("7. ���}�s��Ҧ�\n");
            SetTextToBlue();
            printf("�п�J�W���ҹ������Ʀr: ");
            scanf("%d", &modify);
            gets(aa);
            switch (modify)
            {
            case 1:
                printf("�п�J���ק蠟�ҵ{�s�W��: ");
                gets(newname);
                if(strcmp (newname, empty_class) == 0)
                {
                    system("cls");
                    RedMessage("���~�A�ҵ{���o�d�šI");
                    break;
                }
                system("cls");
                ModifyClassName(name, newname);
                strcpy(name, newname);
                break;
            case 2:
                printf("�п�J���ק蠟�ҵ{�s����: ");
                gets(description);
                system("cls");
                ModifyClassDescription(name, description);
                break;
            case 3:
                printf("�п�J���ק蠟�ҵ{�s�A�X����H: ");
                gets(target);
                system("cls");
                ModifyClassTarget(name, target);
                break;
            case 4:
                printf("�п�J���ק蠟�ҵ{�s�w��: ");
                gets(price);
                system("cls");
                ModifyClassPrice(name, price);
                break;
            case 5:
                printf("�п�J���ק蠟�ҵ{�s�`�N�ƶ�: ");
                gets(attention);
                system("cls");
                ModifyClassAttention(name, attention);
                break;
            case 6:
                printf("�п�J���ק蠟�ҵ{�s�Ƶ�: ");
                gets(note);
                system("cls");
                ModifyClassNote(name, note);
                break;
            case 7:
                SetTextToNormal();
                break;
            default:
                RedMessage("��J���~�A�Э��s��J�I");
            }
        }
        system("cls");
    }

}
