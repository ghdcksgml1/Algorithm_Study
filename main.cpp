//
//  main.cpp
//  HelloWorld
//
//  Created by 홍찬희 on 8/5/21.
//

#include <iostream>
#include "employeestruct.h"

using namespace std;

auto addNumbers(int num1,int num2){
    std::cout << "Entering function "<<__func__ << '\n';
    return num1+num2;
}

int main(int argc, const char * argv[]) {
    // insert code here...
    cout<< addNumbers(1,3)<<'\n';;
    
    return 0;
}
