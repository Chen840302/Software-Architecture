#include <stdio.h>
#include <stdlib.h>
#include <iostream>
#include <string.h>
#include <windows.h>
#include "./function/search_class.h"
#include "./function/add_class.h"
#include "./function/delete_class.h"
#include "./function/modify_class.h"

using namespace std;


//�W�[�ҵ{
void add_class();
void AddClass(const string& sName, const string& sDescription, const string& sTarget, const string& sPrice, const string& sAttention, const string& sNote);

//�R���ҵ{��
void delete_class();
void DeleteClass(const string& sName);

//�s��ҵ{
void modify_class();
void ModifyClassName(const string& sName, const string& sNewName);
void ModifyClassDescription(const string& sName, const string& sNewDescription);
void ModifyClassTarget(const string& sName, const string& sNewTarget);
void ModifyClassPrice(const string& sName, const string& sNewPrice);
void ModifyClassAttention(const string& sName, const string& sNewAttention);
void ModifyClassNote(const string& sName, const string& sNewNote);

//�M��ҵ{
void search_class();
void SelectClass();
void SelectClassOne(const string& sName);
void SelectClassName();
void SelectCheckClassName(const string& sName);

//�T���C��
void RedMessage(string message);
void SetTextToGreen();
void SetTextToRed();
void SetTextToBlue();
void SetTextToNormal();

int main()
{
    system("color F0");
    int input;
    char aa[50];
    while (1)
    {
        printf("1. �C�X�Ҧ��ҵ{\n");
        printf("2. �s�W�ҵ{\n");
        printf("3. �R���ҵ{\n");
        printf("4. �s��ҵ{\n");
        printf("5. ���}\n");
        SetTextToBlue();
        printf("�п�J�W���ҹ������Ʀr: ");
        scanf("%d", &input);
        gets(aa);
        system("cls");
        printf("�п�J�W���ҹ������Ʀr: %d\n\n", input);
        SetTextToNormal();
        switch (input)
        {
            case 1:
                search_class();
                break;
            case 2:
                add_class();
                break;
            case 3:
                delete_class();
                break;
            case 4:
                modify_class();
                break;
            case 5:
                return 0;
            default:
                RedMessage("��J���~�A�Э��s��J�I");
                printf("\n");
        }
    }
    return 0;
}

void RedMessage(string message)
{
    SetConsoleTextAttribute(GetStdHandle(STD_OUTPUT_HANDLE), BACKGROUND_RED | BACKGROUND_GREEN | BACKGROUND_BLUE | BACKGROUND_INTENSITY | FOREGROUND_RED);
    cout << message << endl;
    SetConsoleTextAttribute(GetStdHandle(STD_OUTPUT_HANDLE), BACKGROUND_RED | BACKGROUND_GREEN | BACKGROUND_BLUE | BACKGROUND_INTENSITY);
}

void SetTextToRed()
{
    SetConsoleTextAttribute(GetStdHandle(STD_OUTPUT_HANDLE), BACKGROUND_RED | BACKGROUND_GREEN | BACKGROUND_BLUE | BACKGROUND_INTENSITY | FOREGROUND_RED);
}

void SetTextToGreen()
{
    SetConsoleTextAttribute(GetStdHandle(STD_OUTPUT_HANDLE), BACKGROUND_RED | BACKGROUND_GREEN | BACKGROUND_BLUE | BACKGROUND_INTENSITY | FOREGROUND_GREEN);
}

void SetTextToNormal()
{
    SetConsoleTextAttribute(GetStdHandle(STD_OUTPUT_HANDLE), BACKGROUND_RED | BACKGROUND_GREEN | BACKGROUND_BLUE | BACKGROUND_INTENSITY);
}

void SetTextToBlue()
{
    SetConsoleTextAttribute(GetStdHandle(STD_OUTPUT_HANDLE), BACKGROUND_RED | BACKGROUND_GREEN | BACKGROUND_BLUE | BACKGROUND_INTENSITY | FOREGROUND_BLUE);
}
