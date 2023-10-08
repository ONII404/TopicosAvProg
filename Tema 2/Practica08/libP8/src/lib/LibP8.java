package lib;

public class LibP8 {
    
    public int toDecNum(int indexRom){
        int DEC = 0;
        if(indexRom == 0){
            DEC = 1;
        }
        else if(indexRom ==1){
            DEC = 2;
        }
        else if(indexRom == 2){
            DEC = 3;
        }
        else if(indexRom == 3){
            DEC = 4;
        }
        else if(indexRom == 4){
            DEC = 5;
        }
        else if(indexRom == 5){
            DEC = 6;
        }
        else if(indexRom == 6){
            DEC = 7;
        }
        else if(indexRom == 7){
            DEC = 8;
        }
        else if(indexRom == 8){
            DEC = 9;
        }
        else if(indexRom == 9){
            DEC = 10;
        }
       return DEC;
    }

    public String toRomNum(int indexDec){
        String ROM = "";
        if(indexDec == 0){
            ROM = "I";
        }
        else if(indexDec == 1){
            ROM = "II";
        }
        else if(indexDec == 2){
            ROM = "III";
        }
        else if(indexDec == 3){
            ROM = "IV";
        }
        else if(indexDec == 4){
            ROM = "V";
        }
        else if(indexDec == 5){
            ROM = "VI";
        }
        else if(indexDec == 6){
            ROM = "VII";
        }
        else if(indexDec == 7){
            ROM = "VIII";
        }
        else if(indexDec == 8){
            ROM = "IX";
        }
        else if(indexDec == 9){
            ROM = "X";
        }

        return ROM;
    }
    
}
