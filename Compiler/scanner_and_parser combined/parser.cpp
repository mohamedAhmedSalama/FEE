#include "parser.h"
#include <fstream>

std::map<TokenType, std::string> tokenTypeToString = {
    {IF, "IF"},
    {FOR, "FOR"},
    {SWITCH, "SWITCH"},
    {CASE, "CASE"},
    {DEFAULT, "DEFAULT"},
    {BREAK,"BREAK"},
    {KEYWORD,"KEYWORD"},
    {WHILE,"WHILE"},
    {ELSE, "ELSE"},
    {OPEN_BRACKET, "OPEN_BRACKET"},
    {CLOSE_BRACKET, "CLOSE_BRACKET"},
    {OPEN_CURLY, "OPEN_CURLY"},
    {CLOSE_CURLY, "CLOSE_CURLY"},
    {SEMICOLON, "SEMICOLON"},
    {COLON, "COLON"},
    {IDENTIFIER, "IDENTIFIER"},
    {NUMERIC, "NUMERIC"},
    {OPERATOR, "OPERATOR"},
    {END, "END"}
};

Token Parser::getNextToken() {
    if (currentPosition < tokens.size()) {
        return tokens[currentPosition++];
    }
    return { END, "" };
}

Token Parser::peekNextToken() {
    if (currentPosition < tokens.size()) {
        return tokens[currentPosition];
    }
    return { END, "" };
}

void Parser::error(const std::string& message) {
    std::cout << "Error: " << message << " at position " << currentPosition << std::endl;
}

void Parser::match(TokenType expected) {
    Token currentToken = getNextToken();
    if (currentToken.type != expected) {
        std::string expectedTokenType = tokenTypeToString[expected];
        error("Unexpected token '" + currentToken.value + "'"+ " Expected Token is '" + expectedTokenType + "'");
    }
}

void Parser::statement() {
    if (peekNextToken().type == IF) {
        ifStatement();
    }else if (peekNextToken().type == WHILE) {
        whileStatement();
    }else if (peekNextToken().type == FOR) {
        forStatement();
    }else if (peekNextToken().type == SWITCH) {
        switchStatement();
    }else {
        error("Expected 'if' , 'while' , 'for' , or 'switch' statement");
    }
}

void Parser::ifStatement() {
    match(IF);
    match(OPEN_BRACKET);
    match(IDENTIFIER);
    match(OPERATOR);
    match(NUMERIC);
    match(CLOSE_BRACKET);
    match(OPEN_CURLY);
    match(IDENTIFIER);
    match(OPERATOR);
    match(NUMERIC);
    match(SEMICOLON);
    match(CLOSE_CURLY);

    if (peekNextToken().type == ELSE) {
        match(ELSE);
        if (peekNextToken().type == IF) {ifStatement();}
        else
        {
        match(OPEN_CURLY);
        match(IDENTIFIER);
        match(OPERATOR);
        match(NUMERIC);
        match(SEMICOLON);
        match(CLOSE_CURLY);
        }
    }

}

void Parser::whileStatement() {
    match(WHILE);
    match(OPEN_BRACKET);
    match(IDENTIFIER);
    match(OPERATOR);
    match(NUMERIC);
    match(CLOSE_BRACKET);
    match(OPEN_CURLY);
    match(IDENTIFIER);
    match(OPERATOR);
    match(NUMERIC);
    match(SEMICOLON);
    match(CLOSE_CURLY);
}



void Parser::forStatement() {
    match(FOR);
    match(OPEN_BRACKET);

    // Initialization part
    // Assuming initialization follows the pattern "int x = 0;"

    match(KEYWORD);
    match(IDENTIFIER);
    match(OPERATOR);
    match(NUMERIC);
    match(SEMICOLON);

    // Condition part
    match(IDENTIFIER);
    match(OPERATOR);
    match(NUMERIC);
    match(SEMICOLON);

    // Increment part
    match(IDENTIFIER);
    //match(OPERATOR);
    match(OPERATOR); // Assuming it's an increment operator (++ or +=)
    //match(NUMERIC);
    match(CLOSE_BRACKET);

    match(OPEN_CURLY);

    // Statement block inside the for loop
    // Assuming it contains increment and assignment operations

    match(IDENTIFIER);
    match(OPERATOR);
    match(IDENTIFIER);
    match(OPERATOR);
    match(NUMERIC);
    match(SEMICOLON);

    match(CLOSE_CURLY);
}

