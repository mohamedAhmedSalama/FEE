#ifndef SCANNER_H_INCLUDED
#define SCANNER_H_INCLUDED


#include <fstream>
#include <iostream>
#include <cctype>
#include <string>
#include <map>

using namespace std;



extern string KeyWord[];
extern string Operator[];
extern string SpecialCharater[];
extern map<string, string> ToString;

string capitalize(const string& str);


bool IsKeyword(string str);
bool IsSpecialCharater(string str);
bool IsOperator(string str);

void Scanner(ifstream& inputFile);


#endif // SCANNER_H_INCLUDED
