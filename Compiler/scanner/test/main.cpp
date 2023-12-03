/*
    Authors    : Mohamed Khairy El Sayed
                 Mohamed Ahmed Salama

    Date       : 25 NOV 2023

    Description: Compiler Scanner project
*/

#include <iostream>
#include <cctype>
#include <string>
using namespace std;

string KeyWord[] = {"for","while","do","if","else","else if","switch","case","default","break","int","char","string",
                  "double","float","long","long long","short","static","private","protected","public","return","const",
                  "continue","struct","enum","union","unsigned","signed","namespace"};

string Operator[] = {"=","+","-","++","--","*","/","<",">","==","<=",">=","!=","&","&&","|","||","^","~"};

string SpecialCharater[]={">>","<<","$","#","@","%","(",")","{","}","[","]",":",";","//"};

bool IsKeyword(string str)
{
    for(int i = 0 ; i < sizeof(KeyWord)/sizeof(KeyWord[0]) ; i++)
    {
        if(str==KeyWord[i])
            return true;
    }
    return false;
}

bool IsSpecialCharater(string str)
{
    for(int i = 0 ; i < sizeof(SpecialCharater)/sizeof(SpecialCharater[0]) ; i++)
    {
        if(str==SpecialCharater[i])
            return true;
    }
    return false;
}
bool IsOperator(string str)
{
    for(int i = 0 ; i < sizeof(Operator)/sizeof(Operator[0]) ; i++)
    {
        if(str==Operator[i])
            return true;
    }
    return false;
}

int main()
{

    cout << "Enter String :-\n";
    string input ; //"char string 15 for(int x=5;x<=10;x++;)z";
    getline(cin,input);
    int position = 0;

    while (position < input.length())
        {

        // Skip whitespace
        while (position < input.length() && isspace(input[position])) {
            position++;
        }

        if (position >= input.length()) {
            break; // End of input
        }

        // Check for integers
        if (isdigit(input[position]) || (input[position] == '.' && position + 1 < input.length() && isdigit(input[position + 1]))) {
            string result;
            while (position < input.length() && (isdigit(input[position]) || input[position] == '.' || input[position] == 'e' )) {
                result += input[position];
                position++;
            }
            cout << "Token: Numeric Constant, Value='" << result << "'\n";
        }

        // Check for identifiers
        else if (isalpha(input[position])) {
            string result;
            while (position < input.length() && (isalnum(input[position]) || input[position] == '_')) {
                result += input[position];
                position++;
            }
             if (IsKeyword(result)==true)
             {
                  cout << "Token: KeyWord, Value='" << result << "'\n";
             }
             else
             {
                  cout << "Token: Identifier, Value='" << result << "'\n";
             }

        }
        // Check for keyword
        else
            {
            string result;
            int len = 0;
            while ((((position < input.length()) && (!(isalnum(input[position]) || input[position] == '_'))) && (input[position] !=' ') && len<2))
            {
                result += input[position];
                position++;
                len++;
             if (IsSpecialCharater(result)==true)
             {

                  if(result=="//")
                  {
                        result="";
                        position = position-2;
                      while (position < input.length())
                      {

                          result+=input[position];
                          position++ ;
                      }
                      cout << "Token: Comment, Value='" << result << "'\n";

                  }
                  else
                    {
                        cout << "Token: Special Character, Value='" << result << "'\n";
                    }
                  break;
             }
            }
             if (IsOperator(result)==true)
             {
                  cout << "Token: Operator, Value='" << result << "'\n";
             }
//


        }
    }

    return 0;
}