void Parser::switchStatement() {
    match(SWITCH);
    match(OPEN_BRACKET);
    match(IDENTIFIER);
    match(CLOSE_BRACKET);
    match(OPEN_CURLY);

    // Handle multiple cases and default
    while (peekNextToken().type == CASE || peekNextToken().type == DEFAULT) {
        if (peekNextToken().type == CASE) {
            match(CASE);
            // Handle case value, assuming it's a numeric value
            match(NUMERIC);
            match(COLON);

            // Handle case body
            // Assuming it contains an assignment or operation
            match(IDENTIFIER);
            match(OPERATOR);
            match(IDENTIFIER);
            match(OPERATOR);
            match(NUMERIC);
            match(SEMICOLON);
            match(BREAK);
            match(SEMICOLON); // Assuming a "break" statement at the end of each case
        } else if (peekNextToken().type == DEFAULT) {
            match(DEFAULT);
            match(COLON);

            // Handle default case body
            // Assuming it contains an assignment or operation
            match(IDENTIFIER);
            match(OPERATOR);
            match(IDENTIFIER);
            match(OPERATOR);
            match(NUMERIC);
            match(SEMICOLON);
        }
    }

    match(CLOSE_CURLY);
}



Parser::Parser(const std::vector<Token>& inputTokens) : tokens(inputTokens), currentPosition(0) {}

void Parser::parse() {
    statement();
    match(END);
}

std::vector<Token> tokenizeInputFromFile(const std::string& filename) {
    std::ifstream inputFile(filename);
    std::string tokenType,tokenValue;
    std::vector<Token> tokens;

     if (inputFile.is_open()) {
        while (inputFile >> tokenType >> tokenValue) {
            if (tokenType == "IF") {
            tokens.push_back({IF, tokenValue});
        }else if (tokenType == "WHILE") {
            tokens.push_back({WHILE, tokenValue});
        }else if (tokenType == "FOR") {
            tokens.push_back({FOR, tokenValue});
        }else if (tokenType == "ELSE") {
            tokens.push_back({ELSE, tokenValue});
        }else if (tokenType == "SWITCH") {
            tokens.push_back({ SWITCH, tokenValue });
        } else if (tokenType == "CASE") {
            tokens.push_back({ CASE, tokenValue });
        } else if (tokenType == "DEFAULT") {
            tokens.push_back({ DEFAULT, tokenValue });
        }else if (tokenType == "BREAK") {
            tokens.push_back({ BREAK, tokenValue });
        }else if (tokenType == "COLON") {
            tokens.push_back({ COLON, tokenValue });
        } else if (tokenType == "OPEN_BRACKET") {
            tokens.push_back({OPEN_BRACKET, tokenValue});
        } else if (tokenType == "CLOSE_BRACKET") {
            tokens.push_back({CLOSE_BRACKET, tokenValue});
        } else if (tokenType == "OPEN_CURLY") {
            tokens.push_back({OPEN_CURLY, tokenValue});
        } else if (tokenType == "CLOSE_CURLY") {
            tokens.push_back({CLOSE_CURLY, tokenValue});
        } else if (tokenType == "OPERATOR") {
            tokens.push_back({OPERATOR, tokenValue});
        }
        // else if (tokenValue == "=="||tokenValue == "!="||tokenValue == ">"||tokenValue == "<"||tokenValue == ">="||tokenValue == "<=") {
            //tokens.push_back({OPERATOR, tokenValue});
        //}
        else if (tokenType == "SEMICOLON") {
            tokens.push_back({SEMICOLON, tokenValue});
        }else if (tokenType == "KEYWORD") {
            tokens.push_back({KEYWORD, tokenValue});
        }else {
            // Assuming identifiers or numeric values
            if (tokenType == "NUMERIC") {
                tokens.push_back({NUMERIC, tokenValue});
            } else {
                tokens.push_back({IDENTIFIER, tokenValue});
            }
        }
    }


        tokens.push_back({ END, "" }); // $ End marker
        inputFile.close();
    }
    else {
        std::cout << "Unable to open file: " << filename << "\n";
    }

    return tokens;
}
