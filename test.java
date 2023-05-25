public class test {

    private String input;
    private int point;
    private int bracketOpenCount;
    private int bracketCloseCount;

    public void switchCase(char c){
        switch(point){
            case 0:{
                switch(c){
                    case '1','2','3','4','5','6','7','8','9':{
                        point = 1;
                        break;
                    }
                    case '0':{
                        point = 2;
                        break;
                    }
                    case '+','-':{
                        point = 3;
                        break;
                    }
                    case 'x':{
                        point = 4;
                        break;
                    }
                    case '(':{
                        point = 6;
                        bracketOpenCount++;
                        break;
                    }
                    default: {
                        point = -1;
                        break;
                    }
                }
                break;
            }

            case 1:{
                switch(c){
                    case '0','1','2','3','4','5','6','7','8','9':{
                        point = 1;
                        break;
                    }
                    case '+','-','*','/':{
                        point = 3;
                        break;
                    }
                    case '^':{
                        point = 5;
                        break;
                    }
                    default:{
                        point = -1;
                        break;
                    }
                }
                break;
            }

            case 2:{
                switch (c) {
                    case '+','-','*','/':{
                        point = 3;
                        break;
                    }
                    case '^':{
                        point = 4;
                        break;
                    }
                    default:{
                        point = -1;
                        break;
                    }
                }
                break;
            }

            case 3:{
                switch (c) {
                    case '1','2','3','4','5','6','7','8','9':{
                        point = 1;
                        break;
                    }
                    case '0':{
                        point = 2;
                        break;
                    }
                    case 'x':{
                        point = 4;
                        break;
                    }
                    case '(':{
                        point = 6;
                        bracketOpenCount++;
                        break;
                    }
                    default:{
                        point = -1;
                        break;
                    }
                }
                break;
            }

            case 4:{
                switch (c) {
                    case '+','-','*','/':{
                        point = 3;
                        break;
                    }
                    case '^':{
                        point = 5;
                        break;
                    }
                    default:{
                        point = -1;
                        break;
                    }
                }
                break;
            }

            case 5:{
                switch(c){
                    case '(':{
                        point =6;
                        bracketOpenCount++;
                        break;
                    }
                    default:{
                        point = -1;
                        break;
                    }
                }
                break;
            }

            case 6:{
                switch(c){
                    case '0':{
                        point = 7;
                        break;
                    }
                    case '+','-':{
                        point = 8;
                        break;
                    }
                    case '1','2','3','4','5','6','7','8','9':{
                        point = 9;
                        break;
                    }
                    case 'x':{
                        point = 10;
                        break;
                    }
                    case'(':{
                        point = 6;
                        break;
                    }
                    default:{
                        point = -1;
                        break;
                    }
                }
                break;
            }

            case 7:{
                switch(c){
                    case '+','-','*','/':{
                        point = 8;
                        break;
                    }
                    case '^':{
                        point = 11;
                        break;
                    }
                    case ')':{
                        point = 12;
                        bracketCloseCount++;
                        break;
                    }
                    default:{
                        point = -1;
                        break;
                    }
                }
                break;
            }
            
            case 8:{
                switch(c){
                    case '0':{
                        point = 7; 
                        break;
                    }
                    case '1','2','3','4','5','6','7','8','9':{
                        point = 9;
                        break;
                    }
                    case 'x':{
                        point = 10;
                        break;
                    }
                    case '(':{
                        point = 6;
                        bracketOpenCount++;
                        break;
                    } 
                }
                break;
            }

            case 9:{
                switch(c){
                    case '0','1','2','3','4','5','6','7','8','9':{
                        point = 9;
                        break;
                    }
                    case '+','-','*','/':{
                        point = 8;
                        break;
                    }
                    case '^':{
                        point = 11;
                        break;
                    }
                    case ')':{
                        point = 12;
                        bracketCloseCount++;
                        break;
                    }
                    default:{
                        point = -1;
                        break;
                    }
                }
                break;
            }

            case 10:{
                switch(c){
                    case '+','-','*','/':{
                        point = 8;
                        break;
                    }
                    case '^':{
                        point = 11;
                        break;
                    }
                    case ')':{
                        point = 12;
                        bracketCloseCount++;
                        break;
                    }
                    default:{
                        point = -1;
                        break;
                    }
                }
                break;
            }

            case 11:{
                switch(c){
                    case '(':{
                        point = 6;
                        bracketCloseCount++;
                        break;
                    }
                    default:{
                        point = -1;
                        break;
                    }
                }
                break;
            }

            case 12:{
                switch (c) {
                    case '+','-','*','/':{
                        if(bracketCloseCount == bracketOpenCount) point = 3;
                        else point = 8;
                        break;
                    }
                }
                break;
            }
        }
    }

    public boolean checkInput(String input){
        point = 0;
        bracketCloseCount = 0;
        bracketOpenCount = 0;

        for(int i = 0; i < input.length(); i++){
            switchCase(input.charAt(i));
        }
        if(point ==-1) return false;
        if(point==1 || point == 12) return true;
        return false;
    }
}
