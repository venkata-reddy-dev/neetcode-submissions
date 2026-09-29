class Solution {
    public boolean isValidSudoku(char[][] board) {
        var set = new HashSet<Integer>();

        for(int r=0;r<9;r++){
            for(int c=0; c<9;c++){
                if(Character.isDigit(board[r][c])){
                    var num=Character.getNumericValue(board[r][c]);
                    if(set.contains(num)){
                        return false;
                    }else{
                        set.add(num);
                    }
                };
            }
            set.clear();
        }

        for(int c=0;c<9;c++){
            for(int r=0; r<9;r++){
                if(Character.isDigit(board[r][c])){
                    var num=Character.getNumericValue(board[r][c]);
                    if(set.contains(num)){
                        return false;
                    }else{
                        set.add(num);
                    }
                };
            }
            set.clear();
        }

        for(int r=0;r<3;r++){
            for(int c=0;c<3;c++){
                for(int br=0;br<3;br++){
                    for(int bc=0;bc<3;bc++){
                        var rowIndex=(3*r)+ br;
                         var columnIndex = (3*c) + bc;
                         if(Character.isDigit(board[rowIndex][columnIndex])){
                            var num = Character.getNumericValue(board[rowIndex][columnIndex]);
                            if(set.contains(num)){
                                return false;
                            }else{
                                set.add(num);
                            }
                         }
                         
                    }
                }
                set.clear();
            }
        }

        return true;
    }
}
