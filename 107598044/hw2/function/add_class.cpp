#include <stdio.h>
#include <stdlib.h>
#include <iostream>
#include <string.h>
#include <windows.h>
#include "add_class.h"
#include "../usecase/add_class_usecase.h"

using namespace std;

void add_class()
{
    char name[100], description[100], target[100], price[100], attention[100], note[100], newname[100], minus_one[5]="-1", empty_class[5]="";
    printf("-----�s�W�ҵ{-----\n\n");
    SetTextToBlue();
    printf("��J�ҵ{�W��: ");
    gets(name);
    SetTextToNormal();
    SelectCheckClassName(name);
    if (check_class_exist == 1)
    {
        RedMessage("�w�s�b�ۦP�W�٤��ҵ{�I");
        printf("\n");
    }
    else if (check_class_exist == 0 && strcmp (name, empty_class) == 0)
    {
        RedMessage("�ҵ{���o�d�šI");
        printf("\n");
    }
    else
    {
        SetTextToBlue();
        printf("��J�ҵ{����: ");
        gets(description);
        printf("��J�ҵ{�A�X����H: ");
        gets(target);
        printf("��J�ҵ{�w��: ");
        gets(price);
        printf("��J�ҵ{�`�N�ƶ�: ");
        gets(attention);
        printf("��J�ҵ{�Ƶ�: ");
        gets(note);
        SetTextToNormal();
        printf("\n[        �ҵ{�W��        ][        �ҵ{����        ][        �ҵ{��H        ][        �ҵ{�w��        ][        �`�N�ƶ�        ][        �ҵ{�Ƶ�        ]\n");
        printf(" ------------------------  ------------------------  ------------------------  ------------------------  ------------------------  ------------------------ \n");
        printf("%26s%26s%26s%26s%26s%26s\n", name, description, target, price, attention, note);
        SetTextToBlue();
        printf("\n�Y�T�w�n�s�W�A�ЦA��J�@���ҦW�A�_�h��J-1���X: ");
        while(1)
        {
            gets(newname);
            if (strcmp (name, newname) == 0)
            {
                system("cls");
                AddClass(name, description, target, price, attention, note);
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
                printf("�Y�T�w�n�s�W�A�ЦA��J�@���ҦW�A�_�h��J-1���X: ");
            }
        }
    }

}
