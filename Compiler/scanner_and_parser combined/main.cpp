#include <iostream>
#include <cctype>
#include <string>
#include <fstream>

using namespace std;

#include "scanner.h"
#include "parser.h"




int main()
{

    ofstream outputFile("scanner_output.txt");

    if (outputFile.is_open()) { // Check if the file is opened successfully
        cout << "Outputting to scanner_output file...\n";
    } else
    {
        std::cerr << "Unable to open the file!\n";
    }



    string input="";
     input ="if ( x == 55 ) { mo = 20 ; } else if ( y >= 12) { id = 15 ; } else {id = 20;}";
     //input ="while ( x == 55 ) { mo = 20 ; }";
     //input ="for ( int x = 0; x < 10 ; x++) { mo = x + 20 ; }";
     //input = "switch (choice) {case 1:choice = choice * 2;break;case 2:choice = choice * 2;break;default:choice = choice - 1;}";


    //getline(cin,input);
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
            outputFile << "NUMERIC " << result <<"\n";
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
                  if(result=="if"||result=="else"||result=="else if"||result == "while"||result == "for"||result=="switch"||result == "case"||result == "default"||result == "break")
                  {
                    outputFile << capitalize(result) <<" " <<result <<"\n";
                  }
                  else
                    outputFile << "KEYWORD " << result <<"\n";
             }
             else
             {
                  outputFile << "IDENTIFIER " << result <<"\n";
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
                      outputFile << "Comment " << result <<"\n";


                  }
                  else
                    {
                         if(result==")"||result=="("||result=="{"||result=="}"||result==";"||result==":")
                            {
                            string resultType = ToString[result];
                            outputFile << resultType <<" " <<result <<"\n";
                            }
                        else
                            outputFile << "Special " << result <<"\n";


                    }
                  break;
             }
            }
             if (IsOperator(result)==true)
             {
                  outputFile << "OPERATOR " << result <<"\n";
             }
//


        }
    }outputFile.close();




    string filename = "scanner_output.txt";
    vector<Token> tokens = tokenizeInputFromFile(filename);

    //for (const auto& token : tokens) {
       // std::cout << token.type << " " << token.value << "\n";

    //}

    Parser parser(tokens);
    parser.parse();
     ofstream outputParser("parser_output.txt");

    if (outputParser.is_open()) { // Check if the file is opened successfully
        cout << "Outputting to Parser_Output File...\n";
    } else
    {
        std::cerr << "Unable to open the file!\n";
    }
    for (const auto& token : tokens) {
        outputParser<< token.type << " " << token.value << "\n";
    }
    return 0;
}
