#include <iostream>
#include <cctype>
#include <string>
#include <fstream>
#include <map>
using namespace std;

string KeyWord[] = {"for","while","do","if","else","else if","switch","case","default","break","int","char","string",
                  "double","float","long","long long","short","static","private","protected","public","return","const",
                  "continue","struct","enum","union","unsigned","signed","namespace"};

string Operator[] = {"=","+","-","++","--","*","/","<",">","==","<=",">=","!=","&","&&","|","||","^","~"};

string SpecialCharater[]={">>","<<","$","#","@","%","(",")","{","}","[","]",":",";","//"};


string capitalize(const string& str) {
    string capitalizedStr = str;

    for (char &c : capitalizedStr) {
        c = toupper(static_cast<unsigned char>(c));
    }

    return capitalizedStr;
}
map<string, string> ToString = {
    {"(","OPEN_BRACKET"},
    {")","CLOSE_BRACKET" },
    {"{","OPEN_CURLY"},
    {"}","CLOSE_CURLY"},
    {";","SEMICOLON"},
    {":","COLON"}
    // Add other token types
};

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

void Scanner(ifstream& inputFile){

string line;
    while (getline(inputFile, line)) {
        // Process each line of the file
        std::cout << line << std::endl; // For example, here we print each line
    }
}








