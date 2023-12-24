#ifndef PARSER_H_INCLUDED
#define PARSER_H_INCLUDED

#include <iostream>
#include <vector>
#include <string>
#include <map>

enum TokenType {
    IF, ELSE, OPEN_BRACKET, CLOSE_BRACKET, OPEN_CURLY, CLOSE_CURLY, SEMICOLON,COLON, IDENTIFIER, NUMERIC, OPERATOR , WHILE , FOR , KEYWORD ,SWITCH ,CASE,DEFAULT,BREAK , END
};

extern std::map<TokenType, std::string> tokenTypeToString;

struct Token {
    TokenType type;
    std::string value;
};

class Parser {
private:
    std::vector<Token> tokens;
    size_t currentPosition;

    Token getNextToken();
    Token peekNextToken();
    void error(const std::string& message);
    void match(TokenType expected);
    void statement();
    void ifStatement();
    void whileStatement();
    void forStatement();
    void switchStatement();

public:
    Parser(const std::vector<Token>& inputTokens);
    void parse();
};

std::vector<Token> tokenizeInputFromFile(const std::string& filename);



#endif // PARSER_H_INCLUDED
